package com.min.app02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.min.app02.vo.MemberVO;

@SessionAttributes(names = "memberVO") /* Model 에 memberVO 가 저장되면 HttpSession 에 같은 이름으로 저장하시오. */

@Controller
public class MvcController8 {

  @RequestMapping(value = "/member/login", method = RequestMethod.POST)
  public String login(MemberVO member, @RequestParam String redirectURL) { 
    // 커맨드 객체 MemberVO member 는 자동으로 Model 에 memberVO 라는 이름으로 저장된다.
    // 타입으로 저장함, 첫글자를 소문자로(camel case) memberVO
    
    return "redirect:" + redirectURL;
    
    /* public String login(@ModelAttribute("member") MemberVO member) : 커맨드 객체 이름을 member 로 바꿔서 Model 에 저장하시오 */
  }
  
  @RequestMapping("/member/logout")
  public String logout(SessionStatus sessionStatus) {
    
    // 세션 완료 처리 (세션 정보 사라짐)
    sessionStatus.setComplete();
    
    return "redirect:/main";
    
  }
  
  @RequestMapping("/member/mypage")
  public String mypage(@SessionAttribute("memberVO") MemberVO member) { 
    /* HttpSession 에 저장된 memberVO 를 MemberVO member 에 저장하시오. */
    /* MemberVO member 커맨드 객체, model(request) 에 정보를 자동으로 저장한다. */
    
    return "member/mypage";
    
  }
  
  
  
  
  
  
  
  
  
  
}