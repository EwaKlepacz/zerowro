<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usunięcie miejsca  wspierającego akcję "z własnym kubkiem"</title>
</head>
<body>
<h1>Usunięcie miejsca wspierającego akcję "z własnym kubkiem" "${zwlansnymkubkiemToRemove.name}" ${zwlansnymkubkiemToRemove.dzielnica}</h1>
<form:form method="post" modelAttribute="zwlansnymkubkiemToRemove">
    <form:hidden path="id"/>
    Czy chcesz usunąć to miejsce wspierające akcję "z własnym kubkiem"? <input type="submit" value="Tak"/>
</form:form>
<a href='<c:url value="/zwlasnymkubkiem"/>'>Wróć</a>
</body>
</html>
