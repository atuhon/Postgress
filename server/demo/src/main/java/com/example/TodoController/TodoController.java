package com.example.TodoController;

import java.util.List;

import org.hibernate.sql.results.graph.basic.BasicResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Service.TodoService;
import com.example.common.todo;
import com.example.common.input.TodoInput;

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
	
	@GetMapping("/insert")
	public String insertTodo( Model model) {
		return "insertTodo";
	}
	
	@PostMapping("/form")
	public String insertPost(@Validated @ModelAttribute TodoInput todoinput, BindingResult br, Model model) {

		System.out.println(todoinput);
	    if (br.hasErrors()) {
	    	model.addAttribute("todoInput", todoinput);
	        return "redirect:/todo/select"; // 入力フォームのビュー名
	    }
		int testId=todoservice.insertTodoData(todoinput);
		return "redirect:/todo/select";
		
	}
	
	
	
	

}
