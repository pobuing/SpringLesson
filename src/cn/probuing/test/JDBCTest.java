package cn.probuing.test;

import cn.probuing.bean.TUser;
import cn.probuing.dao.TUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/11 17:52
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/probuing/dao/applicationContext.xml")
public class JDBCTest {
    @Resource(name = "userDao")
    private TUserDao ud;

    @Test
    public void fun1() {
        TUser tUser = new TUser();
        tUser.setName("hhh");
        ud.save(tUser);
    }

    @Test
    public void fun2() {
        TUser tUser = new TUser();
        tUser.setName("hdddhh");
        tUser.setId(61);
        ud.update(tUser);
    }
    @Test
    public void fun3() {
        System.out.println(ud.getTotalCount());
    }
    @Test
    public void fun4(){
        System.out.println(ud.getById(101));
    }
}
