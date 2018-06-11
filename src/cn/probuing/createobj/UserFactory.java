package cn.probuing.createobj;

import cn.probuing.bean.User;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/6 10:24
 * @Description: 用户工厂
 */
public class UserFactory {
    public static User createUser() {
        System.out.println("静态工厂创建User");
        return new User();
    }

    public User createUser2() {
        System.out.println("静态工厂创建User2");
        return new User();

    }
}
