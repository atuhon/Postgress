package com.example.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.common.todo;

public interface TodoRepository {
	public List<todo> selectTodo();
	public int insertTodo(todo todo);
	

}
