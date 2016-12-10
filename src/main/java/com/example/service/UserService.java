package com.example.service;

import com.example.entity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Studeng Service
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月12日
 */
@Service
public class UserService implements InitializingBean{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getList(){
        String sql = "SELECT * FROM STUDENT where `username` ='8629756'";
        return jdbcTemplate.query(sql, new RowMapper<User>(){

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setName(rs.getString("NAME"));
//                user.setMobile(rs.getString("mobile"));
                return user;
            }

        });
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        List<User> list = getList();
        for (User user : list) {
            System.out.println(user);
        }
    }
}