package GUI;


import BaseDatos.Adm_canciones_DB;
import BaseDatos.conexion;
import TiendaMusik.Canciones;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/*
 @author Castel...
 */
public class Adm_Canciones_GUI extends javax.swing.JFrame {
    
    Adm_canciones_DB musica = new Adm_canciones_DB();
    conexion conex = new conexion();
    
    public Adm_Canciones_GUI() {
        initComponents();
        listar();
    }
    
    public void listar() {
        
        DefaultComboBoxModel theModel = (DefaultComboBoxModel) Genero.getModel();
        theModel.removeAllElements();
        Genero.addItem("Seleccione...");
        Genero.addItem("Clasica");
        Genero.addItem("Salsa");
        Genero.addItem("Balada");
        Genero.addItem("Bachata");
        Genero.addItem("Reggaeton");
        Genero.addItem("Reggae");
        Genero.addItem("Jazz");
        Genero.addItem("Dance");
        Genero.addItem("Hip-Hop");
        Genero.addItem("Rap");
        Genero.addItem("Pop Rock");
        Genero.addItem("Rock");
        Genero.addItem("Metal");
        Genero.addItem("Punk");
        Genero.addItem("Electronica");
        Genero.addItem("Electro - House");
        Genero.addItem("Tecno");
        Genero.addItem("Country");
        Genero.addItem("DESCONOCIDO");
        
    }
    
    public void Habilitarcampos() {
        nombre1.setEditable(true);
        artista1.setEditable(true);
        album1.setEditable(true);
        a_o1.setEditable(true);
        id1.setEditable(true);
    }
    
    public void Habilitarid() {
        nombre1.setEditable(false);
        artista1.setEditable(false);
        album1.setEditable(false);
        a_o1.setEditable(false);
        id1.setEditable(true);
    }
    
    public void Camposvacios() {
        nombre1.setText("");
        artista1.setText("");
        album1.setText("");
        a_o1.setText("");
        id1.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        artista = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        album = new javax.swing.JLabel();
        a_o = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        artista1 = new javax.swing.JTextField();
        album1 = new javax.swing.JTextField();
        a_o1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        mostrarTodos = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        Genero = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CANCIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 32, 289, 65));

        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 115, 73, 29));

        artista.setText("ARTISTA");
        getContentPane().add(artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 162, 91, 28));

        genero.setText("GENERO");
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 208, 91, 31));

        album.setText("ALBUM");
        getContentPane().add(album, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 257, 91, 31));

        a_o.setText("AÑO");
        getContentPane().add(a_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 306, 91, 33));

        id.setText("IDENTIFICADOR");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 357, -1, 31));

        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 119, 94, 29));

        artista1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                artista1KeyTyped(evt);
            }
        });
        getContentPane().add(artista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 166, 94, 28));

        album1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                album1KeyTyped(evt);
            }
        });
        getContentPane().add(album1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 257, 94, 31));

        a_o1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a_o1KeyTyped(evt);
            }
        });
        getContentPane().add(a_o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 306, 94, 33));

        id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id1KeyTyped(evt);
            }
        });
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 357, 94, 31));

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 422, 93, -1));

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 422, 88, -1));

        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 422, 89, -1));

        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 422, -1, -1));

        mostrarTodos.setText("MOSTRAR TODOS");
        mostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 460, -1, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 503, 226, 35));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 522, -1, 16));

        Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 212, 94, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java-aluminum-icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -60, 750, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        conex.postgresConn();
        Habilitarcampos();
        if ("".equals(nombre1.getText()) || "".equals(artista1.getText()) || "Seleccione...".equals(Genero.getSelectedItem().toString()) || "".equals(album1.getText()) || "".equals(a_o1.getText())) {
                    resultado.setText("ESPACION VACIOS");
        } else {
        Canciones cancion = new Canciones(nombre1.getText(), artista1.getText(), Genero.getSelectedItem().toString(), album1.getText(), a_o1.getText(), Integer.parseInt(id1.getText()));
        if (musica.crear(cancion)) {
                resultado.setText("CANCION CREADA");
                Camposvacios();
            } else {
                Habilitarid();
                resultado.setText("EL IDENTIFICADOR EXISTE");
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        conex.postgresConn();
        Habilitarid();
        if ("".equals(id1.getText())) {
            resultado.setText("INGRESE IDENTIFICADOR");
        } else {
            Canciones cancion = new Canciones(nombre1.getText(), artista1.getText(), Genero.getSelectedItem().toString(), album1.getText(), a_o1.getText(), Integer.parseInt(id1.getText()));
            nombre1.setEditable(true);
            artista1.setEditable(true);
            album1.setEditable(true);
            a_o1.setEditable(true);
            id1.setEditable(false);
            if ("".equals(nombre1.getText()) || "".equals(artista1.getText()) || "Seleccione...".equals(Genero.getSelectedItem().toString()) || "".equals(album1.getText()) || "".equals(a_o1.getText())) {
                    resultado.setText("ESPACION VACIOS");
            } else {
                musica.Modificar(cancion);
                resultado.setText("CANCION EDITADA");
                Camposvacios();
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         conex.postgresConn();
        Habilitarid();
        if ("".equals(id1.getText())) {
            resultado.setText("INGRESE IDENTIFICADOR");
        } else {
            Canciones cancion = new Canciones(nombre1.getText(), artista1.getText(), Genero.getSelectedItem().toString(), album1.getText(), a_o1.getText(), Integer.parseInt(id1.getText()));
            int preca = JOptionPane.showConfirmDialog(null, " ¿ ESTA SEGURO QUE DESEA BORRAR EL USUARIO ?", "Precaución", JOptionPane.YES_NO_OPTION);

            if (preca == 0) {

                musica.Borrar(cancion);
                resultado.setText("CANCION BORRADA");
                Camposvacios();
            } else {
                resultado.setText("EL IDENTIFICADOR NO EXISTE");

            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        conex.postgresConn();
        Habilitarid();
        if ("".equals(id1.getText())) {
            resultado.setText("INGRESE IDENTIFICADOR");
        } else {
            Canciones cancion = new Canciones(nombre1.getText(), artista1.getText(), Genero.getSelectedItem().toString(), album1.getText(), a_o1.getText(), Integer.parseInt(id1.getText()));
            boolean var = true;
            if (var) {
                musica.buscar(cancion);
                resultado.setText("CANCION ENCONTRADA");
                Camposvacios();
            } else {
                resultado.setText("CANCION NO REGISTRADA");
            }
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void mostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosActionPerformed
        nombre1.setEditable(false);
        artista1.setEditable(false);
        album1.setEditable(false);
        a_o1.setEditable(false);
        id1.setEditable(false);
        musica.consultarTodos();
        Camposvacios();
    }//GEN-LAST:event_mostrarTodosActionPerformed

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_nombre1KeyTyped

    private void artista1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_artista1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_artista1KeyTyped

    private void album1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_album1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_album1KeyTyped

    private void a_o1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a_o1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_a_o1KeyTyped

    private void id1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_id1KeyTyped

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Administrador_GUI adm = new Administrador_GUI();
        adm.setVisible(true);
        adm.setTitle("ADMINISTRADOR");
        adm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Genero;
    private javax.swing.JLabel a_o;
    private javax.swing.JTextField a_o1;
    private javax.swing.JLabel album;
    private javax.swing.JTextField album1;
    private javax.swing.JLabel artista;
    private javax.swing.JTextField artista1;
    private javax.swing.JButton borrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton editar;
    private javax.swing.JLabel genero;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrarTodos;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
