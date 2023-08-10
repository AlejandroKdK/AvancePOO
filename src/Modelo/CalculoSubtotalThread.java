
package Modelo;

import java.util.List;

public class CalculoSubtotalThread extends Thread {
    private List<ProductoDTO> listaTemporal;
    private double totalVenta; // Declaración de la variable totalVenta
    private Logica logic;

    public CalculoSubtotalThread(List<ProductoDTO> listaTemporal, Logica logic) {
        this.listaTemporal = listaTemporal;
        this.totalVenta = 0; // Inicialización en el constructor
        this.logic = logic;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cálculos
            } catch (InterruptedException e) {
                interrupt();
                break;
            }

            double subtotal = 0.0;

            synchronized (listaTemporal) {
                for (ProductoDTO producto : listaTemporal) {
                    subtotal += producto.getPrecioProducto() * producto.getStock();
                }
            }

            totalVenta = subtotal; // Actualización de totalVenta
            System.out.println("TotalHilo: "+totalVenta);
            logic.RegresarTotal(totalVenta);
            
        }
    }

    public double getTotalVenta() {
        return totalVenta;
    }
}
