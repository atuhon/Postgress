package com.example.demo.TodoRepository;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.TodoRepository;
import com.example.Repository.TodoRepositoryImple;
import com.example.common.todo;
import com.example.demo.InputData.XlsDataSetLoader;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

@SpringBootTest
@TestExecutionListeners({
    DependencyInjectionTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class,
    TransactionDbUnitTestExecutionListener.class})
@DbUnitConfiguration(dataSetLoader = XlsDataSetLoader.class)
@Transactional
@DatabaseSetup("/testdata.xlsx")
class DbUnitSampleTest {
	@Autowired
	TodoRepository todorepository;


	

	 @Test
	 void テストデータを読みこむ1件() {

	List<todo> list=todorepository.selectTodo();

	assertThat(list.get(0).getId()).isEqualTo(3);
	assertThat(list.get(0).getTitle()).isEqualTo("test6");
	assertThat(list.get(0).getDesc()).isEqualTo("test");

}
	@Test
	 void 複数データを読みこむ() {
			List<todo> list=todorepository.selectTodo();
			System.out.println(list);
			assertThat(list.get(0).getId()).isEqualTo(3);
			assertThat(list.get(0).getTitle()).isEqualTo("test6");
			assertThat(list.get(0).getDesc()).isEqualTo("test");
			assertThat(list.get(1).getId()).isEqualTo(4);
			assertThat(list.get(1).getTitle()).isEqualTo
			("test7");
			assertThat(list.get(1).getDesc()).isEqualTo("test2");
		}
		 
	
	 @Test
	 void テストDBに登録する() {
		 todo todo=new todo();
		 todo.setId(45);
		 todo.setTitle("JDBC");
		 todo.setDesc("内容の確認");
	
		int insertTodo = todorepository.insertTodo(todo);
		assertThat(insertTodo).isEqualTo(1);
		 }
		 
	 
	 @Test
	 void テストDBから削除する() {
		 
	 }
	 @Test
	 void テストデータの情報を更新する() {
		 
	 }
	 
}