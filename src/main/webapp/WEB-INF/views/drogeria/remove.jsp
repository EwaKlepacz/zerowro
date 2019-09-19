<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usunięcie drogerii</title>
</head>
<style>
    body {
        background-color: rgba(147,243,178,0.59);
    }
</style>
<body>
<h1>Usunięcie drogerii "${drogeriaToRemove.name}" ${drogeriaToRemove.dzielnica}</h1>
<form:form method="post" modelAttribute="drogeriaToRemove">
    <form:hidden path="id"/>
    Czy chcesz usunąć tę drogerię? <input type="submit" value="Tak"/>
</form:form>
<a href='<c:url value="/drogerie"/>'>Wróć</a>
<br>
<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
