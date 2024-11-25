package com.example.demo.TodoRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import com.example.Repository.TodoRepository;
import com.example.common.todo;
@SpringBootTest
public class RepositoryTest {
	@Autowired
	TodoRepository todorepository;
	 @Test
//	 @Sql("TodoSelectTest.sql")
	 void 複数のデータを読みこむ() {
			List<todo> list=todorepository.selectTodo();
			assertThat(list.get(1).getTitle()).isEqualTo("test2");
			assertThat(list.get(1).getDesc()).isEqualTo("testdesc");
			
	 }
}
