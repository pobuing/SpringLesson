package cn.probuing.test;

import cn.probuing.proxy.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/8 17:54
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/probuing/annotationaop/applicationContext.xml")
public class AopTest {
    @Resource(name = "userService")
    private UserService u;
    @Test
    public void fun1() {
        u.save();
    }
}
