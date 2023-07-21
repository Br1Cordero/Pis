package Modulos;

import Modulos.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();

        ListaCosta();
        ListaSierra();
        ListaOriente();
        ListadoGalapagos();
    }
    public static String CiudadCosta;

    public void ListaCosta() {

        this.ComboCosta.addItem("....");
        this.ComboCosta.addItem("BUCAY");
        this.ComboCosta.addItem(" 7 CASCADAS");
        this.ComboCosta.addItem("GUAYAQUIL");
    }
    public static String CiudadSierra;

    public void ListaSierra() {

        this.ComboSierra.addItem("...");
        this.ComboSierra.addItem("BAÑOS DE AGUA SANTA");
        this.ComboSierra.addItem("PARQUE NACIONAL COTOPAXI");
        this.ComboSierra.addItem("LA MITAD DEL MUNDO");
    }
    public static String CiudadOriente;

    public void ListaOriente() {

        this.ComboOriente.addItem("...");
        this.ComboOriente.addItem("CIRCUITO CUYABENO");
        this.ComboOriente.addItem("LAGARTO COCHA");
        this.ComboOriente.addItem("LAGUNA CUYABENO");

    }
    public static String CiudadGalapagos;

    public void ListadoGalapagos() {

        this.ComboGalapagos.addItem("...");
        this.ComboGalapagos.addItem("ISLA SANTA CRUZ ");
        this.ComboGalapagos.addItem("ISLA SAN CRISTÓBAL");
        this.ComboGalapagos.addItem("ISLA ISABELA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelCosta = new javax.swing.JPanel();
        ComprarCosta = new javax.swing.JLabel();
        ComboCosta = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtCosta = new javax.swing.JTextArea();
        ImagenCosta = new javax.swing.JLabel();
        TituloCosta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelSierra = new javax.swing.JPanel();
        ComprarSierra = new javax.swing.JLabel();
        ComboSierra = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextSierra = new javax.swing.JTextArea();
        ImagenSierra = new javax.swing.JLabel();
        TituloSierra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelOriente = new javax.swing.JPanel();
        ComboOriente = new javax.swing.JComboBox<>();
        ComprarOriente = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TextOriente = new javax.swing.JTextArea();
        ImagenOriente = new javax.swing.JLabel();
        TituloOriente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelGalapagos = new javax.swing.JPanel();
        ComboGalapagos = new javax.swing.JComboBox<>();
        ComprarGalapagos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtGalapagos = new javax.swing.JTextArea();
        ImagenGalapagos = new javax.swing.JLabel();
        TituloGalapagos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TITULO1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(119, 221, 119));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N

        PanelCosta.setBackground(new java.awt.Color(119, 221, 119));
        PanelCosta.setLayout(null);

        ComprarCosta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comercio.png"))); // NOI18N
        ComprarCosta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprarCosta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarCostaMouseClicked(evt);
            }
        });
        PanelCosta.add(ComprarCosta);
        ComprarCosta.setBounds(1200, 510, 128, 140);

        ComboCosta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboCosta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCostaItemStateChanged(evt);
            }
        });
        PanelCosta.add(ComboCosta);
        ComboCosta.setBounds(400, 10, 176, 22);

        jScrollPane2.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane2.setBorder(null);

        TxtCosta.setEditable(false);
        TxtCosta.setBackground(new java.awt.Color(119, 221, 119));
        TxtCosta.setColumns(20);
        TxtCosta.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        TxtCosta.setRows(5);
        TxtCosta.setBorder(null);
        jScrollPane2.setViewportView(TxtCosta);

        PanelCosta.add(jScrollPane2);
        jScrollPane2.setBounds(520, 160, 800, 410);
        PanelCosta.add(ImagenCosta);
        ImagenCosta.setBounds(10, 130, 450, 470);

        TituloCosta.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TituloCosta.setForeground(new java.awt.Color(102, 0, 102));
        TituloCosta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PanelCosta.add(TituloCosta);
        TituloCosta.setBounds(80, 60, 1140, 60);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("ESCOJA LA CIUDAD DE DESTNO  :");
        PanelCosta.add(jLabel2);
        jLabel2.setBounds(100, 10, 310, 20);

        jTabbedPane1.addTab("COSTA", PanelCosta);

        PanelSierra.setBackground(new java.awt.Color(119, 221, 119));
        PanelSierra.setLayout(null);

        ComprarSierra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comercio.png"))); // NOI18N
        ComprarSierra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprarSierra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarSierraMouseClicked(evt);
            }
        });
        PanelSierra.add(ComprarSierra);
        ComprarSierra.setBounds(1200, 510, 128, 140);

        ComboSierra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboSierra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboSierraItemStateChanged(evt);
            }
        });
        PanelSierra.add(ComboSierra);
        ComboSierra.setBounds(400, 10, 280, 22);

        jScrollPane5.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane5.setBorder(null);

        TextSierra.setEditable(false);
        TextSierra.setBackground(new java.awt.Color(119, 221, 119));
        TextSierra.setColumns(20);
        TextSierra.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        TextSierra.setRows(5);
        TextSierra.setBorder(null);
        jScrollPane5.setViewportView(TextSierra);

        PanelSierra.add(jScrollPane5);
        jScrollPane5.setBounds(520, 90, 800, 520);
        PanelSierra.add(ImagenSierra);
        ImagenSierra.setBounds(10, 110, 475, 490);

        TituloSierra.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TituloSierra.setForeground(new java.awt.Color(102, 0, 102));
        TituloSierra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PanelSierra.add(TituloSierra);
        TituloSierra.setBounds(10, 40, 1140, 60);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("ESCOJA LA CIUDAD DE DESTNO  :");
        PanelSierra.add(jLabel5);
        jLabel5.setBounds(100, 10, 310, 20);

        jTabbedPane1.addTab("SIERRA", PanelSierra);

        PanelOriente.setBackground(new java.awt.Color(119, 221, 119));
        PanelOriente.setLayout(null);

        ComboOriente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboOriente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboOrienteItemStateChanged(evt);
            }
        });
        PanelOriente.add(ComboOriente);
        ComboOriente.setBounds(400, 10, 176, 22);

        ComprarOriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comercio.png"))); // NOI18N
        ComprarOriente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprarOriente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarOrienteMouseClicked(evt);
            }
        });
        PanelOriente.add(ComprarOriente);
        ComprarOriente.setBounds(1200, 510, 128, 140);

        jScrollPane6.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane6.setBorder(null);

        TextOriente.setEditable(false);
        TextOriente.setBackground(new java.awt.Color(119, 221, 119));
        TextOriente.setColumns(20);
        TextOriente.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        TextOriente.setRows(5);
        TextOriente.setBorder(null);
        jScrollPane6.setViewportView(TextOriente);

        PanelOriente.add(jScrollPane6);
        jScrollPane6.setBounds(520, 110, 800, 460);
        PanelOriente.add(ImagenOriente);
        ImagenOriente.setBounds(10, 130, 450, 470);

        TituloOriente.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TituloOriente.setForeground(new java.awt.Color(102, 0, 102));
        TituloOriente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PanelOriente.add(TituloOriente);
        TituloOriente.setBounds(10, 29, 1140, 60);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("ESCOJA LA CIUDAD DE DESTNO  :");
        PanelOriente.add(jLabel6);
        jLabel6.setBounds(100, 10, 310, 20);

        jTabbedPane1.addTab("ORIENTE", PanelOriente);

        PanelGalapagos.setBackground(new java.awt.Color(119, 221, 119));
        PanelGalapagos.setLayout(null);

        ComboGalapagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboGalapagos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboGalapagosItemStateChanged(evt);
            }
        });
        PanelGalapagos.add(ComboGalapagos);
        ComboGalapagos.setBounds(400, 10, 176, 22);

        ComprarGalapagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comercio.png"))); // NOI18N
        ComprarGalapagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprarGalapagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarGalapagosMouseClicked(evt);
            }
        });
        PanelGalapagos.add(ComprarGalapagos);
        ComprarGalapagos.setBounds(1200, 510, 128, 140);

        jScrollPane3.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane3.setBorder(null);

        TxtGalapagos.setEditable(false);
        TxtGalapagos.setBackground(new java.awt.Color(119, 221, 119));
        TxtGalapagos.setColumns(20);
        TxtGalapagos.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        TxtGalapagos.setRows(5);
        TxtGalapagos.setBorder(null);
        jScrollPane3.setViewportView(TxtGalapagos);

        PanelGalapagos.add(jScrollPane3);
        jScrollPane3.setBounds(520, 110, 800, 460);
        PanelGalapagos.add(ImagenGalapagos);
        ImagenGalapagos.setBounds(10, 130, 450, 470);

        TituloGalapagos.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TituloGalapagos.setForeground(new java.awt.Color(102, 0, 102));
        TituloGalapagos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PanelGalapagos.add(TituloGalapagos);
        TituloGalapagos.setBounds(0, 30, 1340, 60);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("ESCOJA LA CIUDAD DE DESTNO  :");
        PanelGalapagos.add(jLabel3);
        jLabel3.setBounds(100, 10, 310, 20);

        jTabbedPane1.addTab("GALAPAGOS", PanelGalapagos);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1340, 700));

        TITULO1.setBackground(new java.awt.Color(119, 121, 119));
        TITULO1.setFont(new java.awt.Font("Stencil", 2, 48)); // NOI18N
        TITULO1.setText("<html> VAMOS A DESCUBRIR ECUADOR VIAJANDO <html>");
        TITULO1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(TITULO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 540, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCostaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCostaItemStateChanged
        Icon icon;
        CiudadCosta = (String) this.ComboCosta.getSelectedItem();

        if (CiudadCosta.equals("BUCAY")) {
            this.TituloCosta.setText("\tINFORMACION DE " + CiudadCosta);

            this.TxtCosta.setText("\n\n\n"
                    + "El cantón Bucay es uno de los espacios propicios para disfrutar de\n"
                    + "paseos en caballos, observación de aves, rutas de ciclismo, descensos de \n"
                    + "ríos (rafting), tubbing, y descensos en cascadas (canyoning); que a 90 \n"
                    + "metros de altura, te permitirán sentir emociones extremas.\n"
                    + ""
                    + "Toda la diversión en medio de un clima agradable, y rodeada del verdor de\n"
                    + "sus bosques. Si hablamos de gastronomía, aquí se conjugan sabores típicos\n"
                    + "de la Costa y de los Andes; como la fritada, el seco de gallina, llapingacho y\n"
                    + "otros.  es uno de los cantones del Guayas que tiene una gran variedad de \n"
                    + "recursos naturales. Cada 9 de noviembre, sus habitantes celebran las fiestas de \n"
                    + "cantonización, y en julio se realizan actividades en honor a “Nuestra Señora\n"
                    + "del Carmen”,  patrona de la ciudad.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/buc.jpeg"));
            this.ImagenCosta.setIcon(icon);
        } else {
            this.TituloCosta.setText("\tDESCUBRE LA HERMOSA COSTA ECUATORIANA");
            this.TxtCosta.setText("");
            icon = new ImageIcon(this.getClass().getResource(""));
            this.ImagenCosta.setIcon(icon);
        }
        if (CiudadCosta.equals(" 7 CASCADAS")) {
            this.TituloCosta.setText("\tINFORMACION DE LAS  " + CiudadCosta);
            this.TxtCosta.setText("\n\n"
                    + "Quizás hayas escuchado sobre las siete cascadas ubicadas en el Cerro de \n"
                    + "Hayas, una aventura total en medio de un bosque húmedo tropical. Se\n"
                    + "aconseja llevar botas o zapatos muy cómodos dispuestos a mojarse, ya\n"
                    + "que existen tramos en los que se requiere saltar de piedra en piedra, \n"
                    + "incluso se debe escalar por una cuerda para llegar a la séptima.\n"
                    + "El bosque tiene más de 600 hectáreas de naturaleza y es muy probable, \n"
                    + "según lugareños, que su nombre signifique Lamento del Inca, porque se \n"
                    + "cree que en la cúspide del bosque que forma parte de la cordillera \n"
                    + "Molleturo hubo hace mucho tiempo un cementerio indígena, aunque hay \n"
                    + "otras leyendas que hablan de yacimientos de oro en ese sector. Actualmente\n"
                    + "pertenece a la cooperativa 23 de Noviembre, ubicada en el kilómetro 4\n"
                    + "en la vía Naranjal-Machala y ha logrado convertirse gracias al emprendimiento\n"
                    + "de sus comuneros en un lugar turístico que atrae a extranjeros,\n"
                    + "pero en especial a turistas de Guayaquil y Cuenca por su cercanía.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/7cascadas.jpeg"));
            this.ImagenCosta.setIcon(icon);
        }
        if (CiudadCosta.equals("GUAYAQUIL")) {
            this.TituloCosta.setText("\tINFORMACION DE " + CiudadCosta);
            this.TxtCosta.setText("\n\n"
                    + "Guayaquil, la ciudad más grande del Ecuador es la capital de la\n"
                    + " provincia    del Guayas y ofrece una amplia gama de lugares turísticos. \n"
                    + "Sus centros comerciales, parques, museos y malecones son los más\n"
                    + " visitados por los viajeros que se muestran encantados por la magia que \n"
                    + "ofrece la también llamada “Perla del Pacífico”.\n"
                    + "Una ciudad de arte, música, gastronomía, gente amable y atardeceres \n"
                    + "que encienden los cielos de la ciudad, convierten a Guayaquil\n"
                    + " en un destino\n"
                    + " que se tienen que visitar, la ciudad invita a propios y visitantes a \n"
                    + "descubrir sus tesoros turísticos, sus costumbres y tradiciones muy \n"
                    + "características del Puerto; además es una tierra que destacó la literatura\n"
                    + " ecuatoriana con el “Grupo de Guayaquil”, también cuna del cantautor \n"
                    + "de pasillos Julio Jaramillo el “Ruiseñor de América”");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/Gua.jpeg"));
            this.ImagenCosta.setIcon(icon);
        }
    }//GEN-LAST:event_ComboCostaItemStateChanged

    private void ComboSierraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboSierraItemStateChanged
        Icon icon;
        CiudadSierra = (String) this.ComboSierra.getSelectedItem();

        if (CiudadSierra.equals("BAÑOS DE AGUA SANTA")) {
            this.TituloSierra.setText("INFORMACION DE " + CiudadSierra);

            this.TextSierra.setText("\n\n"
                    + "Baños de Agua Santa es uno de los cantones de la Provincia de Tungurahua \n"
                    + "en la región central de la sierra, de acuerdo con el mapa político del Ecuador.\n"
                    + "Sus innumerables lugares turísticos son los que hacen de este lugar un destino\n"
                    + "ideal para personas que buscan pasar momentos agradables y divertidos ya sea \n"
                    + "en sus famosas cascadas, refrescarse en las termas ( aguas termales) o también \n"
                    + "es un buen sitio para aquellos que buscan poner un toque de adrenalina en sus \n"
                    + "vidas ya no en vano se la conoce como la capital de la aventura, aquí puedes tener \n"
                    + "la oportunidad de realizar todo tipo de deportes de aventura entre ellos canopy, \n"
                    + "canyoning, escalada , trekking , ciclismo , parapente, rafting, cabalgata entre las \n"
                    + "actividades princiapales\n\n"
                    + "Dicho todo esto, no te pierdas la oportunidad de visitar este mágico lugar lleno de\n"
                    + " encantos y bellezas naturales, recalcando que los habitantes del lugar le han puesto \n"
                    + "todo el amor y esfuerzo en cada una de sus obras para que Baños sea lo que es hoy \n"
                    + "en día un lugar de gran importancia turística dentro del Ecuador, gestores \n"
                    + "gastronómicos ofrecen productos de alta calidad. La comida permite disfrutar a los \n"
                    + "turistas las diferentes texturas y sabores de la sazón baneña (platos típicos de Baños), \n"
                    + "también podrás degustar una sabrosa bebida que traen desde Loja,\n llamada horchata,"
                    + "el exquisito chocolate ambateño, un buen ceviche.");

            icon = new ImageIcon(this.getClass().getResource("/Imagenes/baños.png"));
            this.ImagenSierra.setIcon(icon);
        } else {
            this.TituloSierra.setText("DESCUBRE LA SIERRA ECUATORIANA");
            this.TextSierra.setText("");
            icon = new ImageIcon(this.getClass().getResource(""));
            this.ImagenSierra.setIcon(icon);
        }
        if (CiudadSierra.equals("PARQUE NACIONAL COTOPAXI")) {
            this.TituloSierra.setText("INFORMACION DEL " + CiudadSierra);
            this.TextSierra.setText("\n\n\n\n\n"
                    + "Parque Nacional Cotopaxi es un área protegida de Ecuador situada\n"
                    + "en el Cantón Latacunga en la Provincia de Cotopaxi en Ecuador. Dentro del parque y en "
                    + "\nterritorio de la provincia de Cotopaxi se encuentra el nevado Volcán Cotopaxi.\n"
                    + "\n"
                    + "Su ecosistema alberga varias especies arborícolas, sobre todo de pinos, lo que convierte \n"
                    + "al lugar en un pinífero sudamericano, como todo bosque andino las especies de cipreses, \n"
                    + "pinos,abetos y fresnos es indispensable\n"
                    + "El Parque Nacional Cotopaxi dentro de sus límites cuenta con 11 atractivos naturales y 6 \n"
                    + "atractivos culturales\n"
                    + "Parque Nacional Cotopaxi laguna  El parque nacional Cotopaxi alberga algunos \n"
                    + "sistemas lacustres como son: \n"
                    + "Laguna de Limpiopungo, Laguna de Santo Domingo, Lagunas Cajas,  Laguna de \n"
                    + "Cajatamba, Manantial (laguna de los patos) siendo el más\n"
                    + "representativo la laguna de Limpiopungo.\n"
            );
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/parque.png"));
            this.ImagenSierra.setIcon(icon);
        }
        if (CiudadSierra.equals("LA MITAD DEL MUNDO")) {
            this.TituloSierra.setText("INFORMACION DE " + CiudadSierra);
            this.TextSierra.setText(
                    "\nEn la Mitad del Mundo se encuentra el monumento que hace referencia a los dos \n"
                    + "hemisferios, Norte y Sur, separados por la línea equinoccial, en dicha figura\n"
                    + "en la punta se puede observar una esfera de metal representando con ella al "
                    + "\n planeta tierra.\n"
                    + "En la parte interna del monumento se halla el Museo Ecuatorial, para recorrer \n"
                    + "dicho museo deberás subir 9 pisos y al finalizar el recorrido te encontrarás \n"
                    + "con un mirador que te permitirá apreciar la Mitad del Mundo en todo su esplendor.\n"
                    + "\n\tMuseos de Mitad del Mundo\n\n"
                    + "    •Museo del cacao\n"
                    + "Este lugar conocido como la plaza del cacao donde podrás adquirir los más deliciosos\n"
                    + " chocolates, realizados con e caco fino de aroma.\n"
                    + "    •Museo Cabañas\n"
                    + "Viviendas ancestrales que te permiten retroceder en el tiempo y descubrir las \n"
                    + "costumbres y tradiciones de los antiguos pobladores\n"
                    + "    •Estación del Tren\n"
                    + "Conocerás el tren, ícono del turismo en Ecuador\n"
                    + "    •Monumento Mitad del Mundo\n"
                    + "El Monumento Ecuatorial, éste impresionante monumento levantado en Ciudad Mitad \n"
                    + "del Mundo, y muchos turistas lo relacionan con Ecuador"
            );
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/mitad mundo.png"));
            this.ImagenSierra.setIcon(icon);
        }

    }//GEN-LAST:event_ComboSierraItemStateChanged

    private void ComboOrienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboOrienteItemStateChanged
        Icon icon;
        CiudadOriente = (String) this.ComboOriente.getSelectedItem();

        if (CiudadOriente.equals("CIRCUITO CUYABENO")) {
            this.TituloOriente.setText("INFORMACION DE " + CiudadOriente);

            this.TextOriente.setText("\n\n\n\n\n"
                    + "Es el único parque amazónico en todos los países amazónicos-andinos \n"
                    + "con amplias llanuras planas. Los estrechos arroyos, los ríos y muchos \n"
                    + "lagos que fluyen lentamente sólo pueden desarrollarse en llanuras planas;\n"
                    + "\n"
                    + "No en terreno montañoso. ¡Esto hace Cuyabeno tan único! En las secciones \n"
                    + "de secado, se llega a ver los animales terrestres y aves. Con tanta agua,\n"
                    + " se llega también a ver animales acuáticos como: Delfines, Manatíes,\n"
                    + " Capibaras, Caimán, Patos, Cormoranes, Garzas, etc.\n"
                    + "\n"
                    + "Detectar la vida silvestre de una canoa es mucho más fácil que cuando \n"
                    + "camina por un sendero. Usted tiene sus libros de observación de aves y \n"
                    + "la vida silvestre, sus binoculares y su cámara a mano.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/cuyabenoC.png"));
            this.ImagenOriente.setIcon(icon);
        } else {
            this.TituloOriente.setText("\tDESCUBRE LA HERMOSA DEL ORIENTE ECUATORIANO");
            this.TextOriente.setText("");
            icon = new ImageIcon(this.getClass().getResource(""));
            this.ImagenCosta.setIcon(icon);
        }
        if (CiudadOriente.equals("LAGARTO COCHA")) {
            this.TituloOriente.setText("INFORMACION DE " + CiudadOriente);

            this.TextOriente.setText("\n\n\n"
                    + "Este ecosistema posee una enorme biodiversidad: más de 200 especies de\n"
                    + " anfibios y reptiles, 600 especies de aves y 167 especies de mamíferos\n"
                    + " conviven en el lugar, muchos de ellas en categoría de amenaza como el\n"
                    + " delfín rosado (Inia geoffrensis), la nutria gigante (Pteronura brasiliensis) y\n"
                    + " el manatí (Trichechus inunguis), o el paiche (Arapaima gigas), el\n"
                    + " pez de agua dulce más grande del mundo y, el bagre de río en sus \n"
                    + "diferentes variedades, que constituyen alimento indispensable\n"
                    + " para la dieta de las poblaciones locales.\n"
                    + "\n"
                    + "Otro aspecto importante del humedal es la movilidad e interconexión\n"
                    + " de las comunidades kichwas, sionas, secoyas, cofanes, waorani y\n"
                    + " mestizas del sector. La vía acuática es el principal modo de transporte,\n"
                    + "permitiendo que sus habitantes puedan intercambiar productos\n"
                    + "entre sí y con otras poblaciones más alejadas. Además de propios\n"
                    + "del sector, se movilizan, cientos de visitantes que llegan cautivados\n"
                    + "por uno de los mayores atractivos turísticos naturales del país.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/lagartococha4.png"));
            this.ImagenOriente.setIcon(icon);
        }
        if (CiudadOriente.equals("LAGUNA CUYABENO")) {
            this.TituloOriente.setText("INFORMACION DE " + CiudadOriente);

            this.TextOriente.setText("\n\n\n\n"
                    + "La Laguna Grande es la de mayor superficie de las 14 que hay aquí y \n"
                    + "es un lugar estratégico para el ecoturismo que se desarrolla la en la \n"
                    + "Reserva, a la que se han involucrado las comunidades indígenas\n"
                    + "para salvaguardar y hacer respetar la flora y fauna del lugar. Incluso,\n"
                    + "algunos sectores son considerados como sagrados para como en el caso de Canangüeno.\n"
                    + "\n"
                    + "Los senderos inundados de Cuyabeno son uno de los puntos de mayor \n"
                    + "diversidad de especies, de las cuales gran parte tienen potencial \n"
                    + "productivo y comercial.  Allí es posible encontrar manatíes, delfines,\n"
                    + "caimanes y anacondas, decisivos en la regulación del ecosistema\n"
                    + "e indicadores de la salud de este.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/cuyabeno.png"));
            this.ImagenOriente.setIcon(icon);
        }
    }//GEN-LAST:event_ComboOrienteItemStateChanged

    private void ComboGalapagosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboGalapagosItemStateChanged
        Icon icon;
        CiudadGalapagos = (String) this.ComboGalapagos.getSelectedItem();

        if (CiudadGalapagos.equals("ISLA SANTA CRUZ ")) {
            this.TituloGalapagos.setText("INFORMACION DE LA" + CiudadGalapagos);

            this.TxtGalapagos.setText("\n\n\n\n\n"
                    + "El ingreso a Santa Cruz se lo realiza por la isla de Baltra, luego del registro en\n"
                    + "el aeropuerto debes abordar un autobús que te llevará hasta el canal de \n"
                    + "Itabaca para finalmente embarcarte en una lancha hasta llegar a Santa Cruz, la\n"
                    + "isla más visitada por turistas, en ella encontrarás playas de arena blanca y \n"
                    + "aguas cristalinas, los ranchos de tortugas gigantes en la parte alta, \n"
                    + "además, \n"
                    + "podrás hacer snorkel y nadar con inofensivos tiburones, leones marinos \n"
                    + "y diversas variedades de peces.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/cruz.png"));
            this.ImagenGalapagos.setIcon(icon);
        } else {
            this.TxtGalapagos.setText(" TE INTERESA SABER MAS SOBRE \n"
                    + "LAS ISLAS ENCATADAS DE GALAPAGOS Y SUS HERMOSO PAISAJES ");
            this.TituloGalapagos.setText("DESCUBRE MAS SOBRE LAS ISLAS ENCATDAS DE GALAPAGOS");
        }
        if (CiudadGalapagos.equals("ISLA SAN CRISTÓBAL")) {
            this.TituloGalapagos.setText("INFORMACION DE LA" + CiudadGalapagos);

            this.TxtGalapagos.setText("\n\n\n\n\n\n"
                    + "La isla San Cristóbal tiene un gran impacto para los visitantes, ya que ofrece\n"
                    + " una maravillosa mezcla de sitios para explorar y actividades para disfrutar. \n"
                    + "Playas vírgenes e islotes rocosos se combinan con tierras altas fértiles y\n"
                    + " exuberantes para proporcionar una amplia gama de hábitats para la\n"
                    + "vida silvestre de las Galápagos. San Cristóbal es también una de las pocas\n"
                    + "islas Galápagos habitadas, por lo que los visitantes pueden pasar la noche, \n"
                    + "cenar y disfrutar de la vida nocturna. San Cristóbal Galápagos es una gran\n"
                    + "isla para incluir en los itinerarios de excursiones terrestres y, a menudo,\n"
                    + "también se incluye en los cruceros. El ambiente relajado de la isla y la gente\n"
                    + "amigable seguramente harán que quieras quedarte aquí por más tiempo.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/cristobal.png"));
            this.ImagenGalapagos.setIcon(icon);
        }
        if (CiudadGalapagos.equals("ISLA ISABELA")) {
            this.TituloGalapagos.setText("INFORMACION DE LA" + CiudadGalapagos);

            this.TxtGalapagos.setText("\n\n\n\n\n\n"
                    + "Playas de arena blanca, cráteres que muestran signos de erupciones \n"
                    + "recientes, cuevas marinas donde los tiburones son conocidos como \n"
                    + "Tintoreras, restos de antiguas actividades humanas, entre otros,\n"
                    + "son destinos turísticos que visitan a cientos de visitantes a las Islas \n"
                    + "Galápagos atraídos por sus encantos.\n"
                    + "\n"
                    + "Los detalles del turismo en la isla están sujetos a las regulaciones \n"
                    + "especiales en las Galápagos, incluido el tour de pesca Vivencial. Este tipo\n"
                    + " de turismo diario creado para mejorar la situación socioeconómica\n"
                    + " de los pescadores consiste en conocer y practicar la pesca tradicional \n"
                    + "como pescadores autorizados por el Ministerio de Medio Ambiente.");
            icon = new ImageIcon(this.getClass().getResource("/Imagenes/isabela.png"));
            this.ImagenGalapagos.setIcon(icon);
        }
    }//GEN-LAST:event_ComboGalapagosItemStateChanged

    private void ComprarGalapagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarGalapagosMouseClicked
       seleccion m = new seleccion ();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ComprarGalapagosMouseClicked

    private void ComprarOrienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarOrienteMouseClicked
  seleccion m = new seleccion ();
       m.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_ComprarOrienteMouseClicked

    private void ComprarSierraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarSierraMouseClicked
          seleccion m = new seleccion ();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ComprarSierraMouseClicked

    private void ComprarCostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarCostaMouseClicked
  seleccion m = new seleccion ();
       m.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ComprarCostaMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCosta;
    private javax.swing.JComboBox<String> ComboGalapagos;
    private javax.swing.JComboBox<String> ComboOriente;
    private javax.swing.JComboBox<String> ComboSierra;
    private javax.swing.JLabel ComprarCosta;
    private javax.swing.JLabel ComprarGalapagos;
    private javax.swing.JLabel ComprarOriente;
    private javax.swing.JLabel ComprarSierra;
    public javax.swing.JLabel ImagenCosta;
    public javax.swing.JLabel ImagenGalapagos;
    public javax.swing.JLabel ImagenOriente;
    public javax.swing.JLabel ImagenSierra;
    private javax.swing.JPanel PanelCosta;
    private javax.swing.JPanel PanelGalapagos;
    private javax.swing.JPanel PanelOriente;
    private javax.swing.JPanel PanelSierra;
    private javax.swing.JLabel TITULO1;
    private javax.swing.JTextArea TextOriente;
    private javax.swing.JTextArea TextSierra;
    private javax.swing.JLabel TituloCosta;
    private javax.swing.JLabel TituloGalapagos;
    private javax.swing.JLabel TituloOriente;
    private javax.swing.JLabel TituloSierra;
    private javax.swing.JTextArea TxtCosta;
    private javax.swing.JTextArea TxtGalapagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
