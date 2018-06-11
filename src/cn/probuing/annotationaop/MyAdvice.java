package cn.probuing.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//表示该类是一个通知类
@Aspect
public class MyAdvice {

    /**
     * 抽取切点
     */
    @Pointcut("execution(* cn.probuing.proxy..*ServiceImpl.*(..))")
    public void pc() {

    }

    //前置通知
//    |-目标方法运行之前调用
    @Before("MyAdvice.pc()")
    public void before() {
        System.out.println("这是前置通知(注解方式)");
    }

    //后置通知(如果出现异常)
//    |-在目标方法运行之后调用
    @AfterReturning("MyAdvice.pc()")
    public void afterReturning() {
        System.out.println("这是后置通知 出现异常不会调用(注解方式)");
    }

    //环绕通知
//    |-在目标方法之前和之后都调用
    @Around("MyAdvice.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知——之前(注解方式)");
        //调用目标方法
        Object proceed = pjp.proceed();
        int i = 1 / 0;
        System.out.println("环绕通知——之后(注解方式)");
        return proceed;
    }

    //异常拦截通知
//    |-出现异常，调用
    @AfterThrowing("MyAdvice.pc()")
    public void afterException() {
        System.out.println("出现异常(注解方式)");

    }

    @After("MyAdvice.pc()")
    public void afer() {
        System.out.println("后置通知，出现异常也会调用(注解方式)");
    }

}
