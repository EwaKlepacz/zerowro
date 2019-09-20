<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tworzenie/edytowanie miejsca wspierającego akcję "z własnym kubkiem" </title>
</head>
<style>
    body {
        background-image: url("/images/coffe.jpg");
    }
    a {
        color: black;
    }
</style>
<body>
<h1>Tworzenie/edytowanie miejsca wspierającego akcję "z własnym kubkiem"</h1>
<form:form modelAttribute="zwlasnymkubkiem" method="post">
    <form:label path="nazwa"> Nazwa: </form:label>
    <form:input path="nazwa"/>

    <p> Dzielnice: ><form:select path="dzielnica" items="${dzielnice}"/></p>
    <form:label path="adress">Adres: </form:label>
    <form:input path="adress"/>

    <form:hidden path="id"/>
    <input type="submit" value="Zapisz"/>
</form:form>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
