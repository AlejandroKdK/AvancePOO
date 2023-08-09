
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmpleadoDAO {

    public static void ValidarUsuario(String nombre, String contra, Connection connection, Logica logic) {
        
        String query = "SELECT puesto FROM empleado WHERE nombreEmpleado = ? AND contra= ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.setString(2, contra);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String tipoEncontrado = resultSet.getString("puesto");
                if (tipoEncontrado.equals("Empleado común")) {
                  //logic.MostrarVentanaComun();
                } else if (tipoEncontrado.equals("Administrador")) {
                   logic.MuestraVentanaAdministrador();
                 
                }  else if (tipoEncontrado.equals("Bodeguero")) {
                    //logic.MuestraVentanaBodeguero();
                 
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene permisos para acceder a esta ventana.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado. Regístrese primero e intente de nuevo.");
                logic.MuestraVentanaRegistrar();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuario: " + e.getMessage());
        }
        
    }
    
    
}
