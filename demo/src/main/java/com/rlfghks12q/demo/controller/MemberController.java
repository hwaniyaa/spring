package com.rlfghks12q.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rlfghks12q.demo.dto.Member;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {
  
  @GetMapping("/join")
  public String join() {
    return "/member/join";
  }

  @GetMapping("/join02")
  public String join02(Member member) {
    System.out.println(member.toString());
    return "/member/join";
  }

  @GetMapping("/join03")
  public String join03(String name, int age){
    // System.out.println(name + " === " + age);
    log.info(name, age);
    return "/member/join";
  }

  @GetMapping("/list")
  public String list(@RequestParam int page) {
    System.out.println("page=== "+page);
    return "/member/list";
  }

  @GetMapping("/login")
  public String login(@RequestParam String userId, @RequestParam String userPw) {
    System.out.println("userId === "+userId+" userPw === "+userPw);
    return "/member/login";
  }

  @GetMapping("/info/{id}")
  public String memberIfo(@PathVariable("id") String id) {
    System.out.println("id=== "+id);
    return "/member/info";
  }

  @GetMapping("/delete")
  public String delete() {
    return "member/delete";
  }

  @GetMapping("/toJson04")
  @ResponseBody
  public ArrayList returnJson04() {
    ArrayList<Member> arrayList = new ArrayList<>();
    Member member01 = new Member();
    member01.setUserId("rlfghks11q");
    member01.setUserName("김길환1");
    member01.setAddr("대갈민국");
    
    arrayList.add(member01);

    Member member02 = new Member();
    member02.setUserId("rlfghks12q");
    member02.setUserName("김길환2");
    member02.setAddr("대갈민국");

    arrayList.add(member02);

    Member member03 = new Member();
    member03.setUserId("rlfghks13q");
    member03.setUserName("김길환3");
    member03.setAddr("대갈민국");

    arrayList.add(member03);

    return arrayList;
  }
}
