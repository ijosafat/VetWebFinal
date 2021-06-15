package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sv.edu.ujmd.util.conexion;
import java.sql.ResultSet;
import java.util.Base64;

public final class Mascotas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\"content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro Mascotas</title>\n");
      out.write("        <link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" \n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" \n");
      out.write("        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" \n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>\n");
      out.write("        <h5 class=\"titulo\" style=\" font-size: 50px;\">Registro Mascotas</h5>\n");
      out.write("    </p>\n");
      out.write("    <img src=\"img/vet.png\" heigh=\"80\" width=\"90\" style=\"margin-left: 635px;\"/>\n");
      out.write("    <nav aria-label=\"breadcrumb\">\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"/VeterinariaWeb/Home.jsp#\">Inicio</a></li>\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"/VeterinariaWeb/Clientes.jsp\">Registro cliente</a></li>\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"/VeterinariaWeb/Mascotas.jsp#\">Registro mascota</a></li>\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"/VeterinariaWeb/Citas.jsp#\">Registro cita</a></li>\n");
      out.write("\n");
      out.write("        </ol>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\" medio container\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"id\">ID</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"id\" id=\"idcliente\" placeholder=\"Ingrese ID\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>            \n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"nombres\">Nombre</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"nombres\" id=\"nombres\" placeholder=\"Ingrese los nombres\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"especie\">Especie</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"especie\" id=\"especie\" placeholder=\"Ingrese la especie\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"raza\">Raza</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"raza\" id=\"raza\" placeholder=\"Ingrese la raza\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"edad\">Edad</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"edad\" id=\"edad\" placeholder=\"Ingrese la edad\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"dueño\">Dueño</label>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dueño\" id=\"direccion\" placeholder=\"Ingrese el dueño\" required>\n");
      out.write("                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" class=\"btn btn-info\" value=\"Guardar\" style=\"margin-left: 825px;\">\n");
      out.write("        <input type=\"submit\" class=\"btn btn-danger\" value=\"eliminar\"> \n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary\" value=\"modificar\">\n");
      out.write("        <div class =\"row col-md-6\" style=\"margin-left: 250px; margin-top: -10px;\">\n");
      out.write("            <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Especie</th>\n");
      out.write("                        <th>Raza</th>\n");
      out.write("                        <th>Edad</th>\n");
      out.write("                        <th>Dueño</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\"id\"</td>\n");
      out.write("                        <td>\"nombre\"</td>\n");
      out.write("                        <td>\"especie\"</td>\n");
      out.write("                        <td>\"raza\"</td>\n");
      out.write("                        <td>\"edad\"</td>\n");
      out.write("                        <td>\"dueño\"</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
