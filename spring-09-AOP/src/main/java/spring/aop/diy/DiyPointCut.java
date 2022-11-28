package spring.aop.diy;

public class DiyPointCut {
    public void argsBefore(){
        System.out.println("==============方法执行前==============");
    }
    public void argsAfter(){
        System.out.println("==============方法执行后==============");
    }
}
