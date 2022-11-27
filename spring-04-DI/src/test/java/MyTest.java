import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.DI.pojo.Student;
import spring.DI.pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
//        System.out.println(student.getName());
//        System.out.println(student.getAddress());
        System.out.println(student.toString());

        /*
        输出：
        Student{
            name='天朝',
            address=Address{address='东方明珠'},
            books=[《红楼梦》, 《西游记》, 《水浒传》, 《三国演义》],
            hobbys=[听歌, 敲代码, 看电影],
            card={
                身份证=12367829567283109887,
                银行卡=21838477589297489283
            },
            games=[LOL, COC, BOB],
            info={
                学号=20210928,
                班级=三年二班,
                姓名=周杰伦
            },
            wife='null'
        }
         */
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userBeans.xml");
        // 反射实例，在后面显示对象的类型就不用进行类型转换
        User user1 = applicationContext.getBean("userC", User.class);
        User user2 = applicationContext.getBean("userC", User.class);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1 == user2);     // 单例模式
    }
}
