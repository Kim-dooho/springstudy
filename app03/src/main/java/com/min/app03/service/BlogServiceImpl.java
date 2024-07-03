package com.min.app03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.app03.dao.BlogDAO;
import com.min.app03.dto.BlogDTO;
import com.min.app03.utils.PageUtils;

@Service
public class BlogServiceImpl implements BlogService {
  

  private BlogDAO blogDAO;
  private PageUtils pageUtils;
  
  
  @Autowired // 생성자 주입 // 생략 가능 즉 @allargsconstructor 사용하면 모든 코드 생략 가능
  public BlogServiceImpl(BlogDAO blogDAO, PageUtils pageUtils) {
    super();
    this.blogDAO = blogDAO;
    this.pageUtils = pageUtils;
  }

  @Override
  public List<BlogDTO> getBlogList() {
    return blogDAO.getBlogList();
    
  }

  @Override
  public BlogDTO getBlogByNo(int BlogNo) {
    return blogDAO.getBlogByNo(BlogNo);
    
  }
  
}