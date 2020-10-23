
package GUI;

import BaseDatos.Adm_Busqueda_Canciones_DB;
import BaseDatos.conexion;
import TiendaMusik.Canciones;

/*
  @author Castel...
 */
public class Busqueda_Nombre_VIP_GUI extends javax.swing.JFrame {

    Adm_Busqueda_Canciones_DB busquedaNombre = new Adm_Busqueda_Canciones_DB();
    conexion conex = new conexion();
    
    public Busqueda_Nombre_VIP_GUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        descargar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        nombre1 = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 218, 76, 19));

        descargar.setText("DESCARGAR");
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        getContentPane().add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 147, -1, -1));

        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 105, 78, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSQUEDA POR NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 26, 477, 65));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 147, -1, -1));

        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 98, 107, 31));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 190, 163, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica-con-notas-musicales_23-2147487251.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Busqueda_Canciones_VIP_GUI busque = new Busqueda_Canciones_VIP_GUI ();
        busque.setVisible(true);
        busque.setTitle("BUSQUEDAS");
        busque.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        Descargar_Canciones_GUI descargar = new Descargar_Canciones_GUI();
        descargar.setVisible(true);
        descargar.setTitle("BUSQUEDAS");
        descargar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_descargarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        conex.postgresConn();
        nombre1.setEditable(true);
        if ("".equals(nombre1.getText())) {
            resultado.setText("INGRESE NOMBRE");
        } else {
            Canciones cancion = new Canciones(nombre1.getText(),null,null);
            if (busquedaNombre.BuscarNombre(cancion)) {
                resultado.setText("CANCION ENCONTRADA");
                nombre1.setText("");
            } else {
                nombre1.setText("");
                resultado.setText("CANCION NO ENCONTRADA");
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_nombre1KeyTyped

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton descargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
