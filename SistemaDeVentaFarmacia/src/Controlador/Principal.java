
package Controlador;

import Modelo.ConexionBD;
import Modelo.Logica;
import Vista.*;


public class Principal {
    public static void main(String[] arg){
        //Paso 1. Crear a todos los objetos que forman parte del proyecto
        Controladora control=new Controladora();
        VentanaPrincipal vtnPrincipal=new VentanaPrincipal();
        VentanaInicioSesion vtnInicio = new VentanaInicioSesion();
        VentanaRegistroEmpleado vtnRegistroEmp = new VentanaRegistroEmpleado();
        VentanaVenta vtnVenta = new VentanaVenta();
        VentanaProductos vtnProductos = new VentanaProductos();
        VentanaClientes vtnClientes = new VentanaClientes();
        VentanaEmpleados vtnEmpleados =  new VentanaEmpleados();
        VentanaProveedores vtnProveedores =  new VentanaProveedores();
        VentanaCompra vtnCompra =  new VentanaCompra();
        
                
        Logica logic=new Logica();
        //Paso 2. Establecer relacion Vistas-Controlador
        vtnPrincipal.setControl(control);
        vtnInicio.setControl(control);
        vtnRegistroEmp.setControl(control);
        vtnVenta.setControl(control);
        vtnProductos.setControl(control);
        vtnClientes.setControl(control);
        vtnEmpleados.setControl(control);
        vtnProveedores.setControl(control);
        vtnCompra.setControl(control);
        //Paso 3. Establecer relacion Controladora-Vistas
        control.setVtnPrincipal(vtnPrincipal);
        control.setVtnInicio(vtnInicio);
        control.setVtnRegistroEmp(vtnRegistroEmp);
        control.setVtnVenta(vtnVenta);
        control.setVtnProductos(vtnProductos);
        control.setVtnClientes(vtnClientes);
        control.setVtnEmpleados(vtnEmpleados);
        control.setVtnProveedores(vtnProveedores);
        control.setVtnCompra(vtnCompra);
        //Paso 4. Establecer relacion de Logica-Controlador
        logic.setControl(control);
        
        //Paso 5. Establecer relación de Controlador-Logica
        control.setLogic(logic);
        vtnInicio.setVisible(true);
        
    }
}
