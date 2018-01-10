package com.greenfoxacademy.bankofsymba.Controllers;

import com.greenfoxacademy.bankofsymba.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class multipleAccountWEB {
  @GetMapping("/allAccounts")
  public String FillAndReturnAllAccount(Model model){
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Zazu",1000,"Zebra"));
    accounts.add(new BankAccount("Rafiki",300,"Giraffe"));
    accounts.add(new BankAccount("Pumba",1500,"Pig"));
    accounts.add(new BankAccount("Timon",4000,"Alligator"));
    accounts.add(new BankAccount("Ska",255.50,"Elephant"));
    model.addAttribute("accounts", accounts);
    return "allAccounts";
  }
}
