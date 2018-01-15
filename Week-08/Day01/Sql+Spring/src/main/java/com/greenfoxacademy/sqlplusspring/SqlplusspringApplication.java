package com.greenfoxacademy.sqlplusspring;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlplusspringApplication implements CommandLineRunner{
  
  @Autowired
  TodoRepository cruds;
  
  public static void main(String[] args) {
		SpringApplication.run(SqlplusspringApplication.class, args);
	}
	
  @Override
  public void run(String... args) throws Exception {
  }
}
