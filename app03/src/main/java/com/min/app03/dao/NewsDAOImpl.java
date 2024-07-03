package com.min.app03.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.min.app03.dto.NewsDTO;

/* @Component : Spring container 에 생성된 Bean 의 타입 (BbsDAO, BbsDAOImle)
                Spring container 에 생성된 Bean 의 이름 (BbsDAOImle)*/
@Repository     /* DAO 의 @Component */
public class NewsDAOImpl implements NewsDAO { // BbsDAOImpl 는 BbsDAOImpl 타입, BbsDAO 타입 모두 가능

  List<NewsDTO> newsList = Arrays.asList(
      new NewsDTO("제목1", "내용1")
    , new NewsDTO("제목2", "내용2")
    , new NewsDTO("제목3", "내용3")

      );
  
  @Override
  public List<NewsDTO> getNewsList() {
    return newsList;
  }

  @Override
  public NewsDTO getNewsByNo(int newsNo) {
    return newsList.get(newsNo - 1);
  }

}
