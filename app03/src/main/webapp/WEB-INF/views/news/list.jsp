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

  <c:forEach items="${newsList}" var="news" varStatus="vs">
    <ul class="news">
      <li><a href="${contextPath}/news/detail?newsNo=${vs.index + 1}">${news.title}</a></li>
      <li>${news.contents}</li>
    </ul>
  </c:forEach>

</body>
</html>