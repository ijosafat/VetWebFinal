<%@ page import="controlador.usuarios" import="java.util.*"%>
<%@ page language="java" import="java.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    usuarios u = new usuarios();
    int id = request.getParameter("id");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    String direccion = request.getParameter("direccion");
    
    String resultado = u.IngresarDatos (id, nombre, apellido, email, telefono, direccion);
    
%>