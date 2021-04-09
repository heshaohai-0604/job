package demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: hsh
 * @Date: 2021/4/7 21:11
 * @Description: //TODO
 */
public class SupplierUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {  //在静态代码块下，factory只会被创建一次
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession createSqlSession(){
        //false手动提交事务，true自动提交事务
        return sqlSessionFactory.openSession(false);
    }

    public static void closeSqlSession(SqlSession sqlSession){
        if(null != sqlSession){
            sqlSession.close();
        }
    }
}
