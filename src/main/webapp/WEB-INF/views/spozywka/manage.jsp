<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie miejsca z produktami spożywczymi przyjazne Zero Waste</title>
</head>
<style>
    body {
        background-image: url("/images/amu.jpg");
    }
    a {
        color: black;
    }
</style>
<body>
<h1>Tworzenie/edytowanie miejsca z produktami spożywczymi przyjazne Zero Waste</h1>
<form:form modelAttribute="spozywka" method="post">
    <form:label path="name"> Nazwa: </form:label>
    <form:input path="name"/>

    <p> Dzielnice: <form:select path="dzielnica" items="${dzielnice}"/></p>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>
    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <p> Typ: <form:select multiple="true" path="typ" items="${typPunktu}"/></p>
    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>