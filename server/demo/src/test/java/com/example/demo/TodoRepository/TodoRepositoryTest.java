package com.example.demo.TodoRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;

import com.example.Repository.TodoRepository;
import com.example.Repository.TodoRepositoryImple;
import com.example.common.todo;

@SpringBootTest
@ActiveProfiles("test")
public class TodoRepositoryTest {
	@Autowired
	TodoRepository todorepository;
	@Autowired
 RowMapper<todo> tm;
	@BeforeEach
	void Setup() {

		 todorepository=new TodoRepositoryImple(tm);
		
	}
	@Test
	void Mockから値を受け取る() {
		System.out.println("値が通るか確認");
		 List<todo> list=todorepository.selectTodo();
		 System.out.println(list);
	}

}
