package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloUserRESTController {
  AtomicLong counter = new AtomicLong();
  @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
  public Greeting helloUser(@RequestParam(value = "name", required = false) String name){
    Greeting greeting = new Greeting(counter.incrementAndGet(), name); //TODO ask kond how did he do the model thing
    return greeting;
  }
}
