package cn.probuing.junit;

import cn.probuing.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/7 17:34
 * @Description:
 */
//帮我们创建容器，并调用指定class的方法
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitDemo {
    //获得Spring管理的对象
    @Resource(name = "user")
    private User u;
    @Test
    public void fun1() {
        System.out.println(u);

    }
}
