package spring.proxy.learn04;

import spring.proxy.learn03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 以下代码只是一个处理程序，处理程序不是代理类
// 自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类，听不懂算了，直接修改 target 就行了
    // Proxy.newProxyInstance(类加载器,代理的接口,InvocationHandler)
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        // 动态代理的本质，就是使用反射机制的实现
        // 通过invoke传递参数args执行rent方法
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg) {
        System.out.println("执行了:" + msg + "方法");
    }
}
