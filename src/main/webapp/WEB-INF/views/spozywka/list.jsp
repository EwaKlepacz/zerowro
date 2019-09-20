<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista miejsc spożywczych przyjaznych Zero Waste </title>
</head>
<style>
    body {
        background-color: rgba(236,250,147,0.59);
    }
</style>
<body>
<h1>Lista miejsc spożywczych przyjaznych Zero Waste: </h1>
<c:url value="/spozywka/add" var="addSpozywkaURL"/>
<a href="${addSpozywkaURL}"> Dodaj miejsce z produktami spożywczymi przyjazne Zero Waste </a>


<table>
    <tr>

        <th>Nazwa</th>
        <th>Dzielnica</th>
        <th>Adres</th>
        <th>Typ</th>

    </tr>
    <c:forEach items="${spozywka}" var="spozywka">
        <tr>

            <td>${spozywka.name}</td>
            <td>${spozywka.dzielnica}</td>
            <td>${spozywka.adress}</td>
            <td>${spozywka.typ}</td>

            <td>
                <c:url value="/spozywka/edit" var="editSpozywkaURL">
                    <c:param name="id" value="${spozywka.id}"/>
                </c:url>
                <a href="${editSpozywkaURL}">Edytuj miejsce  </a>
                <c:url value="/spozywka/remove/${spozywka.id}" var="removeSpozywkaURL">
                    <c:param name="id" value="${spozywka.id}"/>
                </c:url>
                <a href="${removeSpozywkaURL}">Usuń miejsce </a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/index"> Wróć na stronę główną </a>
</body>
</html>