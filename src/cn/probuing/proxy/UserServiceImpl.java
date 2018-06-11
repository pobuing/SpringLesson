package cn.probuing.proxy;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/8 10:42
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.printf("save");
    }

    @Override
    public void delete() {
        System.out.printf("delete");
    }

    @Override
    public void update() {
        System.out.printf("update");
    }

    @Override
    public void find() {
        System.out.printf("find");
    }
}
