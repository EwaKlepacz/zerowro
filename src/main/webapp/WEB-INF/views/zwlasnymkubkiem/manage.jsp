<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie miejsca wspierającego akcję "z własnym kubkiem" </title>
</head>
<body>
<h1>Tworzenie/edytowanie miejsca wspierającego akcję "z własnym kubkiem"</h1>
<form:form modelAttribute="zwlasnymkubkiem" method="post">
    <form:label path="nazwa"> Nazwa: </form:label>
    <form:input path="nazwa"/>

    <form:label path="dzielnica">Dzielnica: </form:label>
    <form:input path="dzielnica"/>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>

    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>
</body
