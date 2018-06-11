package cn.probuing.test;

import cn.probuing.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/5 14:17
 * @Description:
 */
public class HelloSpring {
    @Test
    public void fun1() {
        //创建容器对象 传入配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //向容器要User对象 填写配置中对象的名字
        User user = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");
        User user3 = (User) ac.getBean("user");
        User user4 = (User) ac.getBean("user");
        User user5 = (User) ac.getBean("user");
        User user6 = (User) ac.getBean("user");
        //操作User对象
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println(user2 == user5);

    }

    @Test
    public void fun2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/probuing/createobj/applicationContext.xml");
        User user2 = (User) ac.getBean("user2");
        System.out.println(user2.toString());
    }

    @Test
    public void fun3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/probuing/createobj/applicationContext.xml");
        User user3 = (User) ac.getBean("user");
        System.out.println(user3.toString());
    }
    @Test
    public void fun4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user3 = (User) ac.getBean("user3");
        System.out.println(user3.toString());
    }
}
