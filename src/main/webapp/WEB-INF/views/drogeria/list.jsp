<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista drogerii </title>
</head>
<style>
    body {
        background-color: rgba(247,211,246,0.59);
    }
</style>
<body>
<h1>Lista drogerii </h1>
<c:url value="/drogerie/add" var="addDrogerieURL"/>
<a href="${addDrogerieURL}"> Dodaj drogerię </a>


<table>
    <tr>

        <th>Nazwa</th>
        <th>Dzielnica</th>
        <th>Adres</th>
        <th>Opis</th>
        <th>Marki</th>
    </tr>
    <c:forEach items="${drogerie}" var="drogeria">
        <tr>

            <td>${drogeria.name}</td>
            <td>${drogeria.dzielnica}</td>
            <td>${drogeria.adress}</td>
            <td>${drogeria.description}</td>
            <td>${drogeria.marki}</td>
            <td>
                <c:url value="/drogerie/edit" var="editDrogeriaURL">
                    <c:param name="id" value="${drogeria.id}"/>
                </c:url>
                <a href="${editDrogeriaURL}">Edytuj drogerię </a>
                <c:url value="/drogerie/remove/${drogeria.id}" var="removeDrogeriaURL">
                    <c:param name="id" value="${drogeria.id}"/>
                </c:url>
                <a href="${removeDrogeriaURL}">Usuń drogerię</a>
            </td>
        </tr>
    </c:forEach>

    </table>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>





<table>

