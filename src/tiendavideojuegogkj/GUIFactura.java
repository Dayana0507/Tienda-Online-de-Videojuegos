/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideojuegogkj;

import javax.swing.JOptionPane;

/**
 *
 * @author compu
 */
public class GUIFactura extends javax.swing.JFrame {
    Factura factura2;
    int contadorChk;
    int contadorDireccion;
    int contadorNombre;
    int contadorCedula;
    
    /**
     * Creates new form GUIFactura
     */
    public GUIFactura() {
        initComponents();
        factura2 = new  Factura();
        //btnGuardar.setEnabled(false);
        
        //pnlFacturaTerminada.setVisible(true);
        contadorChk =0;
        contadorCedula=0;
        contadorDireccion =0;
        contadorNombre=0;
        btnGuardar.setEnabled(false);
        pnlDebito.setVisible(false);
        this.setSize(550, 600);
        this.setLocation(250,50);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btgTarjetaCredito = new javax.swing.ButtonGroup();
        btgTarjetaDebito = new javax.swing.ButtonGroup();
        pnlFacturaTerminada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoTarjeta = new javax.swing.JComboBox<>();
        pnlCredito = new javax.swing.JPanel();
        rbtVisa = new javax.swing.JRadioButton();
        rbtVisaElectron = new javax.swing.JRadioButton();
        rbtMaestro = new javax.swing.JRadioButton();
        rbtMasterCard = new javax.swing.JRadioButton();
        rbtAmerican = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        pnlDebito = new javax.swing.JPanel();
        rbtBancoGuayas = new javax.swing.JRadioButton();
        rbtBancoPichincha = new javax.swing.JRadioButton();
        rbtBancoPacifico = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMensajeCedula = new javax.swing.JLabel();
        lblMensajeNombre = new javax.swing.JLabel();
        lblMensajeDireccion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chkVerificar = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );

        pnlFacturaTerminada.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));

        jLabel1.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        jLabel2.setText("Cedula");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        jLabel3.setText("Dirección");

        jLabel4.setText("Tipo de Tarjeta");

        cmbTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Debito" }));
        cmbTipoTarjeta.setSelectedIndex(-1);
        cmbTipoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoTarjetaActionPerformed(evt);
            }
        });

        pnlCredito.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlCredito.setPreferredSize(new java.awt.Dimension(398, 230));

        btgTarjetaCredito.add(rbtVisa);
        rbtVisa.setText("Visa");

        btgTarjetaCredito.add(rbtVisaElectron);
        rbtVisaElectron.setText("Visa Electron");

        btgTarjetaCredito.add(rbtMaestro);
        rbtMaestro.setText("Maestro");

        btgTarjetaCredito.add(rbtMasterCard);
        rbtMasterCard.setText("Master card");

        btgTarjetaCredito.add(rbtAmerican);
        rbtAmerican.setText("American Express");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/mastercard.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/Visa.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/AmericanExpress.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/VisaElectron.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/Maestro.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout pnlCreditoLayout = new javax.swing.GroupLayout(pnlCredito);
        pnlCredito.setLayout(pnlCreditoLayout);
        pnlCreditoLayout.setHorizontalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtVisa)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMasterCard)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtAmerican)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtVisaElectron)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMaestro)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCreditoLayout.setVerticalGroup(
            pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtVisa)
                    .addComponent(rbtMasterCard)
                    .addComponent(rbtAmerican))
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCreditoLayout.createSequentialGroup()
                        .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCreditoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtVisaElectron)
                    .addComponent(rbtMaestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        btnGuardar.setText("Aceptar ");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        pnlDebito.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btgTarjetaDebito.add(rbtBancoGuayas);
        rbtBancoGuayas.setText("Banco de Guayaquil");

        btgTarjetaDebito.add(rbtBancoPichincha);
        rbtBancoPichincha.setText("Banco Pichincha");

        btgTarjetaDebito.add(rbtBancoPacifico);
        rbtBancoPacifico.setText("Banco del Pacifico");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/BancoGuayaquil.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/BancoPichincha.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendavideojuegogkj/BancoDelPacifico.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout pnlDebitoLayout = new javax.swing.GroupLayout(pnlDebito);
        pnlDebito.setLayout(pnlDebitoLayout);
        pnlDebitoLayout.setHorizontalGroup(
            pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebitoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtBancoGuayas)
                    .addGroup(pnlDebitoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtBancoPichincha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDebitoLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(28, 28, 28))
            .addGroup(pnlDebitoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtBancoPacifico)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDebitoLayout.setVerticalGroup(
            pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebitoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtBancoGuayas)
                    .addComponent(rbtBancoPichincha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDebitoLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addComponent(rbtBancoPacifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        lblMensajeCedula.setForeground(new java.awt.Color(255, 0, 51));
        lblMensajeCedula.setText("*");

        lblMensajeNombre.setForeground(new java.awt.Color(255, 0, 51));
        lblMensajeNombre.setText("*");

        lblMensajeDireccion.setForeground(new java.awt.Color(255, 0, 51));
        lblMensajeDireccion.setText("*");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Mariana de Jesus y La Tola N64-78");

        chkVerificar.setText("Verifique que desea hacer la compra");
        chkVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVerificarActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Milton Joan Pila Tapia");

        javax.swing.GroupLayout pnlFacturaTerminadaLayout = new javax.swing.GroupLayout(pnlFacturaTerminada);
        pnlFacturaTerminada.setLayout(pnlFacturaTerminadaLayout);
        pnlFacturaTerminadaLayout.setHorizontalGroup(
            pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                                        .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMensajeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                                        .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMensajeDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMensajeCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFacturaTerminadaLayout.createSequentialGroup()
                                .addComponent(chkVerificar)
                                .addGap(199, 199, 199))
                            .addComponent(pnlCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)))
                    .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlFacturaTerminadaLayout.setVerticalGroup(
            pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacturaTerminadaLayout.createSequentialGroup()
                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensajeNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensajeCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblMensajeDireccion))
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pnlFacturaTerminadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFacturaTerminada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFacturaTerminada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        chkVerificar.setSelected(false);
        if(Verificacion.nombreAceptado(txtNombre.getText())){
            lblMensajeNombre.setVisible(false);
            //btnGuardar.setEnabled(true);
            contadorNombre=1;
        }
        else{
            lblMensajeNombre.setVisible(true);
            btnGuardar.setEnabled(false);
            contadorNombre=0;
            //     chkVerificar.setSelected(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased

        chkVerificar.setSelected(false);
        if(Verificacion.verificar(txtCedula.getText())){

            String mayor=txtCedula.getText().substring(0,2);
            int comparacion = Integer.parseInt(mayor);

            if(comparacion<=24){
                //btnGuardar.setEnabled(true);
                lblMensajeCedula.setVisible(false);
                JOptionPane.showMessageDialog(null,"Cedula valida","Mensaje",-1);
                contadorCedula=1;
            }

        }
        else{
            //  JOptionPane.showMessageDialog(null,txtCedula.getText().length(),"Error",-1);
            lblMensajeCedula.setVisible(true);
            btnGuardar.setEnabled(false);
            contadorCedula=0;
            //   chkVerificar.setSelected(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased

        chkVerificar.setSelected(false);
        if(Verificacion.direccionAceptada(txtDireccion.getText())){
            lblMensajeDireccion.setVisible(false);
            //  btnGuardar.setEnabled(true);
            contadorDireccion=1;
        }
        else{
            lblMensajeDireccion.setVisible(true);
            btnGuardar.setEnabled(false);
            contadorDireccion=0;
            // chkVerificar.setSelected(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void cmbTipoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoTarjetaActionPerformed

        if(cmbTipoTarjeta.getSelectedIndex()== 1){

            pnlDebito.setVisible(true);
            pnlCredito.setVisible(false);
            btgTarjetaCredito.clearSelection();
        }

        if(cmbTipoTarjeta.getSelectedIndex()==0){

            pnlCredito.setVisible(true);
            pnlDebito.setVisible(false);
            btgTarjetaDebito.clearSelection();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoTarjetaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try{
            factura2.setCedula(txtCedula.getText());
            factura2.setNombreComprador(txtNombre.getText());
            factura2.setDireccion(txtDireccion.getText());
            factura2.setTipoTarjeta((String)cmbTipoTarjeta.getSelectedItem());

            String tarjetaSeleccionada="";
            if(rbtAmerican.isSelected()){
                tarjetaSeleccionada ="American";
                contadorChk=1;
            }
            if(rbtBancoGuayas.isSelected()){
                tarjetaSeleccionada ="Banco de Guayaquil";
                contadorChk=1;
            }
            if(rbtBancoPacifico.isSelected()){
                tarjetaSeleccionada ="Banco del Pacifico";
                contadorChk=1;
            }

            if(rbtBancoPichincha.isSelected()){
                tarjetaSeleccionada ="Banco Pichincha";
                contadorChk=1;
            }
            if(rbtMaestro.isSelected()){
                tarjetaSeleccionada ="Maestro";
                contadorChk=1;
            }
            if(rbtMasterCard.isSelected()){
                tarjetaSeleccionada ="MasterCard";
                contadorChk=1;
            }
            if(rbtVisa.isSelected()){
                tarjetaSeleccionada ="Visa";
                contadorChk=1;
            }
            if(rbtVisaElectron.isSelected()){
                tarjetaSeleccionada ="VisaElectron";
                contadorChk=1;
            }

            factura2.setTarjetaUsada(tarjetaSeleccionada);

            // JOptionPane.showMessageDialog(null,"intento");
            //JOptionPane.showMessageDialog(null,"Exception"+factura2.getDireccion(),"Error",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Nombre del comprador: "+factura2.getNombreComprador()+"\n"
                +"Cedula: "+factura2.getCedula()+"\n"
                +"Dirección: "+factura2.getDireccion()+"\n"
                +"Tipo de pago: "+factura2.getTipoTarjeta()+"\n"
                +"Tarjeta a usar: "+factura2.getTarjetaUsada()+"\n"
                +"Precio Total a pagar: "+PnlCarrito.factura.get(0),"Factura",-1);
          
            limpiarGUI();
              
         
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"La edad"
                + " deben ser un número entero","Error",JOptionPane.WARNING_MESSAGE);
        }
        catch (NullPointerException npe){

            JOptionPane.showMessageDialog(null,"error al crear el objeto");
        }
        catch (Exception e){

            JOptionPane.showMessageDialog(null,"Exception"+e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        //pnlFacturaTerminada.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chkVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVerificarActionPerformed

        if(rbtAmerican.isSelected()){

            contadorChk=1;
        }
        if(rbtBancoGuayas.isSelected()){

            contadorChk=1;
        }
        if(rbtBancoPacifico.isSelected()){

            contadorChk=1;
        }

        if(rbtBancoPichincha.isSelected()){

            contadorChk=1;
        }
        if(rbtMaestro.isSelected()){

            contadorChk=1;
        }
        if(rbtMasterCard.isSelected()){

            contadorChk=1;
        }
        if(rbtVisa.isSelected()){

            contadorChk=1;
        }
        if(rbtVisaElectron.isSelected()){
            contadorChk=1;
        }

        if(contadorChk==1 & contadorCedula==1&contadorDireccion==1 & contadorNombre==1){

            btnGuardar.setEnabled(true);

        }
        else{
            chkVerificar.setSelected(false);
            JOptionPane.showMessageDialog(null,"Rellene todos los datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        //chkVerificar.setSelected(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_chkVerificarActionPerformed

    public void limpiarGUI(){
        
        txtCedula.setText(null);
        txtDireccion.setText(null);
        txtNombre.setText(null);
        PnlCarrito.factura.clear();
    } 
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
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTarjetaCredito;
    private javax.swing.ButtonGroup btgTarjetaDebito;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkVerificar;
    private javax.swing.JComboBox<String> cmbTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensajeCedula;
    private javax.swing.JLabel lblMensajeDireccion;
    private javax.swing.JLabel lblMensajeNombre;
    private javax.swing.JPanel pnlCredito;
    private javax.swing.JPanel pnlDebito;
    private javax.swing.JPanel pnlFacturaTerminada;
    private javax.swing.JRadioButton rbtAmerican;
    private javax.swing.JRadioButton rbtBancoGuayas;
    private javax.swing.JRadioButton rbtBancoPacifico;
    private javax.swing.JRadioButton rbtBancoPichincha;
    private javax.swing.JRadioButton rbtMaestro;
    private javax.swing.JRadioButton rbtMasterCard;
    private javax.swing.JRadioButton rbtVisa;
    private javax.swing.JRadioButton rbtVisaElectron;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
