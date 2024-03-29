<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie kompostownika</title>
</head>
<style>
    body {
        background-color: rgba(147,243,178,0.59);
    }
</style>
<body>
<h1>Tworzenie/edytowanie kompostownika</h1>
<form:form modelAttribute="kompostowniki" method="post">
    <form:label path="nazwa"> Nazwa: </form:label>
    <form:input path="nazwa"/>

    <p> Dzielnice: ><form:select path="dzielnica" items="${dzielnice}"/></p>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>
    <form:label path="kontakt">Kontakt: </form:label>
    <form:input path="kontakt"/>

    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
