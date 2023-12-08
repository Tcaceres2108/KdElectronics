
package kdelectronics;


public class clientes {
    //Creacion atributos
    private int idclientes;
    private String nombrecliente;
    private String direccion;
    private String correo;
    private int telefono;

    //Constructor
    public clientes(int idclientes, String nombrecliente, String direccion, String correo, int telefono) {
        this.idclientes = idclientes;
        this.nombrecliente = nombrecliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
