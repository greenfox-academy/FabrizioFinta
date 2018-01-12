package com.greenfoxacademy.bankofsymba.Controllers;

import com.greenfoxacademy.bankofsymba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class multipleAccountWEB {
  
  List<BankAccount> accounts = new ArrayList<>();
  
  multipleAccountWEB(){
    accounts.add(new BankAccount("Zazu",1000,"Zebra"));
    accounts.add(new BankAccount("Rafiki",300,"Giraffe"));
    accounts.add(new BankAccount("Pumba",1500,"Pig"));
    accounts.add(new BankAccount("Timon",4000,"Alligator"));
    accounts.add(new BankAccount("Ska",255.50,"Elephant"));
    accounts.get(3).promoteToKing();
    accounts.get(4).makeBadGuy();
  }
  
  @GetMapping("/allAccounts")
  public String FillAndReturnAllAccount(Model model){
    model.addAttribute("accounts", accounts);
    model.addAttribute("fancyYes", "<b>Yes</b>");
    return "allAccounts";
  }
  
  @PostMapping("/allAccounts")
  public ModelAndView modifyElement(@ModelAttribute(value="account") BankAccount account){
    account.increaseBalance();
    return new ModelAndView("redirect:/allAccounts");
  }
}
