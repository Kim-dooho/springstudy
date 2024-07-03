package com.min.app03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

  @RequestMapping(value="/") // 요청 주소를 명시함
  public String main() {
    return "main";
  }
  
}
