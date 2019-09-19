<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Witaj projekcie zero-wro. Wspólna baza miejśc przyjaznych zero-waste we Wrocławiu.</h1>
<br>
Podziel się swoją wiedzą o miejscach:
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
