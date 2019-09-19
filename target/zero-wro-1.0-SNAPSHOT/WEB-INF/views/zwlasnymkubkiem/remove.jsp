<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usunięcie miejsca  wspierającego akcję "z własnym kubkiem"</title>
</head>
<style>
    body {
        background-color: rgba(185,177,189,0.94);
    }
</style>
<body>
<h1>Usunięcie miejsca wspierającego akcję "z własnym kubkiem" "${zwlansnymkubkiemToRemove.nazwa}" ${zwlansnymkubkiemToRemove.dzielnica}</h1>
<form:form method="post" modelAttribute="zwlansnymkubkiemToRemove">
    <form:hidden path="id"/>
    Czy chcesz usunąć to miejsce wspierające akcję "z własnym kubkiem"? <input type="submit" value="Tak"/>
</form:form>
<a href='<c:url value="/zwlasnymkubkiem"/>'>Wróć</a>
<br>
<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
