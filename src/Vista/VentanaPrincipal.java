
package Vista;

import Controlador.Controladora;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        setDate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuOpciones = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnNuevaCompra = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUsuarioLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JLabel();
        componentes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dataText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuOpciones.setBackground(new java.awt.Color(0, 153, 153));
        menuOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaVenta.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaVenta.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaVenta.setText("Nueva Venta");
        btnNuevaVenta.setToolTipText("");
        btnNuevaVenta.setBorderPainted(false);
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        menuOpciones.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 30));

        btnNuevaCompra.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevaCompra.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCompra.setText("Nueva Compra");
        btnNuevaCompra.setToolTipText("");
        btnNuevaCompra.setBorderPainted(false);
        btnNuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompraActionPerformed(evt);
            }
        });
        menuOpciones.add(btnNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 30));

        btnProductos.setBackground(new java.awt.Color(0, 153, 153));
        btnProductos.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorderPainted(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        menuOpciones.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 30));

        btnClientes.setBackground(new java.awt.Color(0, 153, 153));
        btnClientes.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        menuOpciones.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 30));

        btnEmpleados.setBackground(new java.awt.Color(0, 153, 153));
        btnEmpleados.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        menuOpciones.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 30));

        btnProveedores.setBackground(new java.awt.Color(0, 153, 153));
        btnProveedores.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        menuOpciones.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 30));

        btnReportes.setBackground(new java.awt.Color(0, 153, 153));
        btnReportes.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorderPainted(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuOpciones.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 30));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 153, 153));
        btnCerrarSesion.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        menuOpciones.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Configuraciones");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuOpciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        txtUsuarioLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        txtUsuarioLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo4 (1).png"))); // NOI18N
        menuOpciones.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");
        menuOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Round-Facebook-logo-with-green-and-red-dots-representing-online-and-offline-status-1200x480-removebg-preview (1).png"))); // NOI18N
        menuOpciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        txtTipoUsuario.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        txtTipoUsuario.setForeground(new java.awt.Color(51, 255, 0));
        menuOpciones.add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 40, 20));

        getContentPane().add(menuOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 520));

        javax.swing.GroupLayout componentesLayout = new javax.swing.GroupLayout(componentes);
        componentes.setLayout(componentesLayout);
        componentesLayout.setHorizontalGroup(
            componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        componentesLayout.setVerticalGroup(
            componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 670, 480));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        dataText.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        dataText.setForeground(new java.awt.Color(255, 255, 255));
        dataText.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataText)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 670, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
       control.MuestraVentanaProductos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
       control.MuestraVentanaAdministrador();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       control.MuestraVentanaClientes();
       
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        control.MuestraVentanaEmpleados();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        control.MuestraVentanaProveedores();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        control.MuestraVentanaCompra();
    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        control.MuestraVentaInicio();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    public void setControl(Controladora control) {
        this.control = control;
    }
    
    private Controladora control;

    private void setDate() {
    LocalDate now = LocalDate.now();
    Locale spanishLocale = new Locale("es", "ES");
    dataText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel componentes;
    private javax.swing.JLabel dataText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JLabel txtTipoUsuario;
    private javax.swing.JLabel txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables

    public void MostrarContenido(VentanaVenta vtnVenta, String admin, String nombre) {
       componentes.removeAll();
       componentes.add(vtnVenta);
       componentes.revalidate();
       componentes.repaint();
       txtUsuarioLogin.setText(nombre);
       txtTipoUsuario.setText(admin);
       btnNuevaVenta.setBackground(new Color(0x00CCCC)); 
    }

    public void MostrarContenidoProductos(VentanaProductos vtnProductos) {
       componentes.removeAll();
       componentes.add(vtnProductos);
       componentes.revalidate();
       componentes.repaint();
       btnProductos.setBackground(new Color(0x00CCCC)); 
       btnNuevaVenta.setBackground(new Color(0x009999));    
       btnClientes.setBackground(new Color(0x009999));
       btnEmpleados.setBackground(new Color(0x009999));
       btnNuevaCompra.setBackground(new Color(0x009999));
       btnProveedores.setBackground(new Color(0x009999));
    }

    public void MostrarContenidoClientes(VentanaClientes vtnClientes) {
      componentes.removeAll();
      componentes.add(vtnClientes);
      componentes.revalidate();
      componentes.repaint();
      btnClientes.setBackground(new Color(0x00CCCC)); 
      btnProductos.setBackground(new Color(0x009999)); 
      btnNuevaVenta.setBackground(new Color(0x009999));    
      btnEmpleados.setBackground(new Color(0x009999));
      btnNuevaCompra.setBackground(new Color(0x009999));
      btnProveedores.setBackground(new Color(0x009999));
    }

    public void MostrarContenidoEmpleados(VentanaEmpleados vtnEmpleados) {
       componentes.removeAll();
       componentes.add(vtnEmpleados);
       componentes.revalidate();
       componentes.repaint();
       btnEmpleados.setBackground(new Color(0x00CCCC)); 
       btnProductos.setBackground(new Color(0x009999)); 
       btnNuevaVenta.setBackground(new Color(0x009999));    
       btnClientes.setBackground(new Color(0x009999));
       btnNuevaCompra.setBackground(new Color(0x009999));
       btnProveedores.setBackground(new Color(0x009999));
    }

    public void MostrarContenidoProveedores(VentanaProveedores vtnProveedores) {
        componentes.removeAll();
        componentes.add(vtnProveedores);
        componentes.revalidate();
        componentes.repaint();
        btnProveedores.setBackground(new Color(0x00CCCC));
        btnProductos.setBackground(new Color(0x009999)); 
        btnNuevaVenta.setBackground(new Color(0x009999));    
        btnClientes.setBackground(new Color(0x009999));
        btnEmpleados.setBackground(new Color(0x009999));
        btnNuevaCompra.setBackground(new Color(0x009999));
    }

    public void MostrarContenidoCompra(VentanaCompra vtnCompra) {
        componentes.removeAll();
        componentes.add(vtnCompra);
        componentes.revalidate();
        componentes.repaint();
        btnNuevaCompra.setBackground(new Color(0x00CCCC));
        btnProductos.setBackground(new Color(0x009999)); 
        btnNuevaVenta.setBackground(new Color(0x009999));    
        btnClientes.setBackground(new Color(0x009999));
        btnEmpleados.setBackground(new Color(0x009999));
        btnProveedores.setBackground(new Color(0x009999));
    }

    public void MostrarContenido(VentanaVenta vtnVenta) {
       componentes.removeAll();
       componentes.add(vtnVenta);
       componentes.revalidate();
       componentes.repaint();
       btnNuevaVenta.setBackground(new Color(0x00CCCC)); 
       btnProductos.setBackground(new Color(0x009999)); 
       btnClientes.setBackground(new Color(0x009999));
       btnEmpleados.setBackground(new Color(0x009999));
       btnNuevaCompra.setBackground(new Color(0x009999));
       btnProveedores.setBackground(new Color(0x009999));
    }

   
}
