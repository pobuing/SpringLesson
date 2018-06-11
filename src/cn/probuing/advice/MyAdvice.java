package cn.probuing.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/8 16:54
 * @Description:通知
 */
public class MyAdvice {
    //前置通知
//    |-目标方法运行之前调用
    public void before() {
        System.out.println("这是前置通知");
    }

    //后置通知(如果出现异常)
//    |-在目标方法运行之后调用
    public void afterReturning() {
        System.out.println("这是后置通知 出现异常不会调用");
    }

    //环绕通知
//    |-在目标方法之前和之后都调用
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知——之前");
        //调用目标方法
        Object proceed = pjp.proceed();
        System.out.println("环绕通知——之后");
        return proceed;
    }

    //异常拦截通知
//    |-出现异常，调用
    public void afterException() {
        System.out.println("出现异常");
    }

    public void afer() {
        System.out.println("后置通知，出现异常也会调用");
    }

}
