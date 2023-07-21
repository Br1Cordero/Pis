package Modulos;


import javax.swing.JOptionPane;


public class seleccion extends javax.swing.JFrame {

    public seleccion() {
        initComponents();
        cliente();
        guardar();
        genero();
        pasaje();
       validar();
        this.setLocationRelativeTo(null); 
       guardar.setEnabled(false);
    }
    public static String nomb="", apell="", direc="", celu1="", celu2="",corre1="", corre2="", Cedu="";
    public static String hb="", psadulto="", psniños="", psadultomayor="", hpadulto="", hpniños="", hpadultomayor="", des="",ast="" ;

    public void guardar (){
        hotel = (String) this.clientebox.getSelectedItem();
        tipo = (String) this.genebox.getSelectedItem();
    }
 public static String hotel;
 public static String tipo;  

 
        
     public void validar (){
        if (nombre.getText().isEmpty()){
        validarnombre.setText("* CAMPO OBLIGATORIO");
        }else{
                   validarnombre.setText(" ");
               }
        if (apellido.getText().isEmpty()){    
            validarapellido.setText("* CAMPO OBLIGATORIO");
        }else{
            validarapellido.setText(" ");
        }
        if (celular.getText().isEmpty()){  
             validarcelular.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(celular.getText().trim())){
           validarcelular.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
        
        validarcelular.setText("");
        }
        if (ci.getText().isEmpty()){  
             validarci.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(ci.getText().trim())){
           validarci.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
        
        validarci.setText("");
         }
        if(correo.getText().isEmpty()){
            validarcorreo.setText("* CAMPO OBLIGATORIO");
        }else if (!correo.getText().contains("@")||! correo.getText().contains(".")){
           validarcorreo.setText(" CORREO NO VALIDO");
        } else {
            validarcorreo.setText("");
        }
        if (direccion.getText().isEmpty()){
                           
        validardireccion.setText("* CAMPO OBLIGATORIO");
        
        } else{
        validardireccion.setText("");
        
     }
     if (adulto.getText().isEmpty()){  
             validaradulto.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(adulto.getText().trim())){
           validaradulto.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
        
        validaradulto.setText("");
         }
     if (nino.getText().isEmpty()){  
             validarnino.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(nino.getText().trim())){
           validarnino.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
        
        validarnino.setText("");
        }
     if (mayor.getText().isEmpty()){  
             validarmayor.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(mayor.getText().trim())){
           validarmayor.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
             validarmayor.setText(" ");
         }
     if (adulto1.getText().isEmpty()){  
             valiadul.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(adulto1.getText().trim())){
           valiadul.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
             valiadul.setText(" ");
         }
      if (mayor1.getText().isEmpty()){  
             valimayor.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(mayor1.getText().trim())){
           valimayor.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
             valimayor.setText(" ");
         }
     if (habitacion.getText().isEmpty()){  
             validarhabitacion.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(habitacion.getText().trim())){
           validarhabitacion.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
             validarhabitacion.setText(" ");
         }
     if (nino1.getText().isEmpty()){  
             valinino.setText("* CAMPO OBLIGATORIO");
         }else if ( ! numeros(nino1.getText().trim())){
           valinino.setText("* SOLO SE ACEPTAN NUMEROS ");
        } else {
             valinino.setText(" ");
         }
     
     
     
     
        if(nombre.getText().isEmpty() || apellido.getText().isEmpty() ||validarcorreo.getText().equalsIgnoreCase("* CORREO NO VALIDO") 
                 || ci.getText().isEmpty()||celular.getText().isEmpty()||adulto.getText().isEmpty() ||mayor.getText().isEmpty()||mayor1.getText().isEmpty()||nino.getText().isEmpty()||habitacion.getText().isEmpty()
                 ||direccion.getText().isEmpty()){
            guardar.setEnabled(true);
        }else {
            guardar.setEnabled(false);
            
        }
     }
     public static boolean numeros (String datos){
     
     return datos.matches("[0-9]*");
 }
      
    void cliente (){
      clientebox.addItem("VIP");
      clientebox.addItem("Turista");
         
   
            }
    
    void pasaje (){
      pasajebox.addItem("VIP");
      pasajebox.addItem("Turista");
    }
void genero (){
        genebox.addItem("Maculino");
        genebox.addItem("Femenino");
        genebox.addItem("Otros");  
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pasajero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pasajebox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        adulto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mayor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        nino = new javax.swing.JTextField();
        validarnino = new javax.swing.JLabel();
        validarmayor = new javax.swing.JLabel();
        validaradulto = new javax.swing.JLabel();
        hospedaje = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        clientebox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        habitacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        valimayor = new javax.swing.JLabel();
        valiadul = new javax.swing.JLabel();
        valinino = new javax.swing.JLabel();
        validarhabitacion = new javax.swing.JLabel();
        adulto1 = new javax.swing.JTextField();
        mayor1 = new javax.swing.JTextField();
        nino1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        correo2 = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        celular2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        genebox = new javax.swing.JComboBox<>();
        validarcelular = new javax.swing.JLabel();
        validarapellido = new javax.swing.JLabel();
        validardireccion = new javax.swing.JLabel();
        validarnombre = new javax.swing.JLabel();
        validarcorreo = new javax.swing.JLabel();
        validarci = new javax.swing.JLabel();
        opcional1 = new javax.swing.JLabel();
        opcional2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBackground(new java.awt.Color(0, 204, 204));
        jTabbedPane3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel18.setText("Tipo de Pasaje:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        pasajebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jPanel2.add(pasajebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 30));

        jLabel19.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel19.setText("N° de Adultos:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        adulto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adultoKeyReleased(evt);
            }
        });
        jPanel2.add(adulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 30));

        jLabel20.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel20.setText("N° de Adultos Mayores:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        mayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mayorKeyReleased(evt);
            }
        });
        jPanel2.add(mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 110, 30));

        jLabel21.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel21.setText("N° de Niños:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        nino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ninoKeyReleased(evt);
            }
        });
        jPanel2.add(nino, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 30));

        validarnino.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarnino.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(validarnino, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, 20));

        validarmayor.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarmayor.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(validarmayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 110, 20));

        validaradulto.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validaradulto.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(validaradulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, 20));

        javax.swing.GroupLayout pasajeroLayout = new javax.swing.GroupLayout(pasajero);
        pasajero.setLayout(pasajeroLayout);
        pasajeroLayout.setHorizontalGroup(
            pasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        pasajeroLayout.setVerticalGroup(
            pasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Pasajeros", pasajero);

        hospedaje.setBackground(new java.awt.Color(153, 255, 204));
        hospedaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel10.setText("N° de Habitaciones:");
        hospedaje.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel11.setText("N° de Adultos Mayores:");
        hospedaje.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel12.setText("N° de Niños:");
        hospedaje.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel13.setText("Hasta:");
        hospedaje.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        clientebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        clientebox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clienteboxItemStateChanged(evt);
            }
        });
        clientebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteboxActionPerformed(evt);
            }
        });
        hospedaje.add(clientebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 30));

        jLabel14.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel14.setText("N° de Adultos:");
        hospedaje.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        habitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habitacionKeyReleased(evt);
            }
        });
        hospedaje.add(habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, 30));

        jLabel15.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel15.setText("Desde:");
        hospedaje.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel16.setText("Tipo de Cliente:");
        hospedaje.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        hospedaje.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 650, 10));

        jLabel17.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel17.setText("Estadia");
        hospedaje.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        guardar.setBackground(new java.awt.Color(204, 204, 204));
        guardar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        hospedaje.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 110, 40));

        valimayor.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        valimayor.setForeground(new java.awt.Color(255, 51, 51));
        hospedaje.add(valimayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 20));

        valiadul.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        valiadul.setForeground(new java.awt.Color(255, 51, 51));
        hospedaje.add(valiadul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 20));

        valinino.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        valinino.setForeground(new java.awt.Color(255, 51, 51));
        hospedaje.add(valinino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 20));

        validarhabitacion.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarhabitacion.setForeground(new java.awt.Color(255, 51, 51));
        hospedaje.add(validarhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 110, 20));

        adulto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adulto1KeyReleased(evt);
            }
        });
        hospedaje.add(adulto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, 30));

        mayor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mayor1KeyReleased(evt);
            }
        });
        hospedaje.add(mayor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 30));

        nino1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nino1KeyReleased(evt);
            }
        });
        hospedaje.add(nino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 110, 30));
        hospedaje.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));
        hospedaje.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jTabbedPane3.addTab("Hospedaje", hospedaje);

        datos.setBackground(new java.awt.Color(153, 255, 204));
        datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Telf.:");
        datos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        datos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));
        datos.add(correo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 160, 30));

        celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                celularKeyReleased(evt);
            }
        });
        datos.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 160, 30));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        datos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("CI.:");
        datos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
        });
        datos.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 160, 30));

        ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ciKeyReleased(evt);
            }
        });
        datos.add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 160, 30));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Telf 2.:");
        datos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoKeyReleased(evt);
            }
        });
        datos.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 30));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Dirección:");
        datos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 10));

        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionKeyReleased(evt);
            }
        });
        datos.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 160, 30));

        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoKeyReleased(evt);
            }
        });
        datos.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 30));
        datos.add(celular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 160, 30));

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Correo 2:");
        datos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel8.setText("Género:");
        datos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 10));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");
        datos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 10));

        genebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        datos.add(genebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 30));

        validarcelular.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarcelular.setForeground(new java.awt.Color(255, 51, 51));
        datos.add(validarcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 20));

        validarapellido.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarapellido.setForeground(new java.awt.Color(255, 51, 51));
        datos.add(validarapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));

        validardireccion.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validardireccion.setForeground(new java.awt.Color(255, 51, 51));
        validardireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validardireccionKeyReleased(evt);
            }
        });
        datos.add(validardireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 20));

        validarnombre.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarnombre.setForeground(new java.awt.Color(255, 51, 51));
        datos.add(validarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 20));

        validarcorreo.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarcorreo.setForeground(new java.awt.Color(255, 51, 51));
        datos.add(validarcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, 20));

        validarci.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        validarci.setForeground(new java.awt.Color(255, 51, 51));
        datos.add(validarci, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, 20));

        opcional1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        opcional1.setForeground(new java.awt.Color(255, 51, 51));
        opcional1.setText("  Opcional");
        datos.add(opcional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 100, 20));

        opcional2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        opcional2.setForeground(new java.awt.Color(255, 51, 51));
        opcional2.setText("  Opcional");
        datos.add(opcional2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, 20));

        jButton1.setText("FACTURA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        datos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jTabbedPane3.addTab("Datos Personales", datos);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 360));

        regresar.setBackground(new java.awt.Color(204, 204, 204));
        regresar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        regresar.setText("Regresar");
        regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validardireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validardireccionKeyReleased
        validar();
    }//GEN-LAST:event_validardireccionKeyReleased

    private void correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyReleased
        validar();
    }//GEN-LAST:event_correoKeyReleased

    private void direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyReleased
        validar();
    }//GEN-LAST:event_direccionKeyReleased

    private void apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyReleased
        validar();
    }//GEN-LAST:event_apellidoKeyReleased

    private void ciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciKeyReleased
        validar();
    }//GEN-LAST:event_ciKeyReleased

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        validar();
    }//GEN-LAST:event_nombreKeyReleased

    private void celularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularKeyReleased
        validar();
    }//GEN-LAST:event_celularKeyReleased

    private void adultoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adultoKeyReleased
        validar();
    }//GEN-LAST:event_adultoKeyReleased

    private void ninoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninoKeyReleased
        validar();
    }//GEN-LAST:event_ninoKeyReleased

    private void mayorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mayorKeyReleased
       validar();
    }//GEN-LAST:event_mayorKeyReleased

    private void habitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habitacionKeyReleased
        validar();
    }//GEN-LAST:event_habitacionKeyReleased

    private void adulto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adulto1KeyReleased
       validar();
    }//GEN-LAST:event_adulto1KeyReleased

    private void mayor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mayor1KeyReleased
        validar();
    }//GEN-LAST:event_mayor1KeyReleased

    private void nino1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nino1KeyReleased
        validar();
    }//GEN-LAST:event_nino1KeyReleased
public int preciodeniño=0,preciodeadulto=0,preciodeadultomayor=0;
    private void clienteboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clienteboxItemStateChanged
    if(hotel.equals("VIP")){
         int preciodeniño=10,preciodeadulto=30,preciodeadultomayor=15;
    }if(hotel.equals("Turista")){
                int preciodeniño=5,preciodeadulto=10,preciodeadultomayor=30;
                }
                  
    }//GEN-LAST:event_clienteboxItemStateChanged
 
    private void clienteboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteboxActionPerformed
        
    }//GEN-LAST:event_clienteboxActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        factura fmFac = new factura();
        fmFac.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       nomb = nombre.getText();
        apell = apellido.getText();
        direc = direccion.getText();
        celu1 = celular.getText();
        celu2 = celular2.getText();
        corre1 = correo.getText();
        corre2 = correo2.getText();
        Cedu = ci.getText();
       hb = habitacion.getText();
       psadulto = adulto.getText();
       psniños = nino.getText();
       psadultomayor = mayor.getText();
       hpadulto = adulto1.getText();
       hpadultomayor = mayor1.getText();
       hpniños = nino1.getText();
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adulto;
    private javax.swing.JTextField adulto1;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField celular2;
    private javax.swing.JTextField ci;
    private javax.swing.JComboBox<String> clientebox;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField correo2;
    private javax.swing.JPanel datos;
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox<String> genebox;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField habitacion;
    private javax.swing.JPanel hospedaje;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField mayor;
    private javax.swing.JTextField mayor1;
    private javax.swing.JTextField nino;
    private javax.swing.JTextField nino1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel opcional1;
    private javax.swing.JLabel opcional2;
    private javax.swing.JComboBox<String> pasajebox;
    private javax.swing.JPanel pasajero;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel valiadul;
    private javax.swing.JLabel validaradulto;
    private javax.swing.JLabel validarapellido;
    private javax.swing.JLabel validarcelular;
    private javax.swing.JLabel validarci;
    private javax.swing.JLabel validarcorreo;
    private javax.swing.JLabel validardireccion;
    private javax.swing.JLabel validarhabitacion;
    private javax.swing.JLabel validarmayor;
    private javax.swing.JLabel validarnino;
    private javax.swing.JLabel validarnombre;
    private javax.swing.JLabel valimayor;
    private javax.swing.JLabel valinino;
    // End of variables declaration//GEN-END:variables

 
}
