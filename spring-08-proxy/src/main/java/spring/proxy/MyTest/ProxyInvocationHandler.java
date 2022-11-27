package spring.proxy.MyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Sport sport;

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), sport.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        crow(method.getName());
        Object result = method.invoke(sport, args);
        return result;
    }

    public void crow(String sport) {
        System.out.println("你干嘛~！我想要" + sport);
    }
}
