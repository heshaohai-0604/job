
import org.entity.User;
import org.junit.Test;
import org.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:10
 * @Description: //TODO
 */
public class UserTest {
    @Test
    public void print(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("UserService");
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        user.setJob("软件开发");
        user.setSex(20);
        userService.add(user);
    }
}
