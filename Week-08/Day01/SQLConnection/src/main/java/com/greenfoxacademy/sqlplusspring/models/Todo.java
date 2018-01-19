package com.greenfoxacademy.sqlplusspring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "todo")
public class Todo {
  
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean urgent;
  private boolean done;
  
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "assignee_id")
  private Assignee assignee;
  
  public Todo(String title) {
    this.title = title;
  }
}