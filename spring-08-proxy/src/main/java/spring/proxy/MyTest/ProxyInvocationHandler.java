package spring.proxy.MyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    // 代理接口（中介）
    private Sport sport;

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    // 生成代理类，并调用invoke
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), sport.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        crow(method.getName());
        // 通过反射实现动态代理（在这一步sport已经注入真实对象）
        Object result = method.invoke(sport, args);
        return result;
    }

    public void crow(String sport) {
        System.out.println("你干嘛~！我想要" + sport);
    }
}
