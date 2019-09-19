<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kasia
  Date: 9/15/19
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista sklepów z akcesoriami i chemią </title>
</head>
<body>
<h1>Lista sklepów z akcesoriami i chemią </h1>
<c:url value="/akcesoriaChemia/add" var="addAkcesoriaChemiaURL"/>
<a href="${addAkcesoriaChemiaURL}"> Dodaj sklep z akcesoriami/chemią </a>


<table>
    <tr>
        <th>Id</th>
        <th>Nazwa</th>
        <th>Dzielnica</th>
        <th>Adres</th>
        <th>Opis</th>
    </tr>
    <c:forEach items="${akcesoriaChemia}" var="akcesoriaChemia">
    <tr>
        <td>${akcesoriaChemia.id}</td>
        <td>${akcesoriaChemia.name}</td>
        <td>${akcesoriaChemia.dzielnica}</td>
        <td>${akcesoriaChemia.adress}</td>
        <td>${akcesoriaChemia.description}</td>
        <td>
            <c:url value="/akcesoriaChemia/edit/${akcesoriaChemia.id}" var="editAkcesoriaChemiaURL">
                <c:param name="id" value="${akcesoriaChemia.id}"/>
            </c:url>
            <a href="${editAkcesoriaChemiaURL}">Edytuj sklep</a>
            <c:url value="/akcesoriaChemia/remove/${akcesoriaChemia.id}" var="removeAkcesoriaChemiaURL">
                <c:param name="id" value="${akcesoriaChemia.id}"/>
            </c:url>
            <a href="${removeAkcesoriaChemiaURL}">Usuń sklep</a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>





<table>
