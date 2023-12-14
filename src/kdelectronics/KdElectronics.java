package kdelectronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class KdElectronics {

    String bd = "kd-electronics";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public KdElectronics(String bd) {
        this.bd = bd;
    }

    private KdElectronics() {

    }

    public Connection conectar() throws SQLException {
        try {
            Class.forName(driver);
            // cadena de Conexion
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conectó a BD " + bd);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se conectó a BD: " + bd);
        }
        return cx;
    }

    // Método para insertar un nuevo cliente
    private static void insertarCliente(Connection conexion) throws SQLException {
        try {
            conexion.setAutoCommit(false);
            // Obtener el siguiente idclientes
            int siguienteId = clientes.obtenerSiguienteId(conexion);
            String sqlInsertarCliente = "INSERT INTO CLIENTES (idclientes, nombrecliente, direccion, correo, telefono) VALUES (?,?,?,?,?)";

            // Configurar el nuevo cliente con un id incrementado
            clientes cliente = new clientes();
            cliente.setIdclientes(siguienteId); // Incrementar el id

            // Utiliza los datos generados por dataRandom
            cliente.setNombrecliente(dataRandom.generarNombre());
            cliente.setDireccion(dataRandom.generarDireccion());
            cliente.setCorreo(dataRandom.generarCorreoElectronico());
            cliente.setTelefono(dataRandom.generarTelefono());

            // Insertar el nuevo cliente
            try (PreparedStatement pstmtInsertarCliente = conexion.prepareStatement(sqlInsertarCliente)) {
                pstmtInsertarCliente.setInt(1, cliente.getIdclientes());
                pstmtInsertarCliente.setString(2, cliente.getNombrecliente());
                pstmtInsertarCliente.setString(3, cliente.getDireccion());
                pstmtInsertarCliente.setString(4, cliente.getCorreo());
                pstmtInsertarCliente.setString(5, cliente.getTelefono());

                int filasInsertadas = pstmtInsertarCliente.executeUpdate();

                if (filasInsertadas > 0) {
                    conexion.commit();
                    System.out.println(filasInsertadas + " Filas insertadas.");
                } else {
                    conexion.rollback();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexión: " + ex.getMessage());
            conexion.rollback();
        } finally {
            // Activar autocommit nuevamente
            conexion.setAutoCommit(true);
        }
    }

    // Método para leer un cliente por ID
    private static clientes leerClientePorId(Connection conexion, int id) throws SQLException {
        clientes clienteLeido = null;

        String sql = "SELECT * FROM CLIENTES WHERE idclientes = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    clienteLeido = new clientes(
                            rs.getInt("idclientes"),
                            rs.getString("nombrecliente"),
                            rs.getString("direccion"),
                            rs.getString("correo"),
                            rs.getString("telefono")
                    );
                }
            }
        }

        return clienteLeido;
    }

    // Método para actualizar un cliente
    private static void actualizarCliente(Connection conexion, clientes cliente) throws SQLException {
        try {
            conexion.setAutoCommit(false);
            String sqlActualizarCliente = "UPDATE CLIENTES SET nombrecliente=?, direccion=?, correo=?, telefono=? WHERE idclientes=?";

            try (PreparedStatement pstmtActualizarCliente = conexion.prepareStatement(sqlActualizarCliente)) {
                pstmtActualizarCliente.setString(1, cliente.getNombrecliente());
                pstmtActualizarCliente.setString(2, cliente.getDireccion());
                pstmtActualizarCliente.setString(3, cliente.getCorreo());
                pstmtActualizarCliente.setString(4, cliente.getTelefono());
                pstmtActualizarCliente.setInt(5, cliente.getIdclientes());

                int filasActualizadas = pstmtActualizarCliente.executeUpdate();

                if (filasActualizadas > 0) {
                    conexion.commit();
                    System.out.println(filasActualizadas + " Filas actualizadas.");
                } else {
                    conexion.rollback();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexión: " + ex.getMessage());
            conexion.rollback();
        } finally {
            // Activar autocommit nuevamente
            conexion.setAutoCommit(true);
        }
    }

    // Método para eliminar un cliente por ID
    private static void eliminarClientePorId(Connection conexion, int id) throws SQLException {
        try {
            conexion.setAutoCommit(false);
            String sqlEliminarCliente = "DELETE FROM CLIENTES WHERE idclientes=?";

            try (PreparedStatement pstmtEliminarCliente = conexion.prepareStatement(sqlEliminarCliente)) {
                pstmtEliminarCliente.setInt(1, id);

                int filasEliminadas = pstmtEliminarCliente.executeUpdate();

                if (filasEliminadas > 0) {
                    conexion.commit();
                    System.out.println(filasEliminadas + " Filas eliminadas.");
                } else {
                    conexion.rollback();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexión: " + ex.getMessage());
            conexion.rollback();
        } finally {
            // Activar autocommit nuevamente
            conexion.setAutoCommit(true);
        }
    }

    public static void main(String[] args) {
        try {
            KdElectronics kdElectronics = new KdElectronics("kd-electronics");
            Connection conexion = kdElectronics.conectar();

        // Insertar un nuevo cliente
            insertarCliente(conexion);

            // Leer un cliente por ID 
        Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el ID del cliente a buscar: ");
            int idClienteBuscar = scanner.nextInt();

            clientes clienteLeido = leerClientePorId(conexion, idClienteBuscar);

            if (clienteLeido != null) {
                System.out.println("Estos son los datos del ID ingresado: " + clienteLeido);
            } else {
                System.out.println("No se encontró ningún cliente con el ID proporcionado.");
            }


         // Actualizar un cliente 
            clienteLeido.setNombrecliente("Juan Vargas");
            actualizarCliente(conexion, clienteLeido);

         // Eliminar un cliente por ID 
            eliminarClientePorId(conexion, 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
