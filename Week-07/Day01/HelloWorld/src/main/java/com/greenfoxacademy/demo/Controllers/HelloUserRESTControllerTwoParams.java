package com.greenfoxacademy.demo.Controllers;
import com.greenfoxacademy.demo.Model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloUserRESTControllerTwoParams {
  
  @RequestMapping(value = "web/HelloUser", method = RequestMethod.GET)
  public Greeting helloUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age){
    Greeting myGreet = new Greeting(1l, name, age);
    return myGreet;
  }
}
