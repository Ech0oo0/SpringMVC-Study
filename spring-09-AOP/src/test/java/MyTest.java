import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.learn.UserService;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注意点：动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();
    }
}
