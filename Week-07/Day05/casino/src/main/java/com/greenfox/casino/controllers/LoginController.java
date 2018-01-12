package com.greenfox.casino.controllers;

import com.greenfox.casino.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
  
  UserService userService;
  
  @Autowired
  public LoginController(UserService userService){
    this.userService = userService;
  }
  
  @GetMapping("/login")
    public String loginToAccount(){
    return "login";
  }
  
  @PostMapping("/login")
    public String userCheck() {
  }
}
