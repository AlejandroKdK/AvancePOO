
package Modelo;

public class EmpleadoDTO extends Persona{
    
    private String Puesto;
    private String noSeguro;
    private String contra;

    public EmpleadoDTO(String IdEmpleado, String Puesto, String noSeguro, String nombre, String direccion, String telefono, String correo, String contra) {
        super(nombre, direccion, telefono, correo);
        this.Puesto = Puesto;
        this.noSeguro = noSeguro;
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
   

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getNoSeguro() {
        return noSeguro;
    }

    public void setNoSeguro(String noSeguro) {
        this.noSeguro = noSeguro;
    }

    
    
}
