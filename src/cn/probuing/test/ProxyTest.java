package cn.probuing.test;

import cn.probuing.proxy.UserService;
import cn.probuing.proxy.UserServiceImpl;
import cn.probuing.proxyself.UserServiceProxyFactory;
import org.junit.Test;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/8 10:50
 * @Description:
 */
public class ProxyTest {
    @Test
    public void fun1() {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxyFactory proxyFactory = new UserServiceProxyFactory(userService);

        UserService userServiceProxy = proxyFactory.getUserServiceProxy();
        userServiceProxy.save();
    }
}
