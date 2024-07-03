package com.min.app03.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.min.app03.dto.BlogDTO;

/* @Component : Spring container 에 생성된 Bean 의 타입 (BbsDAO, BbsDAOImle)
                Spring container 에 생성된 Bean 의 이름 (BbsDAOImle)*/
@Repository     /* DAO 의 @Component */
public class BlogDAOImpl implements BlogDAO { // BbsDAOImpl 는 BbsDAOImpl 타입, BbsDAO 타입 모두 가능

  List<BlogDTO> blogList = Arrays.asList(
      new BlogDTO("제목1", "내용1")
    , new BlogDTO("제목2", "내용2")
    , new BlogDTO("제목3", "내용3")

      );
  
  @Override
  public List<BlogDTO> getBlogList() {
    return blogList;
  }

  @Override
  public BlogDTO getBlogByNo(int blogNo) {
    return blogList.get(blogNo - 1);
  }

}
