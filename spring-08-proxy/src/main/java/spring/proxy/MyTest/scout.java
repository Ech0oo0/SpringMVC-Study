package spring.proxy.MyTest;

public class scout {
    public static void main(String[] args) {
        Sport SportImpl = new SportImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setSport(SportImpl);
        Sport proxy = (Sport) pih.getProxy();
        proxy.basketball();
    }
}
