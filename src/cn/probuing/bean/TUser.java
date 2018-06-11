package cn.probuing.bean;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/11 14:24
 * @Description:
 */
public class TUser {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
