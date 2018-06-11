package cn.probuing.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/7 09:45
 * @Description:
 */
@Component("car")
public class Car {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    @Value("BMW")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Value("green")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
