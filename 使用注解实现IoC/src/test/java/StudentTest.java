import org.entity.Student;
import org.junit.Test;
import org.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 16:54
 * @Description: //TODO
 */
public class StudentTest {
    @Test
    public void talk(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService)context.getBean("studentService");
        Student student = new Student();
        student.setName("小白");
        student.setAge(20);
        student.setSid(13);
        studentService.addStudent(student);
    }
}
