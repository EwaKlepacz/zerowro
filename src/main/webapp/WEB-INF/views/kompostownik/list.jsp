<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista kompostowników </title>
</head>
<body>
<h1>Lista kompostowników: </h1>
<c:url value="/kompostowniki/add" var="addKompostownikURL"/>
<a href="${addKompostownikURL}"> Dodaj kompostownik </a>


<table>
    <tr>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Dzielnica</th>
        <th>Adres</th>
        <th>Kontakt</th>

    </tr>
    <c:forEach items="${kompostowniki}" var="kompostowniki">
        <tr>
            <td>${kompostowniki.id}</td>
            <td>${kompostowniki.nazwa}</td>
            <td>${kompostowniki.dzielnica}</td>
            <td>${kompostowniki.adress}</td>
            <td>${kompostowniki.kontakt}</td>

            <td>
                <c:url value="/kompostowniki/edit" var="editKompostownikiURL">
                    <c:param name="id" value="${kompostowniki.id}"/>
                </c:url>
                <a href="${editKompostownikiURL}">Edytuj kompostownik </a>
                <c:url value="/kompostowniki/remove/${kompostowniki.id}" var="removeKompostownikiURL">
                    <c:param name="id" value="${kompostowniki.id}"/>
                </c:url>
                <a href="${removeKompostownikiURL}">Usuń kompostownik</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>
