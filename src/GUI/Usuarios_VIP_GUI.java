
package GUI;

import BaseDatos.Adm_Descargas;

/*
  @author Castel..
 */
public class Usuarios_VIP_GUI extends javax.swing.JFrame {

    Adm_Descargas bajar = new Adm_Descargas();
    
    public Usuarios_VIP_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mimusica = new javax.swing.JButton();
        buscarcanciones = new javax.swing.JButton();
        misdatos = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mimusica.setText("Mi musica");
        mimusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimusicaActionPerformed(evt);
            }
        });
        getContentPane().add(mimusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 135, -1, -1));

        buscarcanciones.setText("Buscar canciones");
        buscarcanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcancionesActionPerformed(evt);
            }
        });
        getContentPane().add(buscarcanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 135, -1, -1));

        misdatos.setText("Mis datos");
        misdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misdatosActionPerformed(evt);
            }
        });
        getContentPane().add(misdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 135, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 195, 70, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO VIP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 41, -1, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MicrofonoRadio1-e1367699562347.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mimusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimusicaActionPerformed
        bajar.consultarTodos();
    }//GEN-LAST:event_mimusicaActionPerformed

    private void buscarcancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcancionesActionPerformed
        Busqueda_Canciones_VIP_GUI busqudas = new Busqueda_Canciones_VIP_GUI();
        busqudas.setVisible(true);
        busqudas.setTitle("BUSQUEDAS");
        busqudas.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_buscarcancionesActionPerformed

    private void misdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misdatosActionPerformed
        Contrasena_Usuario_VIP_GUI misDatos = new Contrasena_Usuario_VIP_GUI();
        misDatos.setVisible(true);
        misDatos.setTitle("VERIFICACION");
        misDatos.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_misdatosActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Principal_GUI principal = new Principal_GUI();
        principal.setVisible(true);
        principal.setTitle("TIENDA DE MUSICA");
        principal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarcanciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mimusica;
    private javax.swing.JButton misdatos;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
