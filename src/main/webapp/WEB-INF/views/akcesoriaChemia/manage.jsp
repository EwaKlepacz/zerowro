<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie sklepu z akcesoriami/chemią</title>
</head>
<body>
<h1>Tworzenie/edytowanie sklepu z akcesoriami/chemią</h1>
<form:form modelAttribute="akcesoriaChemia" method="post">
    <form:label path="name"> Nazwa: </form:label>
    <form:input path="name"/>

    <form:label path="dzielnica">Dzielnica: </form:label>
    <form:input path="dzielnica"/>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>
    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>