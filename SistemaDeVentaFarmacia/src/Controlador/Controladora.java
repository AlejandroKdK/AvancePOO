
package Controlador;

import Modelo.Logica;
import Vista.*;
import javax.swing.JTable;


public class Controladora {
    private Logica logic;
    private VentanaInicioSesion vtnInicio;
    private VentanaPrincipal vtnPrincipal;
    private VentanaRegistroEmpleado vtnRegistroEmp;
    private VentanaVenta vtnVenta;
    private VentanaProductos vtnProductos;
    private VentanaClientes vtnClientes;
    private VentanaEmpleados vtnEmpleados;
    private VentanaProveedores vtnProveedores;
    private VentanaCompra vtnCompra;
    
    public void setLogic(Logica logic) {
        this.logic = logic;
    }

    public void setVtnCompra(VentanaCompra vtnCompra) {
        this.vtnCompra = vtnCompra;
    }

    
    public void setVtnProveedores(VentanaProveedores vtnProveedores) {
        this.vtnProveedores = vtnProveedores;
    }

    
    public void setVtnEmpleados(VentanaEmpleados vtnEmpleados) {
        this.vtnEmpleados = vtnEmpleados;
    }
    

    public void setVtnRegistroEmp(VentanaRegistroEmpleado vtnRegistroEmp) {
        this.vtnRegistroEmp = vtnRegistroEmp;
    }

    public void setVtnClientes(VentanaClientes vtnClientes) {
        this.vtnClientes = vtnClientes;
    }
    

    public void setVtnVenta(VentanaVenta vtnVenta) {
        this.vtnVenta = vtnVenta;
    }

    public void setVtnProductos(VentanaProductos vtnProductos) {
        this.vtnProductos = vtnProductos;
    }
    
    

    public void setVtnInicio(VentanaInicioSesion vtnInicio) {
        this.vtnInicio = vtnInicio;
    }

  

    public void setVtnPrincipal(VentanaPrincipal vtnPrincipal) {
        this.vtnPrincipal = vtnPrincipal;
    }

 

    public void MostrarDatosModificados(String[] datos) {
        //vtnEditar.MostrarDatosTextfield(datos);
        
    }

    public void ValidarUsuario(String nombreUsuario, String contra) {
      logic.ValidarUsuario(nombreUsuario, contra, logic);
        
    }

    public void MuestraVentanaRegistroEmpleado() {
        vtnInicio.setVisible(false);
        //vtnRegistroEmpleado.setVisible(true);
        
    }

    public void MuestraVentanaRegistrarEmpleado() {
     
        
        
    }

    public void MuestraVentanaAdministrador() {
      vtnInicio.setVisible(false);
      vtnPrincipal.setVisible(true);
      vtnVenta.setSize(680, 504);
      vtnVenta.setVisible(true);
      vtnPrincipal.MostrarContenido(vtnVenta);
    }

    public void MuestraVentanaProductos() {
        vtnProductos.setSize(680, 504);
        vtnProductos.setVisible(true);
        vtnPrincipal.MostrarContenidoProductos(vtnProductos);
    }

    public void MuestraVentanaClientes() {
        vtnClientes.setSize(680, 504);
        vtnClientes.setVisible(true);
        vtnPrincipal.MostrarContenidoClientes(vtnClientes);
    }

    public void MuestraVentanaEmpleados() {
       vtnEmpleados.setSize(680, 504);
       vtnEmpleados.setVisible(true);
       vtnPrincipal.MostrarContenidoEmpleados(vtnEmpleados);
    }

    public void MuestraVentanaProveedores() {
       vtnProveedores.setSize(680, 504);
       vtnProveedores.setVisible(true);
       vtnPrincipal.MostrarContenidoProveedores(vtnProveedores);
    }

    public void MuestraVentanaCompra() {
       vtnCompra.setSize(680, 504);
       vtnCompra.setVisible(true);
       vtnPrincipal.MostrarContenidoCompra(vtnCompra);
    }

    public void MuestraVentaInicio() {
      vtnInicio.setVisible(true);
      vtnPrincipal.setVisible(false);
    }

}
