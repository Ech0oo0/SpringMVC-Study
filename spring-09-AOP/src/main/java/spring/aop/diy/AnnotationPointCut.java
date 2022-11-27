package spring.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// 方式三：使用注解方式实现AOP
@Aspect     // 标注这个类为一个切面
public class AnnotationPointCut {
    @Before("execution(* spring.aop.learn.UserServiceImpl.*(..))")
    public void argsBefore() {
        System.out.println("=============方法执行前=============");
    }

    @After("execution(* spring.aop.learn.UserServiceImpl.*(..))")
    public void argsAfter() {
        System.out.println("=============方法执行后=============");
    }

    // JoinPoint接入点：用于获取切入点的信息
    @Around("execution(* spring.aop.learn.UserServiceImpl.*(..))")
    public void argsAround(ProceedingJoinPoint masaka) throws Throwable {
        System.out.println("环绕前");
        // .getSignature() 返回全限定方法名：void spring.aop.learn.UserService.add()
        System.out.println("Signature：" + masaka.getSignature());
        // 执行方法
        Object proceed = masaka.proceed();
        System.out.println("环绕后");

    }
}
