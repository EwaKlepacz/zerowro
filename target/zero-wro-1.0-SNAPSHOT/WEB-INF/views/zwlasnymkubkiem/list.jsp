<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista miejsc wspierających akcję "z własnym kubkiem" </title>
</head>
<body>
<h1>Lista miejsc wspierających akcję "z własnym kubkiem": </h1>
<c:url value="/zwlasnymkubkiem/add" var="addzwlasnymkubkiemURL"/>
<a href="${addzwlasnymkubkiemURL}"> Dodaj miejsce </a>


<table>
    <tr>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Dzielnica</th>
        <th>Adres</th>

    </tr>
    <c:forEach items="${zwlasnymkubkiem}" var="zwlasnymkubkiem">
        <tr>
            <td>${zwlasnymkubkiem.id}</td>
            <td>${zwlasnymkubkiem.nazwa}</td>
            <td>${zwlasnymkubkiem.dzielnica}</td>
            <td>${zwlasnymkubkiem.adress}</td>


            <td>
                <c:url value="/zwlasnymkubkiem/edit/${zwlasnymkubkiem.id}" var="editzwlasnymkubkiemURL">
                    <c:param name="id" value="${zwlasnymkubkiem.id}"/>
                </c:url>
                <a href="${editzwlasnymkubkiemURL}">Edytuj miejsce </a>
                <c:url value="/zwlasnymkubkiem/remove/${zwlasnymkubkiem.id}" var="removezwlasnymkubkiemURL">
                    <c:param name="id" value="${zwlasnymkubkiem.id}"/>
                </c:url>
                <a href="${removezwlasnymkubkiemURL}">Usuń miejsce </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
