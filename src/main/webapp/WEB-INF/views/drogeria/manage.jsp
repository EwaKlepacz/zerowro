<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie drogerii</title>
</head>
<style>
    body {
        background-color: rgba(247,211,246,0.59);
    }
</style>
<body>
<h1>Tworzenie/edytowanie drogerii</h1>
<form:form modelAttribute="drogeria" method="post">
    <form:label path="name"> Nazwa: </form:label>
    <form:input path="name"/>

    <p> Dzielnice: ><form:select path="dzielnica" items="${dzielnice}"/></p>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>
    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <form:label path="marki">Marki: </form:label>
    <form:input path="marki"/>
    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>