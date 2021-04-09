import demo.p.Use;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 16:32
 * @Description: //TODO
 */
public class UseTest {
    @Test
    public void print(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Use use = (Use)context.getBean("use");
        System.out.println(use.toString());
    }

}
