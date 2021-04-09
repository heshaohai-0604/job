import demo.dao.SupplierDao;
import demo.entity.Supplier;
import demo.util.SupplierUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
        supplier.setSupplier("李四集团");
        supplier.setAddress("黑龙江");
        supplier.setCommodity("学习物品");
        int a = sqlSession.getMapper(SupplierDao.class).addSuplier(supplier);
        sqlSession.commit();
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
