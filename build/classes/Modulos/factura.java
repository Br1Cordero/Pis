
package Modulos;

import javax.swing.JOptionPane;

public class factura extends javax.swing.JFrame {
    
    public factura() {
        initComponents();
        seleccion ventana = new seleccion();
        cliente.setText(ventana.nomb);
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        ruc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PEDIDO = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PASAJEROS = new javax.swing.JTextField();
        NTOTAL = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TIPOCLIENTE = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        PAGO = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        FechaE = new javax.swing.JTextField();
        FECHAFINAL = new javax.swing.JTextField();
        TipoPasaje = new javax.swing.JTextField();
        HOTEL = new javax.swing.JTextField();
        HABITACIONES = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        SALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 221, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(39, 49, 95, 99);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel2.setText("R.U.C.            N°- 0984748323001");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 20, 217, 45);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel3.setText("FACTURA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 60, 65, 30);

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setText("N°-  001");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 110, 80, 33);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(898, 200, 0, 0);

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel6.setText("CLIENTE:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(807, 54, 61, 31);

        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel7.setText("DIRECCIÓN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(807, 92, 106, 27);

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(370, 70, 193, 27);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel8.setText("FECHA:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(807, 26, 65, 21);

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel9.setText("RUC:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(807, 129, 62, 14);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(952, 26, 116, 21);

        cliente.setEditable(false);
        jPanel1.add(cliente);
        cliente.setBounds(952, 59, 116, 20);

        direccion.setEditable(false);
        jPanel1.add(direccion);
        direccion.setBounds(952, 95, 116, 20);

        ruc.setEditable(false);
        jPanel1.add(ruc);
        ruc.setBounds(952, 126, 116, 20);

        jLabel10.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel10.setText("PEDIDO");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(29, 193, 74, 21);

        jLabel11.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel11.setText("FECHA DE VENCIMIENTO");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(498, 234, 165, 24);

        jLabel12.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel12.setText("FORMA DE PAGO:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(498, 189, 121, 29);

        PEDIDO.setEditable(false);
        jPanel1.add(PEDIDO);
        PEDIDO.setBounds(258, 190, 141, 29);

        jLabel13.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel13.setText("TIPO DE PASAJE");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(29, 276, 160, 28);

        jLabel14.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel14.setText("N° DE PASAJEROS");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(29, 329, 123, 22);

        jLabel15.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel15.setText("<html>N° DE NIÑOS Y ADULTOS MAYORES:<html>");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 360, 112, 80);

        PASAJEROS.setEditable(false);
        jPanel1.add(PASAJEROS);
        PASAJEROS.setBounds(258, 336, 141, 20);

        NTOTAL.setEditable(false);
        jPanel1.add(NTOTAL);
        NTOTAL.setBounds(260, 390, 141, 28);

        jLabel16.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel16.setText("TIPO DE CLIENTE:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(498, 276, 158, 28);

        jLabel17.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel17.setText("HOTEL:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(500, 320, 70, 30);

        TIPOCLIENTE.setEditable(false);
        TIPOCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPOCLIENTEActionPerformed(evt);
            }
        });
        jPanel1.add(TIPOCLIENTE);
        TIPOCLIENTE.setBounds(729, 276, 164, 30);

        jLabel18.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel18.setText("N° DE HABITACIONES:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(498, 374, 200, 19);

        PAGO.setEditable(false);
        jPanel1.add(PAGO);
        PAGO.setBounds(729, 192, 164, 25);

        jLabel19.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel19.setText("FECHA DE ESTADIA:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(29, 237, 135, 19);

        FechaE.setEditable(false);
        jPanel1.add(FechaE);
        FechaE.setBounds(258, 232, 141, 31);

        FECHAFINAL.setEditable(false);
        jPanel1.add(FECHAFINAL);
        FECHAFINAL.setBounds(729, 236, 164, 20);

        TipoPasaje.setEditable(false);
        jPanel1.add(TipoPasaje);
        TipoPasaje.setBounds(258, 280, 141, 20);

        HOTEL.setEditable(false);
        jPanel1.add(HOTEL);
        HOTEL.setBounds(729, 321, 170, 30);

        HABITACIONES.setEditable(false);
        jPanel1.add(HABITACIONES);
        HABITACIONES.setBounds(729, 368, 170, 32);

        jLabel20.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel20.setText("DESCRIPCIÓN ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(258, 448, 97, 19);

        jLabel21.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel21.setText("SUB TOTAL");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(710, 530, 120, 26);

        jTextField16.setEditable(false);
        jPanel1.add(jTextField16);
        jTextField16.setBounds(258, 475, 366, 87);

        jTextField17.setEditable(false);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField17);
        jTextField17.setBounds(870, 460, 110, 30);

        jLabel22.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel22.setText("IVA:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(760, 500, 25, 19);

        jTextField18.setEditable(false);
        jPanel1.add(jTextField18);
        jTextField18.setBounds(870, 510, 100, 20);

        jLabel23.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel23.setText("TOTAL A PGAR");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(700, 460, 102, 19);

        jTextField19.setEditable(false);
        jPanel1.add(jTextField19);
        jTextField19.setBounds(870, 550, 83, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image (1).png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(40, 30, 95, 113);

        SALIR.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR);
        SALIR.setBounds(950, 610, 110, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1096, 664));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed

    }//GEN-LAST:event_jTextField17ActionPerformed

    private void TIPOCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPOCLIENTEActionPerformed

    }//GEN-LAST:event_TIPOCLIENTEActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
JOptionPane.showMessageDialog(null, "GRACIAS POR SU COMPRA");
  System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField FECHAFINAL;
    public javax.swing.JTextField FechaE;
    public javax.swing.JTextField HABITACIONES;
    public javax.swing.JTextField HOTEL;
    public javax.swing.JTextField NTOTAL;
    public javax.swing.JTextField PAGO;
    public javax.swing.JTextField PASAJEROS;
    public javax.swing.JTextField PEDIDO;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField TIPOCLIENTE;
    public javax.swing.JTextField TipoPasaje;
    public javax.swing.JTextField cliente;
    public javax.swing.JTextField direccion;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField16;
    public javax.swing.JTextField jTextField17;
    public javax.swing.JTextField jTextField18;
    public javax.swing.JTextField jTextField19;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField ruc;
    // End of variables declaration//GEN-END:variables

}
