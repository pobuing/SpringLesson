package cn.probuing.component;

import cn.probuing.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/7 16:40
 * @Description:
 */
public class ComponentDemo {
    @Test
    public void fun1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);

    }
}
