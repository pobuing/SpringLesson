package cn.probuing.dao;

import cn.probuing.bean.TUser;

import java.util.List;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/11 14:24
 * @Description:
 */
public interface TUserDao {
    //增
    void save(TUser user);
    //删除
    void delete(Integer id);
    //改
    void update(TUser user);
    //查
    TUser getById(Integer id);

    int getTotalCount();

    List<TUser> getAllTUser();
}
