package Modulos;

import Cambio.Cambiar;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import modelo.hash;
import modelo.sqlUsuario;
import modelo.usuario;

public class CUENTA extends javax.swing.JFrame {

    public CUENTA() {
        initComponents();

        this.setLocationRelativeTo(null);
        btsecion.setEnabled(false);
    }

    public void validar() {
        if (txtnombre.getText().isEmpty()) {
            advertenciaNombre.setText("*  CAMPO OBLIGATORIO");
        } else {
            advertenciaNombre.setText(" ");
        }
        if (txtapellido.getText().isEmpty()) {
            advertenciaApellido.setText("*  CAMPO OBLIGATORIO");
        } else {
            advertenciaApellido.setText(" ");
        }
        if (txtcelular.getText().isEmpty()) {
            advertenciaCelular.setText("*  CAMPO OBLIGATORIO");
        } else if (!numeros(txtcelular.getText().trim())) {
            advertenciaCelular.setText("*  SOLO SE HACEPTAN NUMEROS ");
        } else {
            advertenciaCelular.setText("");
        }
        if (txtUsusario.getText().isEmpty()) {
            advertenciaUsuario.setText("*  CAMPO OBLIGATORIO");
        } else {
            advertenciaUsuario.setText("");
        }
        if (txtcorreo.getText().isEmpty()) {
            advertenciaCorrero.setText("*  CAMPO OBLIGATORIO");
        } else if (!txtcorreo.getText().contains("@") || !txtcorreo.getText().contains(".")) {
            advertenciaCorrero.setText("  CORREO NO VALIDO");
        } else {
            advertenciaCorrero.setText("");
        }
        if (txtcontraseña.getText().isEmpty()) {
            advertenciaCon.setText("*  CAMPO OBLIGATORIO");
        } else {
            advertenciaCon.setText("");
        }

        String pass = new String(this.txtcontraseña.getPassword());
        String passCon = new String(this.txtVerificacion.getPassword());
        if (this.txtVerificacion.getText().isEmpty()) {
            this.advertenciaVerificcion.setText("*  CAMPO OBLIGATORIO");
        } else if (!pass.equals(passCon)) {
            this.advertenciaVerificcion.setText(" NO COINCIDEN LAS CONTRASEÑAS");
        } else {
            this.advertenciaVerificcion.setText("");
        }

        if (txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || txtcorreo.getText().isEmpty() || advertenciaCorrero.getText().equals("  CORREO NO VALIDO")
                || txtUsusario.getText().isEmpty() || txtcelular.getText().isEmpty() || advertenciaCelular.getText().equals("*  SOLO SE HACEPTAN NUMEROS ")
                || txtcontraseña.getText().isEmpty() || this.txtVerificacion.getText().isEmpty() || advertenciaVerificcion.getText().equals(" NO COINCIDEN LAS CONTRASEÑAS")) {
            btsecion.setEnabled(false);

        } else {
            btsecion.setEnabled(true);
        }
    }

    private static boolean numeros(String datos) {

        return datos.matches("[0-9]*");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        advertenciaNombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        advertenciaApellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        celular1 = new javax.swing.JLabel();
        advertenciaCelular = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        advertenciaCorrero = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        advertenciaUsuario = new javax.swing.JLabel();
        txtUsusario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        advertenciaCon = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        btregresar = new javax.swing.JButton();
        btsecion = new javax.swing.JButton();
        contraseña2 = new javax.swing.JLabel();
        txtVerificacion = new javax.swing.JPasswordField();
        advertenciaVerificcion = new javax.swing.JLabel();
        advertenciaCon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(0, 0, 0), java.awt.Color.black));
        jPanel1.setLayout(null);

        titulo.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        titulo.setText("\"CREAR CUENTA\"");
        jPanel1.add(titulo);
        titulo.setBounds(10, 20, 410, 50);

        nombre.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        nombre.setText("NOMBRES :");
        jPanel1.add(nombre);
        nombre.setBounds(240, 90, 110, 18);

        advertenciaNombre.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaNombre.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaNombre);
        advertenciaNombre.setBounds(620, 90, 280, 20);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre);
        txtnombre.setBounds(370, 90, 230, 22);

        apellido.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        apellido.setText("APELLIDOS :");
        jPanel1.add(apellido);
        apellido.setBounds(230, 130, 120, 18);

        advertenciaApellido.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaApellido.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaApellido);
        advertenciaApellido.setBounds(620, 130, 280, 20);

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido);
        txtapellido.setBounds(370, 130, 230, 22);

        celular1.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        celular1.setText("NUMERO DE CELULAR :");
        jPanel1.add(celular1);
        celular1.setBounds(130, 170, 220, 18);

        advertenciaCelular.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaCelular.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaCelular);
        advertenciaCelular.setBounds(620, 170, 280, 20);

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcelularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtcelular);
        txtcelular.setBounds(370, 170, 230, 22);

        correo.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        correo.setText("CORREO ELECTRONICO :");
        jPanel1.add(correo);
        correo.setBounds(110, 200, 240, 18);

        advertenciaCorrero.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaCorrero.setForeground(new java.awt.Color(255, 0, 0));
        advertenciaCorrero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                advertenciaCorreroKeyReleased(evt);
            }
        });
        jPanel1.add(advertenciaCorrero);
        advertenciaCorrero.setBounds(620, 200, 280, 20);

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcorreoKeyReleased(evt);
            }
        });
        jPanel1.add(txtcorreo);
        txtcorreo.setBounds(370, 200, 230, 22);

        usuario.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        usuario.setText("USUARIO :");
        jPanel1.add(usuario);
        usuario.setBounds(250, 240, 110, 18);

        advertenciaUsuario.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaUsuario.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaUsuario);
        advertenciaUsuario.setBounds(620, 240, 280, 20);

        txtUsusario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsusarioActionPerformed(evt);
            }
        });
        txtUsusario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsusarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtUsusario);
        txtUsusario.setBounds(370, 240, 230, 20);

        contraseña.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        contraseña.setText("CONTRASEÑA :");
        jPanel1.add(contraseña);
        contraseña.setBounds(210, 280, 140, 18);

        advertenciaCon.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaCon.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaCon);
        advertenciaCon.setBounds(620, 280, 280, 20);

        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyReleased(evt);
            }
        });
        jPanel1.add(txtcontraseña);
        txtcontraseña.setBounds(370, 280, 230, 22);

        btregresar.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btregresar.setText("REGRESAR");
        btregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btregresar);
        btregresar.setBounds(250, 380, 120, 27);

        btsecion.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        btsecion.setText("INICIA SECION");
        btsecion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsecionActionPerformed(evt);
            }
        });
        jPanel1.add(btsecion);
        btsecion.setBounds(610, 380, 160, 27);

        contraseña2.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        contraseña2.setText("VERIFICA LA CONTRASEÑA :");
        jPanel1.add(contraseña2);
        contraseña2.setBounds(90, 320, 270, 18);

        txtVerificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVerificacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtVerificacion);
        txtVerificacion.setBounds(370, 320, 230, 22);

        advertenciaVerificcion.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaVerificcion.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaVerificcion);
        advertenciaVerificcion.setBounds(620, 320, 280, 20);

        advertenciaCon1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        advertenciaCon1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(advertenciaCon1);
        advertenciaCon1.setBounds(620, 340, 280, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cotopaxi2.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 430);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsecionActionPerformed

        sqlUsuario modSql = new sqlUsuario();
        usuario mod = new usuario();

        String pass = new String(this.txtcontraseña.getPassword());
        String passCon = new String(this.txtVerificacion.getPassword());
        if (pass.equals(passCon)) {

            if (modSql.reistroUsuario(this.txtUsusario.getText()) == 0) {

                String nuevoPass = hash.sha1(pass);

                mod.setNOMBRE(this.txtnombre.getText());
                mod.setAPELLIDO(this.txtapellido.getText());
                mod.setCELULAR(this.txtcelular.getText());
                mod.setCORREO(this.txtcorreo.getText());
                mod.setUSUARIO(this.txtUsusario.getText());
                mod.setPASWORD(nuevoPass);
                mod.setPASWORD_VEREFICACION(nuevoPass);

                if (modSql.registrar(mod)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    limpiar();
                    Cambiar.main(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "REGISTRO NO GUARDADO");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ya existe el usuerio");
            }
        } else {
            this.advertenciaVerificcion.setText("");
        }

    }//GEN-LAST:event_btsecionActionPerformed
    private void limpiar() {
        this.txtUsusario.setText("");
        this.txtapellido.setText("");
        this.txtcelular.setText("");
        this.txtcontraseña.setText("");
        this.txtcorreo.setText("");
        this.txtnombre.setText("");
        this.txtVerificacion.setText("");
    }
    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        Cambiar.main(null);


    }//GEN-LAST:event_btregresarActionPerformed

    private void txtcontraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyReleased

        validar();


    }//GEN-LAST:event_txtcontraseñaKeyReleased

    private void txtUsusarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsusarioKeyReleased

        validar();

    }//GEN-LAST:event_txtUsusarioKeyReleased

    private void txtUsusarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsusarioActionPerformed

    }//GEN-LAST:event_txtUsusarioActionPerformed

    private void txtcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyReleased
        validar();
    }//GEN-LAST:event_txtcorreoKeyReleased

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtcelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyReleased
        validar();
    }//GEN-LAST:event_txtcelularKeyReleased

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        validar();
    }//GEN-LAST:event_txtcelularActionPerformed

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        validar();
    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        validar();
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtVerificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerificacionKeyReleased
        validar();
    }//GEN-LAST:event_txtVerificacionKeyReleased

    private void advertenciaCorreroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_advertenciaCorreroKeyReleased
        validar();
    }//GEN-LAST:event_advertenciaCorreroKeyReleased

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48&&key<=57;
        if(!numeros ){
            evt.consume();
        }
        if (this.txtcelular.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
 int key = evt.getKeyChar();
 boolean M = key >= 65&& key<=90;
 boolean m = key >= 97 && key<=122;
 if(!(M||m)){
     evt.consume();
 }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
int key = evt.getKeyChar();
 boolean M = key >= 65&& key<=90;
 boolean m = key >= 97 && key<=122;
 if(!(M||m)){
     evt.consume();
 }
    }//GEN-LAST:event_txtapellidoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaApellido;
    private javax.swing.JLabel advertenciaCelular;
    private javax.swing.JLabel advertenciaCon;
    private javax.swing.JLabel advertenciaCon1;
    private javax.swing.JLabel advertenciaCorrero;
    private javax.swing.JLabel advertenciaNombre;
    private javax.swing.JLabel advertenciaUsuario;
    private javax.swing.JLabel advertenciaVerificcion;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton btsecion;
    private javax.swing.JLabel celular1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseña2;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel titulo;
    public javax.swing.JTextField txtUsusario;
    private javax.swing.JPasswordField txtVerificacion;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private void setLoctaionRelativeT(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
