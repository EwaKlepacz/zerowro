<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie miejsca z produktami spożywczymi przyjazne Zero Waste</title>
</head>
<style>
    body {
        background-color: rgba(236,250,147,0.59);
    }
</style>
<body>
<h1>Tworzenie/edytowanie miejsca z produktami spożywczymi przyjazne Zero Waste</h1>
<form:form modelAttribute="spozywka" method="post">
    <form:label path="name"> Nazwa: </form:label>
    <form:input path="name"/>

    <p> Dzielnice: ><form:select path="dzielnica" items="${dzielnice}"/></p>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>
    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <form:label path="typ">Typ: </form:label>
    <form:input path="typ"/>

    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>