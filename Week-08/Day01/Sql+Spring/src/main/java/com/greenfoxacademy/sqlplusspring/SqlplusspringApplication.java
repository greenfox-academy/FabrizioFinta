package com.greenfoxacademy.sqlplusspring;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlplusspringApplication implements CommandLineRunner{
  
  @Autowired
  CrudRepository cruds;
  
  public static void main(String[] args) {
		SpringApplication.run(SqlplusspringApplication.class, args);
	}
	
  @Override
  public void run(String... args) throws Exception {
		cruds.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
