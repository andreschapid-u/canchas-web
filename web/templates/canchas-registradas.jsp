<%-- 
    Document   : canchas-registradas
    Created on : 12/06/2018, 09:23:19 PM
    Author     : Carlos Andrés Chapid Inga 
--%>


<%@page import="controller.InicioServlet"%>
<%@page import="model.Cancha"%>
<div class=" panel panel-primary">
    <div class="panel-heading">
        <h3 class="text-center panel-title">CANCHAS REGISTRADAS</h3>
    </div>
    <div class="panel-body">
        <div class="table-responsive">
        <table class="table table-hover">
            <tr>
                <th>Nombre</th>
                <th>Costo</th>
                <th>Dirección</th>
                <th>Funcionando</th>
                <th>TIPO</th>
                <th>TAMAÑO MIN.</th>
                <th>TAMAÑO MAX.</th>
            </tr>
            <%
                for (Cancha cancha : InicioServlet.canchas) {
            %>
            <tr>
                <td>
                    <%= cancha.getNombre()%>
                </td>
                <td>
                    <%= cancha.getCosto()%>
                </td>
                <td>
                    <%= cancha.getLocalizacion().getDireccion()%>
                </td>
                <td>
                    <% if (cancha.isEstado()) {
                            out.print("Funcionando");
                        } else {
                            out.print("Fuera de Servicio");
                        }
                    %>
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