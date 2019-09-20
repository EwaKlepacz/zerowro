<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body {
        background-image: url("/images/tlo.jpg");
    }
    a {
        color: black;
    }

    div { background-color: white;
        opacity: 0.8;

        width: 250px;
        padding: 10px;
        height: 200px;
        margin: 10px 10px 0px 0px;
    }
    p {
        font-weight: bold;
    }
</style>
<body>
<h1 color="green" align="center">Witaj w projekcie Zero-Wro.</h1>
    <h2 align="center">Wspólna baza miejsc przyjaznych zero-waste we Wrocławiu.</h2>
<br>

<br>
<div> <p> Podziel się swoją wiedzą o miejscach: </p>
<ul>
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

</ul>
</div>
</body>
</html>
