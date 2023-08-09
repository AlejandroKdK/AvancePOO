
package Modelo;

import Controlador.Controladora;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Logica {
    private Controladora control;
    /*ArrayList<AlumnoDTO> listaAlumnos=new ArrayList<AlumnoDTO>();
    DefaultTableModel ModeloTabla = null;
    private ConexionBD conex=null;
    private AlumnoDAO DAOAlum=null;*/
    private EmpleadoDAO DAOEmpleado=null;
     private ConexionBD conex=null;
    
     public Logica(){
       conex=new ConexionBD();
       //DAOAlum=new AlumnoDAO();
       DAOEmpleado = new EmpleadoDAO();
    }
    
    public void setControl(Controladora control) {
        this.control = control;
    }
    
    //Registro en un arrayList
    public void RegistrarAlumno(String nombre, String matricula, String edad, char Sexo) {
       // AlumnoDTO nuevo=new AlumnoDTO(nombre,matricula,Integer.parseInt(edad),Sexo);
        //listaAlumnos.add(nuevo);
    }

    //Registro en la base de datos
    public void RegistrarAlumnoBD(String nombre, String matricula, String edad, char Sexo){
       //AlumnoDTO nuevo = new AlumnoDTO(nombre, matricula, Integer.parseInt(edad),Sexo);
       //DAOAlum.RegistrarAlumno(nuevo, conex.getConnection());
    }
        
    public void MostrarConsultaBD(JTable jTable1){
        //DAOAlum.ConsultarAlumno(jTable1, conex.getConnection());
    }
    

    public void MostrarConsultaGeneral(JTable tabla1) {
       /*DefaultTableModel ModeloTabla=new DefaultTableModel();
       ModeloTabla.addColumn("Matricula");
       ModeloTabla.addColumn("Nombre");
       ModeloTabla.addColumn("Edad");
       ModeloTabla.addColumn("Sexo");
       Object[] datos = new Object[4];
       for(AlumnoDTO nuevo: listaAlumnos){
           datos[0]=nuevo.getMatricula();
           datos[1]=nuevo.getNombre();
           datos[2]=nuevo.getEdad();
           datos[3]=nuevo.getSexo();
           ModeloTabla.addRow(datos);
        }
        tabla1.setModel(ModeloTabla);*/
    }

    public void ConsultarDatos(int indice) {
        // String[] datos = DAOAlum.ObtenerDatos(indice, conex.getConnection());
         //control.MostrarDatosModificados(datos);
        /*String nombre=listaAlumnos.get(indice).getNombre();
        int edad=listaAlumnos.get(indice).getEdad();
        control.MostrarDatosModificados(nombre, edad);*/
    }

    public void editarAlumno(String nombre, String edad, int indiceRecuperado) {
      /* int contador=0;
        for (AlumnoDTO alumno : listaAlumnos) {
            if(contador==indiceRecuperado){
               alumno.setNombre(nombre);
               alumno.setEdad(Integer.parseInt(edad));
            }
               contador++; 
        }*/
    }

    public void MostrarConsultaGeneral(JTable tabla1, String matricula) {
        //DAOAlum.ConsultarAlumno(tabla1, conex.getConnection(), matricula);
    }

    public void EliminarAlumno(String matricula) {
      // DAOAlum.EliminarAlumno(matricula, conex.getConnection());
        
    }

    public void editarAlumnoBD(String nombre, String edad, int indiceRecuperado) {
       
      //DAOAlum.actualizarRegistro(nombre, edad, indiceRecuperado, conex.getConnection());
    }

    
    public void ValidarUsuario(String nombre, String contra, Logica logic) {
      EmpleadoDAO.ValidarUsuario(nombre, contra, conex.getConnection(), logic);
      
    }

    public void MuestraVentanaRegistrar() {
       control.MuestraVentanaRegistrarEmpleado();
        
    }

    public void MuestraVentanaAdministrador() {
       
        control.MuestraVentanaAdministrador();
    }
}
