package cn.probuing.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/5 11:50
 * @Description:
 */
//component(名称) 指定注解的类在spring中的名称
//<bean name="user" class="xxx"></bean>
@Component("user")
//@Service("user")//service层
//@Repository("user")//dao层
//@Controller("user")//web层
public class User {
    private String name;
    private Integer age;
    @Resource(name = "car")
    private Car car;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    @Value("JACK")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 在对象创建后调用 相当于init-method
     */
    @PostConstruct
    public void init() {
        System.out.println("user初始化");
    }

    /**
     * 在销毁方法之前调用
     */
    @PreDestroy
    public void destroy() {
        System.out.println("user销毁");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
