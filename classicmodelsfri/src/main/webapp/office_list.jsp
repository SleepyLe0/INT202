<%--
  Created by IntelliJ IDEA.
  User: INT202&204
  Date: 11/3/2023
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Office List</title>
</head>
<body>
<h1>Office List ::</h1>
<hr>
<div style="display: grid; grid-template-columns: auto auto auto auto; gap: 10px;">
    <c:forEach items="${requestScope.officeList}" var="office">
        <a href="office_list?officeCode=${office.officeCode}"
           style="border: 1px solid black; border-radius: 10px; align-items: center; justify-content: center;
           padding: 20px; text-decoration: none; color: black;">
            <h2>${office.city}, ${office.country}</h2>
            <h3>${office.phone}</h3>
        </a>
    </c:forEach>
</div>
<c:if test="${requestScope.selectedOffice != null}">
    <h1>Employee List ::</h1>
    <hr>
    <div style="display: grid; grid-template-columns: auto auto auto auto; gap: 10px;">
        <c:forEach items="${requestScope.selectedOffice.employeeList}" var="employee">
            <div style="border: 1px solid black; border-radius: 10px; align-items: center; justify-content: center;
           padding: 20px; background-color: aqua; text-decoration: none; color: black;">
                <p>${employee.employeeNumber}</p>
                <p>${employee.firstName} ${employee.lastName}</p>
                <p>${employee.email}</p>
            </div>
        </c:forEach>
    </div>
</c:if>
</body>
</html>
