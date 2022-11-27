import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.autowired.Dog;
import spring.bean.autowired.Person;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = applicationContext.getBean("person",Person.class);
        person.getDog().shout();
        person.getCat().shout();
//        System.out.println(person);
        // 输出：
        //  wang~
        //  miao~
        //  Person{cat=spring.bean.autowired.Cat@7e0b0338, dog=spring.bean.autowired.Dog@617faa95, name='MasaKa'}
    }
}
