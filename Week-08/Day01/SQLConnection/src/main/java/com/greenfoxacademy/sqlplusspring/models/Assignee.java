package com.greenfoxacademy.sqlplusspring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Assignee {
  
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String email;
  
  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY, mappedBy = "assignee")
  private List<Todo> todo;
}
