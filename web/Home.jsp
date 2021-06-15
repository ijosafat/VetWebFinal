<%-- 
    Document   : Home
    Created on : 07-jun-2021, 16:58:34
    Author     : Myke
--%>
<%@page import="java.util.Base64"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<html>
    <head>
        <meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
        <title>Menu principal</title>
        <link href="css/Estilos.css" rel="stylesheet" type="text/css"/>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a style="color: white" class="navbar-toggler" ><span class="navbar-toggler-icon"></span>Home</a>
            <div class="dropdown">
                <a style="color: white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar Sesion </a>
                <div class="dropdown-menu text-center">
                    <a><img src="img/usuario.png" height="40" width="40"></a><br>
                    <a>${usuario}</a>
                    <div class="dropdown-divider"></div>
                    <a href="Login.jsp" class="dropdown-item">Salir</a>
                </div>
            </div>
        </nav>
        <div class="container mt-4">
            <h1 style="margin-left: 175px;">Bienvenido a Veterinaria DioFio... <strong>Usuario: ${usuario}</strong></h1>
        </div>
    <body>
        <div class=" medio container">
            <b style="margin-left: 185px;"><h2 style="margin-left:345px;">Seleccione lo que desea hacer</h2></b>
        </div><br><br>
        <div class="contenedor">
            <div class="cliente">
                <div class="contenido-registro">
                    <h3 style="margin-left:575px;">Registrar Cliente</h3>
                    <p class="registrar"></p>
                    <a style="margin-left:660px;" href="/VeterinariaWeb/Clientes.jsp" class="btn btn-primary">Ir a</a>
                </div>
            </div>
        </div>
        <br>
        <div class="contenedor">
            <div class="mascota">
                <div class="contenido-registro">
                    <h3 style="margin-left:575px;">Registrar Mascota</h3>
                    <p class="registrar"></p>
                    <a style="margin-left:660px;" href="/VeterinariaWeb/Mascotas.jsp" class="btn btn-primary">Ir a</a>
                </div>
            </div>
        </div>
        <br>
        <div class="contenedor">
            <div class="mascota">
                <div class="contenido-registro">
                    <h3 style="margin-left:575px;">Registro de cita</h3>
                    <p class="registrar"></p>
                    <a style="margin-left:660px;" href="/VeterinariaWeb/Citas.jsp" class="btn btn-primary">Ir a</a>
                </div>
            </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
