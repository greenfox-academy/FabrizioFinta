package com.greenfoxacademy.demo.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMultilangWebController {
  
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  
  @RequestMapping("/helloEverybody")
  public String helloMulti(Model model){
      model.addAttribute("name", hellos[randomWithRange(0,hellos.length-1)]);
      model.addAttribute("size", randomWithRange(10,300));
      model.addAttribute("color", "rgb(" + randomWithRange(0,255) + "," + randomWithRange(0,255) + "," + randomWithRange(0,255) + ")");
    return "helloMulti";
  }
  
  private int randomWithRange(int min, int max)
  {
    int range = (max - min) + 1;
    return (int)(Math.random() * range) + min;
  }
}
