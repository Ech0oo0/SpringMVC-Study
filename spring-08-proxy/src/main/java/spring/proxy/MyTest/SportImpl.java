package spring.proxy.MyTest;

public class SportImpl implements Sport{
    public void badminton() {
        System.out.println("我在中国打羽毛球！");
    }

    public void basketball() {
        System.out.println("我在美国校队打篮球！");
    }

    public void football() {
        System.out.println("我在巴西踢足球！");
    }

    public void tennis() {
        System.out.println("我在法国打网球！");
    }
}
