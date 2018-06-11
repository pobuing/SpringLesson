package cn.probuing.dao;

import cn.probuing.bean.TUser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/11 14:28
 * @Description:
 */
public class TUserDaoImpl implements TUserDao {
    private JdbcTemplate jt;

    @Override
    public void save(TUser user) {
        String sql = "insert into t_user values(null,?)";
        jt.update(sql, user.getName());
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from t_user where id = ?";
        jt.update(sql, id);
    }

    @Override
    public void update(TUser user) {
        String sql = "update t_user set name = ? where id =?";
        jt.update(sql, user.getName(), user.getId());
    }

    @Override
    public TUser getById(Integer id) {
        String sql = "select * from t_user where id = ?";
        TUser tUser = jt.queryForObject(sql, new RowMapper<TUser>() {
            @Override
            public TUser mapRow(ResultSet resultSet, int i) throws SQLException {
                TUser tUser = new TUser();

                tUser.setId(resultSet.getInt("id"));
                tUser.setName(resultSet.getString("name"));
                return tUser;
            }
        }, id);
        return tUser;
    }

    @Override
    public int getTotalCount() {
        String sql = "select count(*) from t_user";
//        jt.q
        return 0;
    }

    @Override
    public List<TUser> getAllTUser() {
        return null;
    }
}
