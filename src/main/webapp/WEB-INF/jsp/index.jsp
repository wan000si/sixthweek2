<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/5
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
</head>
<body>
<c:if test="${empty requestScope.employees}">
    没有员工信息
</c:if>
<c:if test="${!empty requestScope.employees }">
    <table style="width: 100%" border="1" cellpadding="10" cellspacing="0">
        <tr bgcolor="black"style="color: floralwhite">
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>

        <c:forEach items="${requestScope.employees }" var="emp" varStatus="status">
            <tr bgcolor="${status.index%2==0?'#FFFAF0':'#FFC6C1'}"style="color: black"align="center">
               <td>${emp.id }</td>
                <td>${emp.name }</td>
                <td>${emp.age }</td>
                <td>${emp.gender }</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br><br>
</body>

</html>
