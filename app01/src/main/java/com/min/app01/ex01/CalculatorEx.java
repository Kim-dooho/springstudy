package com.min.app01.ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.min.app01.ex02.AppConfig;

public class CalculatorEx {

  public static void main(String[] args) {
    
    // Spring Container 에 있는 Bean 처리       : ApplicationContext
    // close() 처리가 가능한 ApplicationContext : AbstractApplicationContext
    // @Bean 으로 만든 Bean 처리                : AnnotationConfigApplicationContext
    
    AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


    // 삼성 출력
    Calculator calculator1 = ctx.getBean("calculator1", Calculator.class);
    
    System.out.println(calculator1.getMaker());
    System.out.println(calculator1.getPrice());
    
    // LG 출력
    Calculator calculator2 = ctx.getBean("calculator2", Calculator.class);
    
    System.out.println(calculator2.getMaker() + ", " + calculator2.getPrice());

    calculator1.getAdder().add(5, 3);
    calculator1.getSubtractor().subtract(6, 2);
    calculator2.getAdder().add(5, 3);
    calculator2.getSubtractor().subtract(6, 2);
    
    ctx.close();

  }

}