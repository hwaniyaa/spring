package com.rlfghks12q.ch01.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rlfghks12q.ch01.dto.Member;

@Controller

public class HomeController {
  
  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("name", "김길환");
    return "/index/index";
  }

  @GetMapping("/member/list")
  public String list(Model model) {
    ArrayList<Member> memberList = new ArrayList<>();
    memberList.add(new Member("01", "김길환", "서울"));
    memberList.add(new Member("02", "장동건", "인천"));
    memberList.add(new Member("03", "현빈", "김포"));
    model.addAttribute("memberList", memberList);
    return "/member/list";
  }





  @GetMapping("/mv")
  public ModelAndView home02() {
    ModelAndView mav = new ModelAndView();
    mav.addObject("subject", "제목을 실어서 보냅니다");
    mav.setViewName("/index/index02");
    return mav;
  }

}
