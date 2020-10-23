package GUI;

import BaseDatos.Adm_usuarios_VIP_DB;
import BaseDatos.conexion;
import TiendaMusik.Usuario_VIP;
import javax.swing.JOptionPane;

/*
 @author Castel...
 */
public class Adm_Usuarios_VIP_GUI extends javax.swing.JFrame {

    Adm_usuarios_VIP_DB usuvipDB = new Adm_usuarios_VIP_DB();
    conexion conex = new conexion();

    public Adm_Usuarios_VIP_GUI() {
        initComponents();
    }

    public void Habilitarcampos() {
        nombre1.setEditable(true);
        apellido1.setEditable(true);
        cedula1.setEditable(true);
        direccion1.setEditable(true);
        telefono1.setEditable(true);
        descuento1.setEditable(true);
        nickname1.setEditable(true);
        contraseña1.setEditable(true);
    }

    public void Habilitarcedula() {
        nombre1.setEditable(false);
        apellido1.setEditable(false);
        cedula1.setEditable(true);
        direccion1.setEditable(false);
        telefono1.setEditable(false);
        descuento1.setEditable(false);
        nickname1.setEditable(false);
        contraseña1.setEditable(false);
    }

    public void Camposvacios() {
        nombre1.setText("");
        apellido1.setText("");
        cedula1.setText("");
        direccion1.setText("");
        telefono1.setText("");
        descuento1.setText("");
        nickname1.setText("");
        contraseña1.setText("");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        mostrarTodos = new javax.swing.JButton();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        cedula1 = new javax.swing.JTextField();
        direccion1 = new javax.swing.JTextField();
        telefono1 = new javax.swing.JTextField();
        descuento1 = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nickname = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        nickname1 = new javax.swing.JTextField();
        contraseña1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\java-aluminum-icon.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 479, -1, -1));

        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 101, 66, 24));

        apellido.setText("APELLIDO");
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 132, 66, 28));

        cedula.setText("CEDULA");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 178, 66, 30));

        direccion.setText("DIRECCION");
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 226, 83, 27));

        telefono.setText("TELEFONO");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 271, 66, 25));

        descuento.setText("DESCUENTO (%)");
        getContentPane().add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 314, -1, 29));

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 479, -1, -1));

        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 479, -1, -1));

        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 479, -1, -1));

        mostrarTodos.setText("MOSTRAR TODOS");
        mostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 522, -1, -1));

        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 96, 91, 29));

        apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido1KeyTyped(evt);
            }
        });
        getContentPane().add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 138, 91, 28));

        cedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula1KeyTyped(evt);
            }
        });
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 178, 91, 30));
        getContentPane().add(direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 221, 91, 32));

        telefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono1KeyTyped(evt);
            }
        });
        getContentPane().add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 271, 91, 30));

        descuento1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuento1KeyTyped(evt);
            }
        });
        getContentPane().add(descuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 314, 91, 29));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 181, 35));

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 560, -1, 17));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("USUARIOS VIP");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 36, 317, 53));

        nickname.setText("NICKNAME");
        getContentPane().add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 364, 84, 27));

        contraseña.setText("CONTRASEÑA");
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 406, 84, 28));
        getContentPane().add(nickname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 361, 91, 32));
        getContentPane().add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 406, 91, 28));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java-aluminum-icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -80, 750, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed

    }//GEN-LAST:event_nombre1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        conex.postgresConn();
        Habilitarcampos();
        if ("".equals(nombre1.getText()) || "".equals(apellido1.getText()) || "".equals(cedula1.getText()) || "".equals(direccion1.getText()) || "".equals(telefono1.getText()) || "".equals(descuento1.getText()) || "".equals(nickname1.getText()) || "".equals(contraseña1.getText())) {
            resultado.setText("ESPACIOS VACIOS");
        } else {
            Usuario_VIP usuvip = new Usuario_VIP(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(), descuento1.getText(), nickname1.getText(), contraseña1.getText());
            if (usuvipDB.crear(usuvip)) {
                resultado.setText("USUARIO CREADO");
                Camposvacios();
             } else {
                Habilitarcedula();
                resultado.setText("LA CEDULA EXISTE");
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void mostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosActionPerformed
        nombre1.setEditable(false);
        apellido1.setEditable(false);
        cedula1.setEditable(false);
        direccion1.setEditable(false);
        telefono1.setEditable(false);
        descuento1.setEditable(false);
        usuvipDB.consultarTodos();
        Camposvacios();

    }//GEN-LAST:event_mostrarTodosActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Usuario_VIP usuvip = new Usuario_VIP(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(), descuento1.getText(), nickname1.getText(), contraseña1.getText());
            boolean var = true;
            if (var) {
                usuvipDB.buscar(usuvip);
                resultado.setText("USUARIO ENCONTRADO");
                Camposvacios();
            } else {
                resultado.setText("USUARIO NO REGISTRADO");
            }
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void cedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_cedula1KeyTyped

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

    private void telefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_telefono1KeyTyped

    private void descuento1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuento1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_descuento1KeyTyped

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Usuario_VIP usuvip = new Usuario_VIP(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(), descuento1.getText(), nickname1.getText(), contraseña1.getText());
            int preca = JOptionPane.showConfirmDialog(null, " ¿ ESTA SEGURO QUE DESEA BORRAR EL USUARIO ?", "Precaución", JOptionPane.YES_NO_OPTION);

            if (preca == 0) {

                usuvipDB.Borrar(usuvip);
                resultado.setText("USUARIO BORRADO");
                Camposvacios();
            } else {
                resultado.setText("LA CEDULA NO EXISTE");

            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        conex.postgresConn();
        Habilitarcedula();
        if ("".equals(cedula1.getText())) {
            resultado.setText("INGRESE CEDULA");
        } else {
            Usuario_VIP usuvip = new Usuario_VIP(nombre1.getText(), apellido1.getText(), Integer.parseInt(cedula1.getText()), direccion1.getText(), telefono1.getText(), descuento1.getText(), nickname1.getText(), contraseña1.getText());
            nombre1.setEditable(true);
            apellido1.setEditable(true);
            cedula1.setEditable(false);
            direccion1.setEditable(true);
            telefono1.setEditable(true);
            descuento1.setEditable(true);
            nickname1.setEditable(true);
            contraseña1.setEditable(true);
            if ("".equals(nombre1.getText()) || "".equals(apellido1.getText()) || "".equals(direccion1.getText()) || "".equals(telefono1.getText()) || "".equals(descuento1.getText())||"".equals(nickname1.getText())||"".equals(contraseña1.getText())) {
                resultado.setText("ESPACIOS VACIOS");
            } else {
                usuvipDB.Modificar(usuvip);
                resultado.setText("USUARIO EDITADO");
                Camposvacios();
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administrador_GUI adm = new Administrador_GUI();
        adm.setVisible(true);
        adm.setTitle("ADMINISTRADOR");
        adm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellido1;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel cedula;
    private javax.swing.JTextField cedula1;
    private javax.swing.JLabel contraseña;
    private javax.swing.JTextField contraseña1;
    private javax.swing.JLabel descuento;
    private javax.swing.JTextField descuento1;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direccion1;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrarTodos;
    private javax.swing.JLabel nickname;
    private javax.swing.JTextField nickname1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefono1;
    // End of variables declaration//GEN-END:variables
}
