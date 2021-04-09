import demo.dao.OrderDao;
import demo.entity.Order;
import demo.util.SupplierUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 11:07
 * @Description: //TODO
 */
@Slf4j
public class OrderTest {
    @Test
    public void Test2(){
        List<Order> list = new ArrayList<Order>();
        Map<String,String> orderMap = new HashMap<String,String>();
        SqlSession sqlSession = null;
        try{
             sqlSession = SupplierUtils.createSqlSession();
            orderMap.put("ordername","支");
            list = sqlSession.getMapper(OrderDao.class).selectOrder(orderMap);
            log.info(list.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            SupplierUtils.closeSqlSession(sqlSession);
        }


    }
}
