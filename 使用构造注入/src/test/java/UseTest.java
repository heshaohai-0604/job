import demo.Use;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 16:00
 * @Description: //TODO
 */
public class UseTest {
    @Test
    public void usetest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Use use = (Use)context.getBean("use");
        use.print();
    }
}
