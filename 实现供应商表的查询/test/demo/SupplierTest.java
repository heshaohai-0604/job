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
    public void Test1() throws IOException {
        List<Supplier> list = new ArrayList<Supplier>();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        list = sqlSession.getMapper(SupplierDao.class).selectSupplier();
        log.info(list.toString());
        sqlSession.close();
    }

    @Test
    public void Test2(){
        List<Supplier> list = new ArrayList<Supplier>();
        SqlSession sqlSession = SupplierUtils.createSqlSession();
        list = sqlSession.getMapper(SupplierDao.class).selectSupplier();
        log.info(list.toString());
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
