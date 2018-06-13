<%-- 
    Document   : eventos-registrados
    Created on : 12/06/2018, 11:09:55 PM
    Author     : Carlos Andrés Chapid Inga 
--%>

<%@page import="model.Campeonato"%>
<%@page import="controller.InicioServlet"%>
<div class=" panel panel-primary">
    <div class="panel-heading">
        <h3 class="text-center panel-title">CAMPEONATOS REGISTRADOS</h3>
    </div>
    <div class="panel-body">
        <div class="table-responsive">
        <table class="table table-hover">
            <tr>
                <th>Nombre</th>
                <th>Número de equipos</th>
                <th>Costo de la planilla</th>
                <th>Fecha Inicio</th>
                <th>Fecha Fin</th>
                <th>Reglas</th>
            </tr>
            <%
                for (Campeonato campeonato : InicioServlet.campeonatos) {
            %>
            <tr>
                <td>
                    <%= campeonato.getNombre()%>
                </td>
                <td>
                    <%= campeonato.getNumeroEquipos()%>
                </td>
                <td>
                    <%= campeonato.getCostoPlanilla()%>
                </td>
                <td>
                    <%= campeonato.getFechaInicio().toLocaleString()%>
                </td>
                <td>
                    <%= campeonato.getFechaFin().toLocaleString()%>
                </td>
                <td>
                    <p>
                        <%= campeonato.getReglas()%>
                    </p>
                </td>

            </tr>
            <%
                }
            %>
        </table>
        </div>
    </div>
</div>
