package com.example.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.common.todo;
@Component
public class TodoMapper implements RowMapper<todo> {

	@Override
	public todo mapRow(ResultSet rs, int rowNum) throws SQLException {
   todo td=new todo(
			rs.getInt("id"),
			rs.getString("title"),
			rs.getString("description")
		   );
		// TODO Auto-generated method stu
		return td;
	}

}
