<%-- 
    Document   : index
    Created on : Jun 13, 2018, 9:53:18 PM
    Author     : NiranjanKrSubedi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="${pageContext.request.contextPath}/styles.css" rel="stylesheet" type="text/css"/>
    <body>
        <h1>Skills Display!!</h1>
        <form method="post" action="${pageContext.request.contextPath}/save">
            <input type="text" name="skill" />
            <button type="submit">Save</button>
        </form>
        <c:forEach var="s" items="${skills}">
            <ul>
                <li>${s.skill}</li>
            </ul>
        </c:forEach>
    </body>
</html>
