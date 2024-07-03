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
    ${memberVO.id} | ${memberVO.pw}
     <%-- 세션이 아니라 리퀘스트에 저장된 정보임. 세션과 리퀘스트에 모두 있으나, 우선순위는 라이프 사이클이 짧은 리퀘스트의 정보를 보여줌 --%>
  </div>
  
</body>
</html>