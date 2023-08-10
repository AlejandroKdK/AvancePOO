

package Modelo;

import Controlador.Controladora;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VentaDAO {
    private List<ProductoDTO> listaTemporal = new ArrayList<>();
    DefaultTableModel modeloTabla = new DefaultTableModel();
  
    public VentaDAO() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");
    }

    public void AgregarProductosLista(String codigoProducto, String nombreProducto, String cantidadProductos, JTable tablaVentas, Connection connex, Logica logic) {
        try {
            int cantidad = Integer.parseInt(cantidadProductos);
            String sql = "SELECT * FROM producto WHERE codigoProducto = ? AND nombreProducto = ?";
            PreparedStatement consulta = connex.prepareStatement(sql);
            consulta.setString(1, codigoProducto);
            consulta.setString(2, nombreProducto);
            ResultSet resultado = consulta.executeQuery();

            boolean productoExistente = false;

            while (resultado.next()) {
                int cantidadBD = resultado.getInt("stock");
                double precio = resultado.getDouble("precioUnitario");
                int idProducto = resultado.getInt("idProducto");

                if (cantidad <= cantidadBD) {
                    ProductoDTO nuevoProducto = new ProductoDTO(codigoProducto, nombreProducto, cantidad, precio, idProducto);
                    
                    // Verificar si el producto ya existe en la listaTemporal
                    for (ProductoDTO producto : listaTemporal) {
                        if (producto.getCodigoProducto().equals(codigoProducto)) {
                            productoExistente = true;
                            break;
                        }
                    }

                    if (productoExistente) {
                        throw new Exception("El producto ya está en la lista.");
                    }
                    
                    listaTemporal.add(nuevoProducto);
                    Object[] datos = new Object[5];
                    datos[0] = idProducto;
                    datos[1] = codigoProducto;
                    datos[2] = nombreProducto;
                    datos[3] = cantidad;
                    datos[4] = precio;
                    modeloTabla.addRow(datos);
                    
                    CalculoSubtotalThread calculoSubtotalThread = new CalculoSubtotalThread(listaTemporal, logic);
                    calculoSubtotalThread.start();
            
                } else {
                    throw new Exception("La cantidad excede el inventario.");
                }
            }

            tablaVentas.setModel(modeloTabla);

            resultado.close();
            consulta.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   public void EliminarProductoLista(int indice, JTable tablaVentas) {
        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione primero una fila para eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (indice >= 0 && indice < listaTemporal.size()) {
            listaTemporal.remove(indice);

            modeloTabla.setRowCount(0);

            for (ProductoDTO producto : listaTemporal) {
                Object[] datos = new Object[5];
                datos[0] = producto.getIdProducto();
                datos[1] = producto.getCodigoProducto();
                datos[2] = producto.getNombreProducto();
                datos[3] = producto.getStock();
                datos[4] = producto.getPrecioProducto();
                modeloTabla.addRow(datos);
            }

            tablaVentas.setModel(modeloTabla);
        }
    }

    public void ModificarProductoLista(int filaSeleccionada, JTable tablaVentas, Logica logic) {
       if (filaSeleccionada == -1) {
         JOptionPane.showMessageDialog(null, "Seleccione primero una fila para modificar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
       }else {
        ProductoDTO productoSeleccionado = listaTemporal.get(filaSeleccionada);
        String codigoProducto = productoSeleccionado.getCodigoProducto();
        String nombreProducto = productoSeleccionado.getNombreProducto();
        int stock = productoSeleccionado.getStock();
        logic.ModificarProductosLista(codigoProducto, nombreProducto, stock);
     }
    }

  public void ModificarProductoLista(String codigoProducto, String nombreProducto, String cantidad, JTable tablaVentas) {
    try {
        int nuevaCantidad = Integer.parseInt(cantidad);
        
        for (ProductoDTO producto : listaTemporal) {
            if (producto.getCodigoProducto().equals(codigoProducto) && producto.getNombreProducto().equals(nombreProducto)) {
                // Encontrado el producto, modificar la cantidad
                producto.setStock(nuevaCantidad);
                break; // Terminar el bucle una vez que se ha encontrado y modificado el producto
            }
        }
        
        // Actualizar la tabla de ventas si es necesario
        if (tablaVentas != null) {
            modeloTabla.setRowCount(0); // Limpiar la tabla
            for (ProductoDTO producto : listaTemporal) {
                Object[] datos = new Object[5];
                datos[0] = producto.getIdProducto();
                datos[1] = producto.getCodigoProducto();
                datos[2] = producto.getNombreProducto();
                datos[3] = producto.getStock();
                datos[4] = producto.getPrecioProducto();
                modeloTabla.addRow(datos);
            }
            tablaVentas.setModel(modeloTabla);
            
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La cantidad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}



