import demo.dao.OrderDao;
import demo.entity.Order;
import demo.util.SupplierUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        SqlSession sqlSession = SupplierUtils.createSqlSession();
        Order order = new Order();
        order.setOrdername("支");
        list = sqlSession.getMapper(OrderDao.class).selectOrder(order);
        log.info(list.toString());
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
