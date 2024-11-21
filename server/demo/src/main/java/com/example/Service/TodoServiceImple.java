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
		List<todo> list=todorepository.selectTodo();
		list.forEach(lists->System.out.println(lists));
	
		return todorepository.selectTodo();
	
		
		
	}

}
