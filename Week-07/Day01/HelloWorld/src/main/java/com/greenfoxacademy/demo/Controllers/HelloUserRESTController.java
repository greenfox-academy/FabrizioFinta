package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTController {
  @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
  public Greeting helloUser(@RequestParam(value = "name", required = false) String name){
    Greeting greeting = new Greeting(1, name);
    return greeting;
  }
}
