package com.min.app03.service;

import java.util.List;

import com.min.app03.dto.BbsDTO;

public interface BbsService { // 서비스는 다오를 불러서 사용함
   List<BbsDTO> getBbsList();
   BbsDTO getBbsByNo(int BbsNo);
  
}
