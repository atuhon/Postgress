package com.example.TodoController;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.TodoService;
import com.example.common.todo;

@Controller
@RequestMapping("/todo")
public class TodoController {
	private final TodoService todoservice;

	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	@GetMapping("/select")
	public String Todoselect(Model model) {
		List<todo> list=todoservice.todoservce();
		list.forEach(lists->System.out.println(lists));
		
		
		model.addAttribute("list",list);
		return "Todo";
	}
	
	
	

}
