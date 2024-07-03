<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>

  <div>
    <h1>연락처</h1>
  </div>
  
  <div>
    <button type="button" onclick="location.href='${contextPath}/write.do'">신규등록</button>
  </div>
  
  <hr>

  <table border="1">
    <thead>
      <tr>
        <th>순번</th>
        <th>이름</th>
        <th>이메일</th>
        <th>전화번호</th>
        <th>버튼</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="contact" items="${contacts}">
        <tr>
          <td>${contact.contactNo}</td>
          <td><a href="${contextPath}/detail.do?contactNo=${contact.contactNo}">${contact.name}</a></td>
          <td>${contact.email}</td>
          <td>${contact.mobile}</td>
          <td>
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>