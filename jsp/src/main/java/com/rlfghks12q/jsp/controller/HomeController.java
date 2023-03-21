package com.rlfghks12q.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Model model){
    model.addAttribute("name", "rlfghks12q");
    return "/index";

  }
}
