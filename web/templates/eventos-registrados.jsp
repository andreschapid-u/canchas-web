<%-- 
    Document   : eventos-registrados
    Created on : 12/06/2018, 11:09:55 PM
    Author     : Carlos Andrés Chapid Inga 
--%>

<%@page import="model.Evento"%>
<%@page import="controller.InicioServlet"%>
<div class=" panel panel-success">
    <div class="panel-heading">
        <h3 class="text-center panel-title">EVENTOS PUBLICADOS</h3>
    </div>
    <div class="panel-body">
        <div class="table-responsive">
        <table class="table table-hover">
            <tr>
                <th>Nombre</th>
                <th>Tipo de evento</th>
                <th>Fecha Inicio</th>
                <th>Fecha Fin</th>
                <th>Descripción</th>
            </tr>
            <%
                for (Evento evento : InicioServlet.eventos) {
            %>
            <tr>
                <td>
                    <%= evento.getNombre()%>
                </td>
                <td>
                    <%= evento.publicar()%>
                </td>
                <td>
                    <%= evento.getFechaInicio().toLocaleString()%>
                </td>
                <td>
                    <%= evento.getFechaFin().toLocaleString()%>
                </td>
                <td>
                    <p>
                        <%= evento.getDescripcion()%>
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
