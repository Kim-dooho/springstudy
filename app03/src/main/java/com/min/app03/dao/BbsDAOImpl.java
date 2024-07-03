package com.min.app03.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.min.app03.dto.BbsDTO;

/* @Component : Spring container 에 생성된 Bean 의 타입 (BbsDAO, BbsDAOImle)
                Spring container 에 생성된 Bean 의 이름 (BbsDAOImle)*/
@Repository     /* DAO 의 @Component */
public class BbsDAOImpl implements BbsDAO { // BbsDAOImpl 는 BbsDAOImpl 타입, BbsDAO 타입 모두 가능

  List<BbsDTO> bbsList = Arrays.asList(
      new BbsDTO("제목1", "내용1")
    , new BbsDTO("제목2", "내용2")
    , new BbsDTO("제목3", "내용3")

      );
  
  @Override
  public List<BbsDTO> getBbsList() {
    return bbsList;
  }

  @Override
  public BbsDTO getBbsByNo(int bbsNo) {
    return bbsList.get(bbsNo - 1);
  }

}
