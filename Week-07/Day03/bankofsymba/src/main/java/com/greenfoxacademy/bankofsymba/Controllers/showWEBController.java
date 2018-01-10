package com.greenfoxacademy.bankofsymba.Controllers;

import com.greenfoxacademy.bankofsymba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class showWEBController {
  @GetMapping("/show")
  public String showFields(Model model){
    BankAccount simba = new BankAccount("Simba", 2000.21312, "lion");
    model.addAttribute("name", simba.getName());
    model.addAttribute("article", checkFirstLetter(simba));
    model.addAttribute("animalType", simba.getAnimalType());
    model.addAttribute("balance", String.format("%.02d", simba.getBalance()));
    return "show";
  }
  
  private String checkFirstLetter(BankAccount simba) {
    List<Character> Vowels = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
    return Vowels.contains(simba.getAnimalType().charAt(0)) ? "an" : "a";
  }
}
