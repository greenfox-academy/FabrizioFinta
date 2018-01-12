package com.greenfoxacademy.bankofsymba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HTMLceptionWEBController {
  @GetMapping("/htmlCeption")
  public String htmlCeption(Model model){
    String testText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("normalText", testText);
    model.addAttribute("fancyUText", testText);
    return "htmlCeption";
  }
}
