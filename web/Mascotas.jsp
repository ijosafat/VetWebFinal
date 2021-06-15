<%@page import="sv.edu.ujmd.modelo.conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Base64"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<html>
    <head>
        <meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
        <title>Registro Mascotas</title>
        <link href="css/Estilos.css" rel="stylesheet" type="text/css"/>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <body>
        
        <nav class="navbar navbar-dark bg-dark">
            <a style="color: white" class="navbar-toggler" ><span class="navbar-toggler-icon"></span>Mascotas</a>
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
        
        <p>
        <h5 class="titulo" style=" font-size: 50px;">Registro Mascotas</h5>
    </p>
    <img src="img/vet.png" heigh="80" width="90" style="margin-left: 635px;"/>
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="/VeterinariaWeb/Home.jsp#">Inicio</a></li>
            <li class="breadcrumb-item"><a href="http://localhost:8080/VeterinariaWeb/Clientes.jsp" >Registro cliente</a></li>
            <li class="breadcrumb-item"><a href="http://localhost:8080/VeterinariaWeb/Mascotas.jsp">Registro mascota</a></li>
            <li class="breadcrumb-item"><a href="http://localhost:8080/VeterinariaWeb/Citas.jsp">Registro cita</a></li>
        </ol>
    </nav>
    <div class=" medio container">
        <div class="form-group">
            <label for="id">ID</label>
            <div class="input-group">
                <input type="text" class="form-control" name="id" id="idcliente" placeholder="Ingrese ID" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>            

        <div class="form-group">
            <label for="nombres">Nombre</label>
            <div class="input-group">
                <input type="text" class="form-control" name="nombres" id="nombres" placeholder="Ingrese los nombres" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>
        <div class="form-group">
            <label for="especie">Especie</label>
            <div class="input-group">
                <input type="text" class="form-control" name="especie" id="especie" placeholder="Ingrese la especie" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>
        <div class="form-group">
            <label for="raza">Raza</label>
            <div class="input-group">
                <input type="text" class="form-control" name="raza" id="raza" placeholder="Ingrese la raza" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>
        <div class="form-group">
            <label for="edad">Edad</label>
            <div class="input-group">
                <input type="text" class="form-control" name="edad" id="edad" placeholder="Ingrese la edad" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>
        <div class="form-group">
            <label for="dueño">Dueño</label>
            <div class="input-group">
                <input type="text" class="form-control" name="dueño" id="direccion" placeholder="Ingrese el dueño" required>
                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
        </div>
        <input type="submit" class="btn btn-info" value="Guardar" style="margin-left: 825px;">
        <input type="submit" class="btn btn-danger" value="eliminar"> 
        <input type="submit" class="btn btn-primary" value="modificar">
        <div class ="row col-md-6" style="margin-left: 250px; margin-top: -10px;">
            <table class="table table-striped table-bordered table-hover">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Especie</th>
                        <th>Raza</th>
                        <th>Edad</th>
                        <th>Dueño</th>
                    </tr>
                    <tr>
                        <td>"id"</td>
                        <td>"nombre"</td>
                        <td>"especie"</td>
                        <td>"raza"</td>
                        <td>"edad"</td>
                        <td>"dueño"</td>

                    </tr>
                </thead>
            </table>
        </div>
    </div>
</body>
</html>
