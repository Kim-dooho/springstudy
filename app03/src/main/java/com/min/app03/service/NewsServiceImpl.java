package com.min.app03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.app03.dao.NewsDAO;
import com.min.app03.dto.NewsDTO;
import com.min.app03.utils.PageUtils;

@Service
public class NewsServiceImpl implements NewsService {
  

  private NewsDAO newsDAO;
  private PageUtils pageUtils;
  
  
  @Autowired // 생성자 주입 // 생략 가능 즉 @allargsconstructor 사용하면 모든 코드 생략 가능
  public NewsServiceImpl(NewsDAO newsDAO, PageUtils pageUtils) {
    super();
    this.newsDAO = newsDAO;
    this.pageUtils = pageUtils;
  }

  @Override
  public List<NewsDTO> getNewsList() {
    return newsDAO.getNewsList();
    
  }

  @Override
  public NewsDTO getNewsByNo(int NewsNo) {
    return newsDAO.getNewsByNo(NewsNo);
    
  }
  
}