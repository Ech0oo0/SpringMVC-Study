package spring.proxy.learn03;

public class Client {
    public static void main(String[] args) {
        // 真实角色，rent接口实现类
        fangdong ManiuBi = new fangdong();

        // 创建代理调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用 程序处理角色（代理角色） 来处理我们要调用的接口对象
        pih.setRent(ManiuBi);
        // 生成代理类
        Rent proxy = (Rent) pih.getProxy();     // 这里的 “proxy” 就是动态生成的，通过return返回 new了一个代理实例，自动new完只需要类型转换就可以了
        proxy.rent();
    }
}
