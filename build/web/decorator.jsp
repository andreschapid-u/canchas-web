<%-- 
    Document   : decorator
    Created on : 12/06/2018, 01:30:15 AM
    Author     : Carlos Andrés Chapid Inga 
--%>

<%@page import="controller.InicioServlet"%>
<%@page import="model.paquetes.PaqueteBasico"%>
<%@page import="model.Paquete"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- CSS de Bootstrap -->
<%@ include file="templates/head.jsp" %>

<title>Patrón DECORATOR</title>
<%
    PaqueteBasico p = new PaqueteBasico();
%>

<!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<%@ include file="templates/navbar.jsp" %>
<!--Aqui inicial el contenido-->
<div class="row">
    <h1 class="text-uppercase text-center">Patrón DECORATOR</h1>
    <%@ include file="templates/mensaje.jsp" %>
    <div class="col-sm-6">
        <div class=" panel panel-primary">
            <div class="panel-heading">
                <h3 class="text-center panel-title">Comprar Paquete</h3>
            </div>
            <form class="form-horizontal" action="inicio" method="POST">
                <input type="hidden" name="accion" value="registrar-paquete" />
                <div class="panel-body">
                    <div class="form-group">
                        <label for="nombre" class="col-sm-3 control-label">Paquete actual</label>
                        <div class="col-sm-9">
                            <input readonly type="text" class="form-control" id="nombre" value="<%= p.getDescripcion()%>" placeholder="Nombre de la cancha">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="costo" class="col-sm-3 control-label">Consto $</label>
                        <div class="col-sm-9">
                            <input readonly type="number" min="1000" class="form-control" id="costo" value="<%= p.getValor()%>" placeholder="Valor de la cancha X 1H">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="horas" class="col-sm-3 control-label">Cantidad de horas</label>
                        <div class="col-sm-9">
                            <input required type="number" value="1" name="horas" min="1" class="form-control" id="horas"  placeholder="Cantidad de horas que reservara la cancha">
                        </div>
                    </div>

                        <div class="page-header"> Paquetes adiciones que puede adquirir</div>   
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <input name="bebida" id="bebida" type="checkbox" /> 
                                <label for="bebida" >Bebida Incluida</label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <input name="uniforme" id="uniforme" type="checkbox" /> 
                                <label for="uniforme" >Uniformes Incluidos</label>
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
                <h3 class="text-center panel-title">Paquetes disponibles</h3>
            </div>
            <div class="panel-body">
                <table class="table table-hover">
                    <tr>
                        <th>NOMBRE</th>
                        <th>VALOR ADICIONAL</th>
                    </tr>
                    <%
                        for (Paquete paquete : InicioServlet.paquetes) {
                    %>
                    <tr>
                        <td>
                            <%= paquete.getDescripcion()%>
                        </td>
                        <td>
                            <%= paquete.getValor()%>
                        </td>

                    </tr>
                    <%
                        }
                    %>
                </table>

            </div>
        </div>
<!--    </div>

    <div class="col-sm-offset-2 col-sm-8">-->
<%@ include file="templates/paquetes-vendidos.jsp" %>
    </div>

</div>
<!--Hasta aqui va el contenido-->
<%@ include file="templates/footer.jsp" %>