package com.greenfoxacademy.sqlplusspring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignee {
  
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String email;
  
}
