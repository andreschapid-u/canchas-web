<%-- 
    Document   : reserva
    Created on : 12/06/2018, 12:31:44 AM
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
<div class="row">
    <h1 class="text-uppercase text-center">Patrón PROTOTYPE</h1>

    <%@ include file="templates/mensaje.jsp" %>
    <div class="col-sm-6">
        <div class=" panel panel-primary">
            <div class="panel-heading">
                <h3 class="text-center panel-title">Registro nuevo evento</h3>
            </div>
            <form class="form-horizontal" action="inicio" method="POST">
                <input type="hidden" name="accion" value="registrar-evento" />
                <div class="panel-body">
                    <div class="form-group">
                        <label for="nombre" class="col-sm-3 control-label">Nombre del Evento</label>
                        <div class="col-sm-9">
                            <input required type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre del evento">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="fecha-inicio" class="col-sm-3 control-label">Fecha Inicio</label>
                        <div class="col-sm-9">
                            <div class='input-group date datetimepicker' >
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input required type='text' name="fecha-inicio" id="fecha-inicio" class="form-control" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="fecha-fin" class="col-sm-3 control-label">Fecha Fin</label>
                        <div class="col-sm-9">
                            <div class='input-group date datetimepicker' >
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input required type='text' name="fecha-fin" if="fecha-fin" class="form-control" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="tipo" class="col-sm-3 control-label">Tipo de evento</label>
                        <div class="col-sm-9">
                            <select required name="tipo" id="tipo" class="form-control">
                                <option value="">Seleccione uno</option>
                                <option value="facebook">FACEBOOK</option>
                                <option value="twitter">TWITTER</option>
                            </select>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="descripcion" class="col-sm-3 control-label">Descripción</label>
                        <div class="col-sm-9">
                            <textarea required maxlength="500" style="resize: vertical; max-height: 250px;" class="form-control" id="descripcion" name="descripcion" placeholder="Nombre del evento"></textarea>
                        </div>
                    </div>

                </div>
                <div class="panel-footer">
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-8">
                            <button type="submit" class="btn btn-block btn-success">Registrar evento</button>
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </div>

    <div class="col-sm-6">
        <div class=" panel panel-primary">
            <div class="panel-heading">
                <h3 class="text-center panel-title">Registro nuevo Campeonato</h3>
            </div>
            <form class="form-horizontal" action="inicio" method="POST">
                <input type="hidden" name="accion" value="registrar-campeonato" />
                <div class="panel-body">
                    <div class="form-group">
                        <label for="nombrec" class="col-sm-3 control-label">Nombre del Campeonato</label>
                        <div class="col-sm-9">
                            <input required type="text" class="form-control" id="nombrec" name="nombrec" placeholder="Nombre del Campeonato">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="fecha-inicio" class="col-sm-3 control-label">Fecha Inicio</label>
                        <div class="col-sm-9">
                            <div class='input-group date datetimepicker' >
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input required type='text' name="fecha-inicio" id="fecha-inicio" class="form-control" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="fecha-fin" class="col-sm-3 control-label">Fecha Fin</label>
                        <div class="col-sm-9">
                            <div class='input-group date datetimepicker' >
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                                <input required type='text' name="fecha-fin" id="fecha-fin" class="form-control" />
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="num-equipos" class="col-sm-3 control-label">Número de Equipos</label>
                        <div class="col-sm-9">
                            <input required value="12" min="12" type="number" class="form-control" id="num-equipos" name="num-equipos" placeholder="Numero de equipos, minimo 12">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="costo" class="col-sm-3 control-label">Costo Planilla ($)</label>
                        <div class="col-sm-9">
                            <input required min="12" value="300000" type="number" class="form-control" id="costo" name="costo" placeholder="Valor de la Planilla">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="reglas" class="col-sm-3 control-label">Reglas</label>
                        <div class="col-sm-9">
                            <textarea required maxlength="500" style="resize: vertical; max-height: 250px;" class="form-control" id="reglas" name="reglas" placeholder="Ingrese las reglas aquí"></textarea>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="checkbox">
                                <input name="publicar" id="publicar" type="checkbox" /> 
                                <label for="publicar" >Publicar tambien como evento?</label>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="panel-footer">
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-8">
                            <button type="submit" class="btn btn-block btn-success">Registrar evento</button>
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </div>
    <div class="col-sm-offset-1 col-sm-10">
        <%@ include file="templates/eventos-registrados.jsp" %>
    </div>
</div>
<!--Hasta aqui va el contenido-->
<%@ include file="templates/footer.jsp" %>
<script type="text/javascript">
    $(function () {
        $('.datetimepicker').datetimepicker({
            format: 'DD/MM/YYYY'
        });
    });
</script>
