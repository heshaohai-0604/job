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
        List<Supplier> list = new ArrayList<Supplier>();
        SqlSession sqlSession = SupplierUtils.createSqlSession();
        Supplier supplier = new Supplier();
        supplier.setAddress("浙");
        list = sqlSession.getMapper(SupplierDao.class).selectSupplier(supplier);
        log.info(list.toString());
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
