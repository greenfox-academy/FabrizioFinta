package com.greenfoxacademy.sqlplusspring.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private int ID;
  private String title;
  private boolean isUrgent;
  
  public Todo() {
  }
  
  public Todo(String title) {
    this.title = title;
  }
  
  private boolean isDone;
  
  public int getID() {
    return ID;
  }
  
  public void setID(int ID) {
    this.ID = ID;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public boolean isUrgent() {
    return isUrgent;
  }
  
  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }
  
  public boolean isDone() {
    return isDone;
  }
  
  public void setDone(boolean done) {
    isDone = done;
  }
}
