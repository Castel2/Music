
package GUI;

/*
  @author User
 */
public class Busqueda_Canciones_VIP_GUI extends javax.swing.JFrame {

    
    public Busqueda_Canciones_VIP_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Porgenero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Porid = new javax.swing.JButton();
        Pornombre = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        Porartista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Porgenero.setText("Por Genero");
        Porgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorgeneroActionPerformed(evt);
            }
        });
        getContentPane().add(Porgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 159, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSQUEDAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 31, 289, 65));

        Porid.setText("Por identificador");
        Porid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoridActionPerformed(evt);
            }
        });
        getContentPane().add(Porid, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 159, -1, -1));

        Pornombre.setText("Por nombre");
        Pornombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PornombreActionPerformed(evt);
            }
        });
        getContentPane().add(Pornombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 103, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 202, -1, 17));

        Porartista.setText("Por Artista");
        Porartista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorartistaActionPerformed(evt);
            }
        });
        getContentPane().add(Porartista, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 103, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/400_1237048175_tape-music-wallpapers129511024x768.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PorgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorgeneroActionPerformed
        Busqueda_Genero_VIP_GUI genero = new Busqueda_Genero_VIP_GUI();
        genero.setVisible(true);
        genero.setTitle("BUSQUEDA POR GENERO");
        genero.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_PorgeneroActionPerformed

    private void PoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoridActionPerformed
        Busqueda_Id_VIP_GUI id = new Busqueda_Id_VIP_GUI();
        id.setVisible(true);
        id.setTitle("BUSQUEDA POR IDENTIFICADOR");
        id.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_PoridActionPerformed

    private void PornombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PornombreActionPerformed
        Busqueda_Nombre_VIP_GUI nom = new Busqueda_Nombre_VIP_GUI();
        nom.setVisible(true);
        nom.setTitle("BUSQUEDA POR NOMBRE");
        nom.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_PornombreActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        Usuarios_VIP_GUI usuvipGUI = new Usuarios_VIP_GUI();
       usuvipGUI.setVisible(true);
       usuvipGUI.setTitle("USUARIO");
       usuvipGUI.setLocationRelativeTo(null);
       this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void PorartistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorartistaActionPerformed
        Busqueda_Artista_VIP_GUI arti = new Busqueda_Artista_VIP_GUI();
        arti.setVisible(true);
        arti.setTitle("BUSQUEDA POR ARTISTA");
        arti.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_PorartistaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Porartista;
    private javax.swing.JButton Porgenero;
    private javax.swing.JButton Porid;
    private javax.swing.JButton Pornombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
