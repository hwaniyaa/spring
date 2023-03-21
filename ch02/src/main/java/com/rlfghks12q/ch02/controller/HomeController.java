package com.rlfghks12q.ch02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
  @GetMapping("/")
  public String home() {
    // log.info("username={},age={}", username, age);
    // model.addAttribute("msg", "메세지를 내려보내기");
    return "/index/index";
  }
}
