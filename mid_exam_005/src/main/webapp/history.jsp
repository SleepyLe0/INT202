<%--65130500005 Kundids Khawmeesri--%>
<%--
  Created by IntelliJ IDEA.
  User: INT202&204
  Date: 10/30/2023
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MidTerm Exam</title>
</head>
<body>
<h1>Prime Checker History ::</h1>
<hr>
<h1>MidTerm Exam By Kundids 65130500005</h1>
<h1>Welcome ${sessionScope.currentUser.username} (${sessionScope.currentUser.emailAddress})</h1>
<hr>
<table>
    <tr>
        <td>No</td>
        <td>Number</td>
        <td>Is Prime?</td>
    </tr>
<c:forEach items="${requestScope.historyList}" var="history" varStatus="vs">
    <tr>
        <td>${history.no}</td>
        <td>${history.number}</td>
        <td>${history.isPrime}</td>
    </tr>
</c:forEach>
</table>
<hr>
<p>No of prime = ${requestScope.noOfPrime}</p>
</body>
</html>
