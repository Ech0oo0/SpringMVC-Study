import com.Echo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 我们的对象现在都在Spring容器中管理了，我们要使用，直接去里面取出来就可以了！
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.toString());
    }
}
