package cn.probuing.dao;

import cn.probuing.bean.TUser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/6/11 14:28
 * @Description:
 */
public class TUserDaoImpl extends JdbcDaoSupport implements TUserDao {

    @Override
    public void save(TUser user) {
        String sql = "insert into t_user values(null,?)";
        super.getJdbcTemplate().update(sql, user.getName());
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from t_user where id = ?";
        super.getJdbcTemplate().update(sql, id);
    }

    @Override
    public void update(TUser user) {
        String sql = "update t_user set name = ? where id =?";
        super.getJdbcTemplate().update(sql, user.getName(), user.getId());
    }

    @Override
    public TUser getById(Integer id) {
        String sql = "select * from t_user where id = ?";
        TUser tUser = super.getJdbcTemplate().queryForObject(sql, new RowMapper<TUser>() {
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
        Integer count = super.getJdbcTemplate().queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<TUser> getAllTUser() {
        String sql = "select * from t_user";
        List<TUser> query = super.getJdbcTemplate().query(sql, new RowMapper<TUser>() {
            @Override
            public TUser mapRow(ResultSet resultSet, int i) throws SQLException {
                TUser tUser = new TUser();

                tUser.setId(resultSet.getInt("id"));
                tUser.setName(resultSet.getString("name"));
                return tUser;
            }
        });
        return query;
    }
}
