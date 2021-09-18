/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideojuegogkj;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
//import static proyectointento4.GUIProyecto.panelCarrito;
//import static proyectointento4.GUIProyecto.panelFactura;

/**
 *
 * @author compu
 */
public class PnlCarrito extends javax.swing.JPanel {

DefaultTableModel dtmModelo;
PnlFactura panelFactura;
//Factura factura;
static LinkedList<Double> factura;

    /**
     * Creates new form PnlCarrito
     */
    public PnlCarrito() {
        initComponents();
        pnlMostrarCarrito.setVisible(true);
        dtmModelo = new DefaultTableModel();
        dtmModelo.addColumn("Número");
        dtmModelo.addColumn("Nombre");
        dtmModelo.addColumn("Dispositivo");
        dtmModelo.addColumn("Precio");    
        tblInformacion.setModel(dtmModelo);
        lblRequisito.setEnabled(false);
        chkCarrito.setEnabled(false);
        btnRealizarCompra.setEnabled(false);
        panelFactura = new PnlFactura();
        factura= new LinkedList<>();
        pnlMostrarCarrito.setVisible(true);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlMostrarCarrito = new javax.swing.JPanel();
        btnMostrarVideojuegos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        btnRealizarCompra = new javax.swing.JButton();
        lblRequisito = new javax.swing.JLabel();
        chkCarrito = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        pnlMostrarCarrito.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrito"));

        btnMostrarVideojuegos.setText("Mostrar Carrito");
        btnMostrarVideojuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVideojuegosActionPerformed(evt);
            }
        });

        tblInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblInformacion);

        btnRealizarCompra.setText("Realizar Compra");
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });

        lblRequisito.setBackground(new java.awt.Color(0, 204, 51));
        lblRequisito.setForeground(new java.awt.Color(0, 153, 0));
        lblRequisito.setText("Vaya al menu a realizar la compra");

        chkCarrito.setText("Esta correcto el carrito");
        chkCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCarritoActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio Total");

        javax.swing.GroupLayout pnlMostrarCarritoLayout = new javax.swing.GroupLayout(pnlMostrarCarrito);
        pnlMostrarCarrito.setLayout(pnlMostrarCarritoLayout);
        pnlMostrarCarritoLayout.setHorizontalGroup(
            pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnMostrarVideojuegos))
                    .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                                .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRealizarCompra)
                                    .addComponent(chkCarrito))
                                .addGap(28, 28, 28)
                                .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlMostrarCarritoLayout.setVerticalGroup(
            pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarCarritoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnMostrarVideojuegos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCarrito)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMostrarCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarCompra)
                    .addComponent(lblRequisito))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(pnlMostrarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnlMostrarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarVideojuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVideojuegosActionPerformed

        chkCarrito.setEnabled(true);
        dtmModelo.setRowCount(0);
        int j=0;      
        double precioTotal=0;
        for(Videojuego t: GUIProyecto.listaVideojuego){
         
        dtmModelo.addRow(new Object[]{j,t.getNombreJuego(),t.getNombreDispositivo(),t.getPrecio()});
        precioTotal= precioTotal+t.getPrecio();
           j++;
        }
        txtPrecio.setText(Double.toString(precioTotal));
        factura.add(precioTotal);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarVideojuegosActionPerformed

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
     
      chkCarrito.setSelected(false);      
      dtmModelo.setRowCount(0);
      lblRequisito.setEnabled(false);
      btnRealizarCompra.setEnabled(false); 
      chkCarrito.setEnabled(false);
      txtPrecio.setText(null);
      panelFactura.setVisible(true);
     
      panelFactura.setVisible(true);
      pnlMostrarCarrito.setVisible(false);
      panelFactura.setSize(800,800);
      panelFactura.setLocation(0,0);
      add(panelFactura);
      revalidate();
      repaint();  

     
      
      
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarCompraActionPerformed

    private void chkCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCarritoActionPerformed


       if(chkCarrito.isSelected()){
          lblRequisito.setEnabled(true);
         
          btnRealizarCompra.setEnabled(true);
          
       }
       else {
          lblRequisito.setEnabled(false);
          btnRealizarCompra.setEnabled(false); 
          
       }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCarritoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVideojuegos;
    private javax.swing.JButton btnRealizarCompra;
    private javax.swing.JCheckBox chkCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRequisito;
    private javax.swing.JPanel pnlMostrarCarrito;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}