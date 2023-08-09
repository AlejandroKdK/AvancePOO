

package Modelo;


public class VentaDTO {
    private String idVenta;
    private String nombreCliente;
    private String empleado;
    private String monto;
    private String fecha;

    public VentaDTO(String idVenta, String nombreCliente, String empleado, String monto, String fecha) {
        this.idVenta = idVenta;
        this.nombreCliente = nombreCliente;
        this.empleado = empleado;
        this.monto = monto;
        this.fecha = fecha;
    }
    

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
