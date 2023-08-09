
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionBD {
    private Connection conex=null;
    
    public ConexionBD(){
         String bd = "bdfarmacia";
        String login = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/"+bd+"?useUnicode=true"+"serverTimezone=UTC";
        try {  
            conex = DriverManager.getConnection(url,login,password);
            if(conex!=null){
                System.out.println("Se establecio la conexion");
            }else{
                System.out.println("Error de conexion");
            }
        }catch (SQLException ex) {
            System.out.println("Excepcion Presentada: "+ex);
        }
    }
    
    public Connection getConnection(){
        return conex;
    }
    
    public void DesconectarBD(){
        conex=null;
    }
    
    
    
    
}
