<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>

  <a href="${contextPath}/list.do">연락처관리</a>






<!--   
  <div>
    <h1>연락처 관리하기</h1>
    <div>
      <label for="contactNo">순번</label>
      <input type="text" id="contactNo">
    </div>
    <div>
      <label for="name">이름</label>
      <input type="text" id="name">
    </div>
    <div>
      <label for="email">이메일</label>
      <input type="text" id="email">
    </div>
    <div>
      <label for="mobile">전화번호</label>
      <input type="text" id="mobile">
    </div>
    <div>
      <button id="init-btn">초기화</button>
      <button id="register-btn">등록</button>
      <button id="modify-btn">수정</button>
      <button id="remove-btn">삭제</button>
    </div>
  </div>
   -->
<!-- 
  <hr>
 -->
<!--   
  <div>
    <table border="1">
      <thead>
        <tr>
          <td>순번</td>
          <td>이름</td>
          <td>이메일</td>
          <td>전화번호</td>
          <td></td>
        </tr>
      </thead>
      <tbody id="contacts">
      </tbody>
    </table>
  </div>
   -->
<%-- 
<script src="${contextPath}/resources/js/app06.js"></script>
 --%>
</body>
</html>