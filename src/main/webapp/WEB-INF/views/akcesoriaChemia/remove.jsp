<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usunięcie sklepu z akcesoriami/chemią</title>
</head>
<style>
    body {
        background-color: rgb(173,234,204);
    }
</style>
<body>
<h1>Usunięcie sklepu z akcesoriami/chemią "${akcesoriaToRemove.name}"</h1>
<form:form method="post" modelAttribute="akcesoriaToRemove">
    <form:hidden path="id"/>
    Czy chcesz usunąć ten sklep? <input type="submit" value="Tak"/>
</form:form>
<a href='<c:url value="/akcesoriaChemia"/>'>Wróć</a>
<br>
<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
