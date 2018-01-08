package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping(value = "/greetings", method = RequestMethod.GET)
  public Greeting helloRestGreeting(){
    Greeting iAmAHello = new Greeting(1, "Hello, World!");
    return iAmAHello;
  }
}
