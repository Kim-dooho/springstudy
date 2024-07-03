package com.min.app02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* /api 로 시작하는 요청을 담당하는 컨트롤러로 만들기 */
@RequestMapping(value="/api")

@Controller
public class MvcController2 {

  /* 반환 타입이 void 인 경우 /api/user 요청을 응답 JSP 경로와 이름으로 인식한다. */
  
  @RequestMapping("/user") // value 만 있을 경우 생략 가능
  public void user() {
    
  }
  
  @RequestMapping("/board")
  public void board() {
    
  }
  
  @RequestMapping("/news")
  public void news() {
    
  }

}