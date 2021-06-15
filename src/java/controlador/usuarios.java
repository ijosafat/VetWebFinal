package controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import sv.edu.ujmd.modelo.conexion;


public class usuarios {
    private int idusuarios;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String correo;
    private String ultimoIngreso;
    private int idRoles;
    
    private String Insertar = "CALL InsertarPersona(?,?,?,?,?,?)";
    private String Modificar = "CALL ModificarPersonas(?,?,?,?,?,?)";
    private String Eliminar = "CALL BorrarPersonas(?)";
    private String Seleccion = "select * from personas";
    private int Columnas = 0;
    private Connection con;

    public usuarios() {
        con = conexion.Conectar();
    }
//------------------------------METODOS SET Y GET-------------------------------
    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUltimoIngreso() {
        return ultimoIngreso;
    }

    public void setUltimoIngreso(String ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }
    //-------------------------METODOS SET Y GET--------------------------------
    public String getInsertar() {
        return Insertar;
    }

    public void setInsertar(String Insertar) {
        this.Insertar = Insertar;
    }

    public String getModificar() {
        return Modificar;
    }

    public void setModificar(String Modificar) {
        this.Modificar = Modificar;
    }

    public String getEliminar() {
        return Eliminar;
    }

    public void setEliminar(String Eliminar) {
        this.Eliminar = Eliminar;
    }

    public String getSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(String Seleccion) {
        this.Seleccion = Seleccion;
    }

    public int getColumnas() {
        return Columnas;
    }

    public void setColumnas(int Columnas) {
        this.Columnas = Columnas;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
//------------------------------------------------------------------------------
    //PROCEDIMIENTOS 
    
   public DefaultTableModel CargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            Connection con;
            con = conexion.Conectar();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(getSeleccion());
            ResultSetMetaData md = rs.getMetaData();
            int columnas = md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(md.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                fila = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    public String IngresarDatos(int id, String nombres, String apellido, String email, String telefono, String direccion) {
        String resultado;
        try {
            CallableStatement cmst = con.prepareCall(getInsertar());
            cmst.setInt(1, id);
            cmst.setString(2, nombres);
            cmst.setString(3, apellido);
            cmst.setString(4, email);
            cmst.setString(5, telefono);
            cmst.setString(6, direccion);
            cmst.execute();
            resultado = " Los datos se ingresaron exitosamente";
            con.close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }
    
    public String ModificarDatos(int id, String nombre, String apellido, String email, String telefono) {
        String resultado;
        try {
            con = conexion.Conectar();
            CallableStatement cmst = con.prepareCall(getModificar());
            cmst.setInt(1, id);
            cmst.setString(2, nombre);
            cmst.setString(3, apellido);
            cmst.setString(4, email);
            cmst.setString(5, telefono);
            cmst.execute();
            resultado = "Los datos se modificaron correctamente !!!";
            con.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
    
    
    public String EliminarDatos(int id) {
        String resultado;
        try {
            con = conexion.Conectar();
            CallableStatement cmst = con.prepareCall(getEliminar());
            cmst.setInt(1, id);
            cmst.execute();
            resultado = "Los datos se eliminaron correctamente";
            con.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }

}
