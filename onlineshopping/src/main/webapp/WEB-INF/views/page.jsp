<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="bootstrapcss" value="/resources/vendor/bootstrap/css"/>
<spring:url var="bootstrapjs" value="/resources/vendor/bootstrap/js"/>
<spring:url var="jquery" value="/resources/vendor/jquery"/>
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>

	<script>
		window.menu = '${title}';
	</script>

    <!-- Bootstrap core CSS -->
    <link href="${bootstrapcss}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
	<%@include file="./shared/navbar.jsp" %>
	
    <!-- Page Content -->
    <!-- Loading the home content -->
    <c:if test="${userClickHome == true }">
    	<%@include file="home.jsp" %>
    </c:if>
    <!-- Loading the about content -->
    <c:if test="${userClickAbout == true }">
    	<%@include file="about.jsp" %>
    </c:if>
    <!-- Loading the contact content -->
    <c:if test="${userClickContact == true }">
    	<%@include file="contact.jsp" %>
    </c:if>
	<!-- /.container -->

    <!-- Footer -->
    <%@include file="./shared/footer.jsp" %>

    <!-- JQuery -->
    <script src="${jquery}/jquery.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script src="${bootstrapjs}/bootstrap.bundle.min.js"></script>
    <!-- Self Coded JS -->
    <script src="${js}/olshop.js"></script>

  </body>

</html>
