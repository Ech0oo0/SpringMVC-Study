import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.create.learn.User;
import spring.create.learn.UserT;

public class MyTest {
    public static void main(String[] args) {
        // Spring容器。类似于婚介网站！托管于Spring的Bean在注册的时候就已经实例化完毕，需要调用的时候直接getBean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 内存中只有一份实例，指向的都是同一个对象
        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user == user2);    // 返回true。

        // 别名
        User userAlias = (User) applicationContext.getBean("userAlias");
        UserT userT = (UserT) applicationContext.getBean("userTAlias");
        UserT userT2 = (UserT) applicationContext.getBean("userTAlias2");

        user.show();
        userAlias.show();
        userT.show();
        userT2.show();
    }
}
