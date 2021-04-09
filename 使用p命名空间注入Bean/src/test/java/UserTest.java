import org.entity.User;
import org.junit.Test;
import org.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 13:40
 * @Description: //TODO
 */
public class UserTest {
    @Test
    public void print(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("UserService");
        User user = new User();
        user.setName("李四");
        user.setAge(20);
        user.setJob("搬砖");
        userService.addUser(user);
    }
}
