package test.com.springdemo;

import com.springdemo.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hsh
 * @Date 15:13 2021/4/8
 * @Param 
 * @return 
 * @Description //TODO 
 **/
public class HelloSpringTest {

    @Test
    public void helloSpring(){
        //通过ClassPathXmlapplicationContext实例化Spring的上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过ApplicationContext的getBean()方法，根据id获取bean的实例
        HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
       //执行print（）方法
        helloSpring.print();
    }

}
