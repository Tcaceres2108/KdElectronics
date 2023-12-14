
package kdelectronics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clientes {

    static int obtenerSiguienteId(Connection conexion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Creacion atributos
    private int idclientes;
    private String nombrecliente;
    private String direccion;
    private String correo;
    private String telefono;

    //Constructor
    public clientes(int idclientes, String nombrecliente, String direccion, String correo, String telefono) {
        this.idclientes = idclientes;
        this.nombrecliente = nombrecliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    clientes() {
            }

    //Los Getters and Setter son métodos especiales que nos permiten traer los valores de cada uno de los atributos que se tienen dentro de una clase
    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
     public String toString() {
        return "Cliente ID: " + idclientes + ", Nombre: " + nombrecliente + ", Dirección: " + direccion
                + ", Correo: " + correo + ", Teléfono: " + telefono;
    }
}

/*public static int obtenerSiguienteId(Connection conexion) throws SQLException {
        String sql = "SELECT MAX(idclientes) FROM clientes";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            int ultimoId = 0;
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }

            return ultimoId + 1;
        }
    }
}*/
