<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Title</title>
    <%@ include file="fragments/head.jsp" %>
</head>
<body>
    <%@ include file="fragments/navbar.jsp" %>
    <main>
        <%@ include file="fragments/loginForm.jsp" %>
        <%@ include file="fragments/misc/errorMessage.jsp" %>
    </main>

    <%@ include file="fragments/footer.jsp" %>
</body>
</html>
