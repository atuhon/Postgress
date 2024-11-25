package com.example.Service;

import java.util.List;

import com.example.common.todo;
import com.example.common.input.TodoInput;

public interface TodoService {
	public List<todo> todoservce();
	public int insertTodoData(TodoInput todoinput);

}
