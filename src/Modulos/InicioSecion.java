package Modulos;

import Cambio.Cambiar;
import Modulos.CUENTA;
import javax.swing.JOptionPane;
import modelo.*;

public class InicioSecion extends javax.swing.JFrame {

    public InicioSecion() {
        initComponents();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagen2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TITULO1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        ImagenPasword = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ImagenPasword2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImagenPasword1 = new javax.swing.JLabel();
        IMAGEN1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen2.jpg"))); // NOI18N
        Imagen2.setText("\n");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO1.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TITULO1.setText("<html> VAMOS A DESCUBRIR ECUADOR VIAJANDO <html>");
        TITULO1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(TITULO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 17, 525, 119));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ImagenPasword.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        ImagenPasword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PASWO6.png"))); // NOI18N
        ImagenPasword.setText("  INGRESE SU CONTRASEÑA  :");
        ImagenPasword.setToolTipText("");

        imgUsuario.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/USER6.png"))); // NOI18N
        imgUsuario.setText("      INGRESE SU USUARIO :");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        ImagenPasword2.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        ImagenPasword2.setText("INICIA SECION");
        ImagenPasword2.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ImagenPasword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ImagenPasword2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(imgUsuario)
                .addGap(18, 18, 18)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenPasword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenPasword2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 143, 362, -1));

        ImagenPasword1.setFont(new java.awt.Font("Elephant", 3, 14)); // NOI18N
        ImagenPasword1.setText("VAMOS CREA TU CUENTA ");
        ImagenPasword1.setToolTipText("");
        ImagenPasword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImagenPasword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenPasword1MouseClicked(evt);
            }
        });
        jPanel1.add(ImagenPasword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 609, -1, 29));

        IMAGEN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/areas-protegidas-2.png"))); // NOI18N
        IMAGEN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMAGEN1MouseClicked(evt);
            }
        });
        jPanel1.add(IMAGEN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 90, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IMAGEN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMAGEN1MouseClicked

    }//GEN-LAST:event_IMAGEN1MouseClicked

    private void ImagenPasword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenPasword1MouseClicked
       CUENTA cuenta = new CUENTA ();
       cuenta.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ImagenPasword1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        sqlUsuario modsql = new sqlUsuario();
        usuario mod = new usuario();
        
        
        String pass = new String(this.TxtPassword.getPassword());
        
        if(!this.TxtUsuario.getText().isEmpty()&&! pass.isEmpty()){
            String nuevoPass = hash.sha1(pass);
            
            mod.setUSUARIO(this.TxtUsuario.getText());
            mod.setPASWORD(nuevoPass);
            
            if(modsql.login(mod)){
              
                Home  frmHome = new Home();
                frmHome.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "LOS DATOS NO COINCIDEN ");
                
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked
 
  public static void main(String args[]) {

      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSecion().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMAGEN1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel ImagenPasword;
    private javax.swing.JLabel ImagenPasword1;
    private javax.swing.JLabel ImagenPasword2;
    private javax.swing.JLabel TITULO1;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
