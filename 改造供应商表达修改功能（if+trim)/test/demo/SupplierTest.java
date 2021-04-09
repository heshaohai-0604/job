import demo.dao.Supplierdao;
import demo.entity.Supplier;
import demo.util.SupplierUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hsh
 * @Date: 2021/4/7 20:04
 * @Description: //TODO
 */
@Slf4j
public class SupplierTest {

    @Test
    public void Test2(){
        SqlSession sqlSession = SupplierUtils.createSqlSession();
        Supplier supplier = new Supplier();
        supplier.setId(3);
        supplier.setCommodity("学习用品");
        int a = sqlSession.getMapper(Supplierdao.class).updateSupplier(supplier);
        sqlSession.commit();
        System.out.println(a);
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
