package com.min.app01.ex02;

import java.time.Instant;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration : Bean 을 만드는 클래스 (Bean 설정에 관련된 클래스)

@Configuration
public class AppConfig {
  
  /* 메소드 == Bean */
  
  /*
   * 반환타입 : Bean 의 타입 ( <bean class""> )
   * 메소드명 : Bean 의 이름 ( <bean id="">   )
   */
  
  @Bean
  Adder adder() {
    return new Adder();
  }
  
  @Bean
  Subtractor subtractor() {
    return new Subtractor();
  }
  
  @Bean
  Date today() {
    return Date.from(Instant.now());
  }
  
  @Bean
  Calculator calculator1() {
    // default constructor + setter
    Calculator calculator = new Calculator();
    calculator.setMaker("samsung");
    calculator.setPrice(100);
    calculator.setAdder(adder());
    calculator.setSubtractor(subtractor());
    calculator.setBuide(today());
    
    return calculator;

  }
  
  @Bean
  Calculator calculator2() {
    
    return new Calculator("LG"
                        , 200
                        , adder()
                        , subtractor()
                        , today());
    
  }

}