<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body {
        background-color: rgb(77, 255, 77);
    }
</style>
<body>
<h1 color="green" align="center">Witaj w projekcie Zero-Wro.</h1>
    <h2 align="center">Wspólna baza miejsc przyjaznych zero-waste we Wrocławiu.</h2>
<br>

<br>
<p text>Podziel się swoją wiedzą o miejscach:</p>
<ol>
    <li>
         <c:url value="/akcesoriaChemia" var="AkcesoriaChemiaURL"/>
            <a href="${AkcesoriaChemiaURL}"> Akcesoria i chemia  </a></li>


    <li> <c:url value="/drogerie" var="DrogerieURL"/>
                <a href="${DrogerieURL}"> Drogerie </a> </li>


    <li>  <c:url value="/kompostowniki" var="KompostownikiURL"/>
        <a href="${KompostownikiURL}"> Kompostowniki </a></li>


    <li> <c:url value="/spozywka" var="SpozywkaURL"/>
        <a href="${SpozywkaURL}"> Miejsca z produktami spożywczymi </a>: </li>


    <li> <c:url value="/zwlasnymkubkiem" var="zwlasnymkubkiemURL"/>
        <a href="${zwlasnymkubkiemURL}"> Miejsca wspierające akcję "z własnym kubkiem"</a> </li>

</ol>

</body>
</html>
