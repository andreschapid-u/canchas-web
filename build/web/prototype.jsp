<%-- 
    Document   : prototype
    Created on : 12/06/2018, 01:30:03 AM
    Author     : Carlos Andrés Chapid Inga 
--%>

<%@page import="controller.InicioServlet"%>
<%@page import="model.Cancha"%>
<%@page import="model.canchas.CanchaPrototype"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- CSS de Bootstrap -->
<%@ include file="templates/head.jsp" %>

<title>Patrón PROTOTYPE</title>


<!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<%@ include file="templates/navbar.jsp" %>
<!--Aqui inicial el contenido-->
<div class="row">
    <h1 class="text-uppercase text-center">Patrón PROTOTYPE</h1>

    <%@ include file="templates/mensaje.jsp" %>
    <div class="col-sm-6">
        <div class=" panel panel-primary">
            <div class="panel-heading">
                <h3 class="text-center panel-title">Registro de nueva cancha</h3>
            </div>
            <form class="form-horizontal" action="inicio" method="POST">
                <input type="hidden" name="accion" value="nueva-cancha" />
                <div class="panel-body">
                    <div class="form-group">
                        <label for="nombre" class="col-sm-3 control-label">Nombre</label>
                        <div class="col-sm-9">
                            <input required type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de la cancha">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="direccion" class="col-sm-3 control-label">Dirección</label>
                        <div class="col-sm-9">
                            <input required type="text" class="form-control" id="direccion" name="direccion" placeholder="Dirección de la cancha">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="tipo" class="col-sm-3 control-label">Tipo de cancha</label>
                        <div class="col-sm-9">
                            <select required name="tipo" id="tipo" class="form-control">
                                <option value="">Seleccione uno</option>
                                <%
                                    for (Cancha cancha : CanchaPrototype.getAllCanchas()) {
                                %>
                                <option value="<%= cancha.getId()%>">
                                    <%= cancha.getTipo()%>
                                </option>
                                <%
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="costo" class="col-sm-3 control-label">Consto $</label>
                        <div class="col-sm-9">
                            <input required type="number" min="1000" class="form-control" id="costo" name="costo" placeholder="Valor de la cancha X 1H">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">

                                <input name="estado" id="estado" type="checkbox" /> 
                                <label for="estado" >Esta Fincionando?</label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel-footer">
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-8">
                            <button type="submit" class="btn btn-block btn-success">Registrar cancha</button>
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </div>
    <div class="col-sm-6">
        <div class=" panel panel-default">
            <div class="panel-heading">
                <h3 class="text-center panel-title">Prototipos</h3>
            </div>
            <div class="panel-body">
                <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>TIPO</th>
                        <th>TAMAÑO MIN.</th>
                        <th>TAMAÑO MAX.</th>
                    </tr>
                    <%
                        for (Cancha cancha : CanchaPrototype.getAllCanchas()) {
                    %>
                    <tr>
                        <td>
                            <%= cancha.getId()%>
                        </td>
                        <td>
                            <%= cancha.getTipo()%>
                        </td>
                        <td>
                            <%= cancha.getMedidaMin()%>
                        </td>
                        <td>
                            <%= cancha.getMedidaMax()%>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </table>

            </div>
        </div>
    </div>

    <div class="col-sm-offset-2 col-sm-8">
        <%@ include file="templates/canchas-registradas.jsp" %>
    </div>
</div>
<!--Hasta aqui va el contenido-->
<%@ include file="templates/footer.jsp" %>