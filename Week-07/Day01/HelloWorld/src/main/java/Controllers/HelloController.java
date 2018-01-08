package Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
  
  @RequestMapping(value="/hello")
  @ResponseBody
  public String hello(){
    return "Hello world";
  }
}
