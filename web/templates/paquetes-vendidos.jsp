<%-- 
    Document   : paquetes-vendidos
    Created on : 12/06/2018, 09:18:07 PM
    Author     : Carlos Andrés Chapid Inga 
--%>
<%@page import="controller.InicioServlet"%>
<%@page import="model.Paquete"%>

<div class=" panel panel-danger">
    <div class="panel-heading">
        <h3 class="text-center panel-title">PAQUETES VENDIDOS</h3>
    </div>
    <div class="panel-body">
        <div class="table-responsive">
        <table class="table table-hover">
            <tr>
                <th>NOMBRE</th>
                <th>VALOR ADICIONAL</th>
            </tr>
            <%
                for (Paquete paquete : InicioServlet.paquetesVendidos) {
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
</div>
