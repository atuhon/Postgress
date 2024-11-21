package com.example.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.common.Users;

import jakarta.el.Expression;


@Repository
public class UserRepoImple implements UserRepository{

	private JdbcTemplate jdbctemplate;
    public UserRepoImple(JdbcTemplate jdbcTemplate) {
        this.jdbctemplate = jdbcTemplate;
    }
	


	public void insertData() {
		System.out.println("tes");
		try {
			
		Users user=jdbctemplate.queryForObject("SELECT * FROM \"Users\" where id=?",
				(rs,num)->new Users(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("password")
						),3);
		System.out.println(user);
		}catch(Exception e) {
			System.out.println(e);
		}
				}

};



    

