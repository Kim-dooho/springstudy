package com.min.app03.dao;

import java.util.List;

import com.min.app03.dto.BbsDTO;

// (@Component = Bean 태그로 만들기)
public interface BbsDAO { // 인터페이스는 객체로 만들 수 없다. 본문이 없는 추상메소드(미완성이라는 뜻)
  List<BbsDTO> getBbsList();
  BbsDTO getBbsByNo(int bbsNo);
}
