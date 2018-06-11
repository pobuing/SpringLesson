package cn.probuing.proxyself;

import cn.probuing.proxy.UserService;
import cn.probuing.proxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/8 10:44
 * @Description: 代理工厂
 */
public class UserServiceProxyFactory implements InvocationHandler {
    private UserService us;

    public UserServiceProxyFactory(UserService us) {
        this.us = us;
    }

    public UserService getUserServiceProxy() {
        //生成动态代理
        UserService userProxy = (UserService) Proxy.newProxyInstance(UserServiceProxyFactory.class.getClassLoader(), UserServiceImpl.class.getInterfaces(),
                this);
        //返回代理对象
        return userProxy;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用业务方法前操作
        System.out.printf("打开事物");
        //正常调用业务方法
        Object invoke = method.invoke(us, args);
        System.out.printf("提交事物");
        return invoke;
    }
}
