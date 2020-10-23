
package GUI;

/*
  @author Castel...
 */
public class Administrador_GUI extends javax.swing.JFrame {

    
    public Administrador_GUI() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuarios = new javax.swing.JButton();
        usuarioVip = new javax.swing.JButton();
        trabajador = new javax.swing.JButton();
        canciones = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java-aluminum-icon.png"))); // NOI18N

        jLabel3.setText("jLabel3");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("ADMINISTRADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 352, 89));

        usuarios.setText("USUARIOS");
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 132, -1));

        usuarioVip.setText("USUARIOS VIP");
        usuarioVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioVipActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 138, -1));

        trabajador.setText("TRABAJADORES");
        trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(trabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 132, -1));

        canciones.setText("CANCIONES");
        canciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancionesActionPerformed(evt);
            }
        });
        getContentPane().add(canciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 138, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java-aluminum-icon.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -50, 730, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
      Adm_Usuarios_GUI usu = new Adm_Usuarios_GUI();
      usu.setVisible(true);
      usu.setTitle("USUARIOS");
      usu.setLocationRelativeTo(null);
      this.setVisible(false);
    }//GEN-LAST:event_usuariosActionPerformed

    private void usuarioVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioVipActionPerformed
       Adm_Usuarios_VIP_GUI vip = new Adm_Usuarios_VIP_GUI();
       vip.setVisible(true);
       vip.setTitle("USUARIOS VIP");
       vip.setLocationRelativeTo(null);
       this.setVisible(false);
    }//GEN-LAST:event_usuarioVipActionPerformed

    private void trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorActionPerformed
        Adm_Trabajador_GUI trabajador = new Adm_Trabajador_GUI();
        trabajador.setVisible(true);
        trabajador.setTitle("TRABAJADORES");
        trabajador.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_trabajadorActionPerformed

    private void cancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancionesActionPerformed
        Adm_Canciones_GUI cancion = new Adm_Canciones_GUI();
        cancion.setVisible(true);
        cancion.setTitle("CANCIONES");
        cancion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cancionesActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       Principal_GUI gui = new Principal_GUI();
       gui.setVisible(true);
       gui.setTitle("TIENDA DE MUSICA");
       this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton trabajador;
    private javax.swing.JButton usuarioVip;
    private javax.swing.JButton usuarios;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
