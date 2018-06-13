package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/templates/head.jsp");
    _jspx_dependants.add("/templates/navbar.jsp");
    _jspx_dependants.add("/templates/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- CSS de Bootstrap -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\"/>-->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/estilos.css\" rel=\"stylesheet\" media=\"screen\"/>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<title>Plantilla básica de Bootstrap</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"padding-top: 60px;\">\n");
      out.write("\n");
      out.write("    <div class=\"container\" style=\"padding-top: 1.8em;\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex6-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Desplegar navegaciï¿½n</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Canchas Sinteticas</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex6-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"index.jsp\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"adapter.jsp\">Patrón Adapter</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"decorator.jsp\">Patrón Decoractor</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"prototype.jsp\">Patrón Prototype</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p class=\"text-capitalize text-success\">Elaborado por: Luisa Gomez Robles - Carlos Rendon - Carlos Chapid</p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">");
      out.write("\n");
      out.write("<!--Aqui inicial el contenido-->\n");
      out.write("<p>\n");
      out.write("    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("    Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit, nec luctus magna felis sollicitudin mauris. Integer in mauris eu nibh euismod gravida. Duis ac tellus et risus vulputate vehicula. Donec lobortis risus a elit. Etiam tempor. Ut ullamcorper, ligula eu tempor congue, eros est euismod turpis, id tincidunt sapien risus a quam. Maecenas fermentum consequat mi. Donec fermentum. Pellentesque malesuada nulla a mi. Duis sapien sem, aliquet nec, commodo eget, consequat quis, neque. Aliquam faucibus, elit ut dictum aliquet, felis nisl adipiscing sapien, sed malesuada diam lacus eget erat. Cras mollis scelerisque nunc. Nullam arcu. Aliquam consequat. Curabitur augue lorem, dapibus quis, laoreet et, pretium ac, nisi. Aenean magna nisl, mollis quis, molestie eu, feugiat in, orci. In hac habitasse platea dictumst.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("    Fusce convallis, mauris imperdiet gravida bibendum, nisl turpis suscipit mauris, sed placerat ipsum urna sed risus. In convallis tellus a mauris. Curabitur non elit ut libero tristique sodales. Mauris a lacus. Donec mattis semper leo. In hac habitasse platea dictumst. Vivamus facilisis diam at odio. Mauris dictum, nisi eget consequat elementum, lacus ligula molestie metus, non feugiat orci magna ac sem. Donec turpis. Donec vitae metus. Morbi tristique neque eu mauris. Quisque gravida ipsum non sapien. Proin turpis lacus, scelerisque vitae, elementum at, lobortis ac, quam. Aliquam dictum eleifend risus. In hac habitasse platea dictumst. Etiam sit amet diam. Suspendisse odio. Suspendisse nunc. In semper bibendum libero.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("    Proin nonummy, lacus eget pulvinar lacinia, pede felis dignissim leo, vitae tristique magna lacus sit amet eros. Nullam ornare. Praesent odio ligula, dapibus sed, tincidunt eget, dictum ac, nibh. Nam quis lacus. Nunc eleifend molestie velit. Morbi lobortis quam eu velit. Donec euismod vestibulum massa. Donec non lectus. Aliquam commodo lacus sit amet nulla. Cras dignissim elit et augue. Nullam non diam. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. In hac habitasse platea dictumst. Aenean vestibulum. Sed lobortis elit quis lectus. Nunc sed lacus at augue bibendum dapibus.\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<!--Hasta aqui va el contenido-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- <div class=\"hidden-sm hidden-xs col-md-offset-1 col-md-3   right\">\n");
      out.write("        <div class=\"col-sm-12 modal-content\">\n");
      out.write("            <center>\n");
      out.write("                <h3>Patrï¿½n Adapter</h3>\n");
      out.write("                <a href=\"adapter.jsp\" class=\"btn btn-success btn-sm btn-lg\">Ir al Ejemplo</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-12 modal-content\">\n");
      out.write("            <center>\n");
      out.write("                <h3>Patrï¿½n Decorator</h3>\n");
      out.write("                <a href=\"decorator.jsp\" class=\"btn btn-success btn-sm btn-lg\">Ir al Ejemplo</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-12 modal-content\">\n");
      out.write("            <center>\n");
      out.write("                <h3>Patrï¿½n Prototype</h3>\n");
      out.write("                <a href=\"prototype.jsp\" class=\"btn btn-success btn-sm btn-lg\">Ir al Ejemplo</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </div> -->\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"height: 60px; position: absolute; bottom: 0px; background-color: #000;\"></div>\n");
      out.write("    <!-- Librerï¿½a jQuery requerida por los plugins de JavaScript -->\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Todos los plugins JavaScript de Bootstrap (tambiï¿½n puedes\n");
      out.write("     incluir archivos JavaScript individuales de los ï¿½nicos\n");
      out.write("     plugins que utilices) -->\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
