<%-- 
    Document   : mensaje
    Created on : 12/06/2018, 06:08:50 PM
    Author     : Carlos Andrés Chapid Inga 
--%>
<!--MENSAJE CORRECTO-->
<% if (null != request.getAttribute("correcto")) { %>   
<%--if (null != response.getHeader("correcto")) { --%>   
<div class="alert alert-success alert-dismissible" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
    <strong>Correcto!</strong> <%= request.getAttribute("correcto") %>
    <%--<strong>Correcto!</strong> <%= response.getHeader("correcto") --%>
</div>
<% }%>


<!--MENSAJE DE ERROR-->
<% if (null != request.getAttribute("error")) { %>   
<div class="alert alert-danger alert-dismissible" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
    <strong>Correcto!</strong> <%= request.getAttribute("error") %>
</div>
<% }%>

