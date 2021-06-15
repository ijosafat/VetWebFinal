<%@page session="true" language="java" import="java.util.*" %>
<%@page import="controlador.checkLoginClass"%>
<%
    String Usuario = request.getParameter("txtUsuario");
    String clave = request.getParameter("txtclave");
    
    int val = checkLoginClass.verifyUser(Usuario, clave);
    
    if (val == 1) {      
        //Se asignan parametros de sesión
        HttpSession sesionOk = request.getSession();
        sesionOk.setAttribute("usuario", Usuario);
%>
<jsp:forward page="Home.jsp" />
<%
} else {
%>
<jsp:forward page="Login.jsp">
    <jsp:param name="error" value="Usuario y/o clave Incorrecto. Vuelve a intentarlo" />
</jsp:forward>
<%
    }  
%>