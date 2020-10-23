package GUI;


import BaseDatos.Adm_trabajador_DB;
import BaseDatos.conexion;
import TiendaMusik.Trabajador_sistema;
import javax.swing.JOptionPane;

/*
 @author Castel...
 */
public class Adm_Trabajador_GUI extends javax.swing.JFrame {

    Adm_trabajador_DB trabajadorDB = new Adm_trabajador_DB();
    conexion conex = new conexion();
    
   public Adm_Trabajador_GUI() {
        initComponents();
    }

    public void Habilitarcampos() {
        nombre1.setEditable(true);
        apellido1.setEditable(true);
        cedula1.setEditable(true);
        direccion1.setEditable(true);
        telefono1.setEditable(true);
        salario1.setEditable(true);
        nickname1.setEditable(true);
        contraseña1.setEditable(true);
    }
    
    public void Habilitarcedula() {
        nombre1.setEditable(false);
        apellido1.setEditable(false);
        cedula1.setEditable(true);
        direccion1.setEditable(false);
        telefono1.setEditable(false);
        salario1.setEditable(false);
        nickname1.setEditable(false);
        contraseña1.setEditable(false);
    }

    public void Camposvacios() {
        nombre1.setText("");
        apellido1.setText("");
        cedula1.setText("");
        direccion1.setText("");
        telefono1.setText("");
        salario1.setText("");
        nickname1.setText("");
        contraseña1.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        cedula1 = new javax.swing.JTextField();
        direccion1 = new javax.swing.JTextField();
        telefono1 = new javax.swing.JTextField();
        salario1 = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        mostrarTodos = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        nickname = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        nickname1 = new javax.swing.JTextField();
        contraseña1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("TRABAJADORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 23, 314, 54));

        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 95, 96, 27));

        apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido1KeyTyped(evt);
            }
        });
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 140, 96, 29));

        cedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula1KeyTyped(evt);
            }
        });
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 189, 96, 30));
        getContentPane().add(direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 238, 96, 32));

        telefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono1KeyTyped(evt);
            }
        });
        getContentPane().add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 283, 96, 30));

        salario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salario1KeyTyped(evt);
            }
        });
        getContentPane().add(salario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 331, 96, 31));

        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 95, 86, 27));

        apellido.setText("APELLIDO");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 140, 84, 29));

        cedula.setText("CEDULA");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 187, 84, 31));

        direccion.setText("DIRECCION");
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 237, 84, 28));

        telefono.setText("TELEFONO");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 284, 84, 28));

        salario.setText("SALARIO");
        getContentPane().add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 331, 84, 31));

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 489, -1, -1));

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 489, 102, -1));

        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 489, 95, -1));

        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 489, -1, -1));

        mostrarTodos.setText("MOSTRAR TODOS");
        mostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 527, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 589, 70, 20));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 565, 201, 37));

        nickname.setText("NICKNAME");
        getContentPane().add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 380, 84, 27));

        contraseña.setText("CONTRASEÑA");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 425, 84, 28));
        getContentPane().add(nickname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 380, 96, 27));
        getContentPane().add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 425, 96, 28));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java-aluminum-icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -30, 750, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        conex.postgresConn();
        Habilitarcampos();
        if ("".equals(nombre1.getText()) || "".equals(apellido1.getText()) || "".equals(cedula1.getText()) || "".equals(direccion1.getText()) || "".equals(telefono1.getText())|| "".equals(salario1.getText())||"".equals(nickname1.getText())||"".equals(contraseña1.getText())) {
            resultado.setText("ESPACIOS VACIOS");
        } else {
            Trabajador_sistema trabasistem = new Trabajador_sistema(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(),salario1.getText(),nickname1.getText(),contraseña1.getText());
        if (trabajadorDB.crear(trabasistem)) {
                resultado.setText("USUARIO CREADO");
                Camposvacios();
            } else {
                 Habilitarcedula();
                 resultado.setText("LA CEDULA EXISTE");
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Trabajador_sistema trabasistem = new Trabajador_sistema(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(),salario1.getText(),nickname1.getText(),contraseña1.getText());
            nombre1.setEditable(true);
            apellido1.setEditable(true);
            cedula1.setEditable(false);
            direccion1.setEditable(true);
            telefono1.setEditable(true);
            salario1.setEditable(true);
            nickname1.setEditable(true);
            contraseña1.setEditable(true);
            if ("".equals(nombre1.getText()) || "".equals(apellido1.getText()) || "".equals(direccion1.getText()) || "".equals(telefono1.getText())||"".equals(salario1.getText())||"".equals(nickname1.getText())||"".equals(contraseña1.getText())) {
                resultado.setText("ESPACIOS VACIOS");
            } else {
                trabajadorDB.Modificar(trabasistem);
                resultado.setText("USUARIO EDITADO");
                Camposvacios();
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Trabajador_sistema trabasistem = new Trabajador_sistema(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(),salario1.getText(),nickname1.getText(),contraseña1.getText());
            int preca = JOptionPane.showConfirmDialog(null, " ¿ ESTA SEGURO QUE DESEA BORRAR EL USUARIO ?", "Precaución", JOptionPane.YES_NO_OPTION);

            if (preca == 0) {

                trabajadorDB.Borrar(trabasistem);
                resultado.setText("USUARIO BORRADO");
                Camposvacios();
            } else {
                resultado.setText("LA CEDULA NO EXISTE");

            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Trabajador_sistema trabasistem = new Trabajador_sistema(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(),salario1.getText(),nickname1.getText(),contraseña1.getText());
            boolean var = true;
            if (var) {
                trabajadorDB.buscar(trabasistem);
                resultado.setText("USUARIO ENCONTRADO");
                Camposvacios();
            } else {
                resultado.setText("USUARIO NO REGISTRADO");
            }
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void mostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosActionPerformed
        nombre1.setEditable(false);
        apellido1.setEditable(false);
        cedula1.setEditable(false);
        direccion1.setEditable(false);
        telefono1.setEditable(false);
        salario1.setEditable(false);
        trabajadorDB.consultarTodos();
        Camposvacios();
    }//GEN-LAST:event_mostrarTodosActionPerformed

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_nombre1KeyTyped

    private void apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_apellido1KeyTyped

    private void cedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_cedula1KeyTyped

    private void telefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_telefono1KeyTyped

    private void salario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salario1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_salario1KeyTyped

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Administrador_GUI adm = new Administrador_GUI();
        adm.setVisible(true);
        adm.setTitle("ADMINISTRADOR");
        adm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellido1;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField cedula1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JTextField contraseña1;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direccion1;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrarTodos;
    private javax.swing.JLabel nickname;
    private javax.swing.JTextField nickname1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel salario;
    private javax.swing.JTextField salario1;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefono1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
