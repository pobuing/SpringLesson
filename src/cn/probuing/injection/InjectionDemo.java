package cn.probuing.injection;

import cn.probuing.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/6 12:05
 * @Description:
 */
public class InjectionDemo {
    @Test
    public void fun1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void fun2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user2");
        System.out.println(user);
    }

    @Test
    public void fun3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user4");
        System.out.println(user);
    }

    @Test
    public void fun4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean user = (CollectionBean) ac.getBean("cb");
        System.out.println(user);
    }
}
