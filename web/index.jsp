<%-- 
    Document   : index
    Created on : 5/06/2018, 07:35:00 PM
    Author     : Carlos Andrés Chapid Inga 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- CSS de Bootstrap -->
<%@ include file="templates/head.jsp" %>

<title>Plantilla básica de Bootstrap</title>


<!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<%@ include file="templates/navbar.jsp" %>
<!--Aqui inicial el contenido-->
<%@ include file="templates/eventos-registrados.jsp" %>
<%@ include file="templates/canchas-registradas.jsp" %>
<%@ include file="templates/paquetes-vendidos.jsp" %>
<%@ include file="templates/campeonatos-registrados.jsp" %>

<!--Hasta aqui va el contenido-->
<%@ include file="templates/footer.jsp" %>