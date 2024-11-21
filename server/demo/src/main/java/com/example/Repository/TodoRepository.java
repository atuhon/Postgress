package com.example.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.common.todo;

@Repository
public interface TodoRepository {
	public List<todo> selectTodo();
	

}
