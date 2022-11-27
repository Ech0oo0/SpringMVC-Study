import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.appConfig.autowired.config.masakaConfig;
import learn.appConfig.autowired.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(masakaConfig.class);
        User masaka = (User) context.getBean("masaka");
        System.out.println(masaka);
        System.out.println(masaka.getName());
    }
}
