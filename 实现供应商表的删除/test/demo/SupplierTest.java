import demo.dao.SupplierDao;
import demo.util.SupplierUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


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
        int a = sqlSession.getMapper(SupplierDao.class).deleteSuplier("4");
        sqlSession.commit();
        SupplierUtils.closeSqlSession(sqlSession);
    }
}
