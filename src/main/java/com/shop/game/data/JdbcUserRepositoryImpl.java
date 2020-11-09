/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.game.data;

import com.shop.game.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mrebrov
 */
@Repository
public class JdbcUserRepositoryImpl implements UserRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcUserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<User> findAll() {
        return jdbcTemplate.query("select * from \"user\"", this::mapRowToUser);
    }

    @Override
    public User findOne(String id) {
        return jdbcTemplate.queryForObject("select * from \"user\" where id = ?",
                this::mapRowToUser, id);
    }

    @Override
    public User save(User user) {
        jdbcTemplate.update("insert into \"user\" values(?, ?, ?)",
                user.getId(),
                user.getName(),
                user.getAge()
        );
        return user;
    }

    private User mapRowToUser(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age")
        );
    }

}
