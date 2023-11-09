<%--65130500005 Kundids Khawmeesri--%>
<%--
  Created by IntelliJ IDEA.
  User: INT202&204
  Date: 10/30/2023
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MidTerm Exam</title>
</head>
<body>
<h1>MidTerm Exam By Kundids 65130500005</h1>
<h1>Welcome ${sessionScope.currentUser.username} (${sessionScope.currentUser.emailAddress})</h1>
<hr>
<h1>Primer Checker::</h1>
<hr>
<form action="is_prime" method="post">
    <label>Enter number to check: <input type="number" name="number"></label>
    <br>
    <input type="submit" value="Submit">
    <hr>
    <input type="submit" name="back" value="Out">
</form>
<c:if test="${requestScope.error != null}">
    <p>${requestScope.error}</p>
</c:if>
<c:if test="${requestScope.calculated != null}">
    <p>${requestScope.calculated} ${requestScope.msg}</p>
</c:if>
</body>
</html>
