package spring.create.learn;

public class User {
    private String name;

    //    // 无参构造默认存在（隐式）
//    public User() {
//        System.out.println("User的无参构造！");
//    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
