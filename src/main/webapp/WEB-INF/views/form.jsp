<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kasia
  Date: 9/18/19
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First page</title>
</head>
<body>
<h1>Witaj na stronie wyszukiwarki miejsc przyjaznych Zero Waste we Wrocławiu. </h1>

Wypełnij poniższy formularz by odnaleźć to czego poszukujesz.
<br>

<form:form method="post" modelAttribute="wyszukiwarka">
    <p>Wybierz typ wyszukiwanego miejsca: <form:checkbox path="typePlace" items="${typ}" /></p>
    <p>Wybierz dzielnicę  <form:select path="dzielnica" items="${dzielnice}" multiple="false"/></p>
    <p>  <input type="submit" value="szukaj"/> </p>
</form:form>
</body>
</html>
