package spring.annotation.learn.pojo;

import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="spring.annotation.learn.pojo.User"/>
// @Component 组件
@Component
public class User {
    public String name="天朝";
}
