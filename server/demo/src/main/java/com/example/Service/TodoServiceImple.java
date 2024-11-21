package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Repository.TodoRepository;
import com.example.common.todo;

@Service
public class TodoServiceImple implements TodoService{
	private final TodoRepository todorepository;
	
	
	public TodoServiceImple(TodoRepository todorepository) {
		super();
		this.todorepository = todorepository;
	}


	public List<todo> todoservce() {
		return todorepository.selectTodo();
	
		
		
	}

}
