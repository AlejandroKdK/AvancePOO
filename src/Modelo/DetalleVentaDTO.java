
package Modelo;

public class DetalleVentaDTO {
    
    private int ID_detalle_venta;
    private int ID_venta;
    private String codigoProducto;
    private int cantidadProducto;
    private double precioUnitario;
    private double subtotal;

    public DetalleVentaDTO(int ID_detalle_venta, int ID_venta, String codigoProducto, int cantidadProducto, double precioUnitario, double subtotal) {
        this.ID_detalle_venta = ID_detalle_venta;
        this.ID_venta = ID_venta;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public int getID_detalle_venta() {
        return ID_detalle_venta;
    }

    public void setID_detalle_venta(int ID_detalle_venta) {
        this.ID_detalle_venta = ID_detalle_venta;
    }

    public int getID_venta() {
        return ID_venta;
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
