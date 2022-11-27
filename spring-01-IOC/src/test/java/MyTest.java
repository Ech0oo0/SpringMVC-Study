import com.Echo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        // 用户实际调用的是业务层，DAO层他们实际不需要接触
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        // 获取ApplicationContext：拿到 Spring 的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取到容器，容器在手需要什么就直接 get
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        System.out.println(userService.toString());

    }
}
