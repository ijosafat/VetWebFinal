package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\"content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu principal</title>\n");
      out.write("        <link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("            <a style=\"color: white\" class=\"navbar-toggler\" ><span class=\"navbar-toggler-icon\"></span>Home</a>\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <a style=\"color: white\" href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Cerrar Sesion </a>\n");
      out.write("                <div class=\"dropdown-menu text-center\">\n");
      out.write("                    <a><img src=\"img/usuario.png\" height=\"40\" width=\"40\"></a><br>\n");
      out.write("                    <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a href=\"Login.jsp\" class=\"dropdown-item\">Salir</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <h1 style=\"margin-left: 175px;\">Bienvenido a Veterinaria DioFio... <strong>Usuario: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></h1>\n");
      out.write("        </div>\n");
      out.write("    <body>\n");
      out.write("        <div class=\" medio container\">\n");
      out.write("            <b style=\"margin-left: 185px;\"><h2 style=\"margin-left:345px;\">Seleccione lo que desea hacer</h2></b>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <div class=\"cliente\">\n");
      out.write("                <div class=\"contenido-registro\">\n");
      out.write("                    <h3 style=\"margin-left:575px;\">Registrar Cliente</h3>\n");
      out.write("                    <p class=\"registrar\"></p>\n");
      out.write("                    <a style=\"margin-left:660px;\" href=\"/VeterinariaWeb/Clientes.jsp\" class=\"btn btn-primary\">Ir a</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <div class=\"mascota\">\n");
      out.write("                <div class=\"contenido-registro\">\n");
      out.write("                    <h3 style=\"margin-left:575px;\">Registrar Mascota</h3>\n");
      out.write("                    <p class=\"registrar\"></p>\n");
      out.write("                    <a style=\"margin-left:660px;\" href=\"/VeterinariaWeb/Mascotas.jsp\" class=\"btn btn-primary\">Ir a</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <div class=\"mascota\">\n");
      out.write("                <div class=\"contenido-registro\">\n");
      out.write("                    <h3 style=\"margin-left:575px;\">Registro de cita</h3>\n");
      out.write("                    <p class=\"registrar\"></p>\n");
      out.write("                    <a style=\"margin-left:660px;\" href=\"/VeterinariaWeb/Citas.jsp\" class=\"btn btn-primary\">Ir a</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" \n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" \n");
      out.write("        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" \n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
