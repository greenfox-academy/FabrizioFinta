package com.greenfoxacademy.demo.Model;

public class Greeting {
  
  private long id;
  private String content;
  private int age;
  
  public Greeting(){}
  
  public Greeting(long id, String content, int age) {
    this.id = id;
    this.content = content;
    this.age = age;
}
  
  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
}
