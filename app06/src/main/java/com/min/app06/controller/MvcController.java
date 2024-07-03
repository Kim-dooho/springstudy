package com.min.app06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MvcController {
  
  // lombok's @Slf4j 로 대체할 수 있다.
  // private static final Logger log = LoggerFactory.getLogger(MvcController.class);
  
  @RequestMapping("/")
  public String main() {
    log.debug("/main.do");
    return "main";
  }

}