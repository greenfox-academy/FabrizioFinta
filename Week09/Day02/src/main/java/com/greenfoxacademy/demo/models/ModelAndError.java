package com.greenfoxacademy.demo.models;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ModelAndError {
  @Autowired
  ErrorMessage errorMessage;
  
  public ErrorMessage setErrorAndReturn(String errorMessage) {
    this.errorMessage.setError(errorMessage);
    return this.errorMessage;
  }
}
