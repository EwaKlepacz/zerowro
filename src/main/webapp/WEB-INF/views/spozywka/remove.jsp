<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usunięcie miejsca z produktami spożywczymi przyjazne Zero Waste</title>
</head>
<body>
<h1>Usunięcie kmiejsca z produktami spożywczymi przyjazne Zero Waste "${spozywkaToRemove.name}" ${spozywkaToRemove.dzielnica}</h1>
<form:form method="post" modelAttribute="spozywkaToRemove">
    <form:hidden path="id"/>
    Czy chcesz usunąć to miejsca z produktami spożywczymi przyjazne Zero Waste? <input type="submit" value="Tak"/>
</form:form>
<a href='<c:url value="/spozywka"/>'>Wróć</a>
<br>
<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
