package com.example.Repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.common.todo;

@Repository
public class TodoRepositoryImple implements TodoRepository {
	@Autowired
	private final RowMapper<todo> tm;
	public TodoRepositoryImple(RowMapper<todo> tm) {
		super();
		this.tm = tm;
	}

	@Autowired
private JdbcTemplate jdbctemplate;
	
	private todo todo;


	

public List<todo> selectTodo() {

return jdbctemplate.query("SELECT * FROM todo", tm);

}


public int insertTodo(todo todo) {
	int rowNumber =jdbctemplate.update("INSERT INTO todo (title, description) VALUES (?, ?)",
		todo.getTitle(),todo.getDesc()
		);
	return rowNumber;
}

   
   

}
