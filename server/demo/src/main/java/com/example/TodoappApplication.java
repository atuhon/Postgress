package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Repository.TodoRepository;
import com.example.Repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class TodoappApplication {
	private final UserRepository repo;
	private final TodoRepository todoRepo;

	public TodoappApplication(UserRepository repo,TodoRepository todoRepo) {
		this.repo = repo;
		this.todoRepo = todoRepo;
	}

	public static void main(String[] args) {
		
	 SpringApplication.run(TodoappApplication.class, args);

	}
	 @PostConstruct
	 public void repos() {
		 repo.selectData();
	 }
	 @PostConstruct
	 public void selectTodo() {
		 todoRepo.selectTodo();
	 }




}
