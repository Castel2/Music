
package GUI;

/*
  @author Castel...
 */
public class Empleados_GUI extends javax.swing.JFrame {

    
    public Empleados_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        salario = new javax.swing.JButton();
        misdatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 179, 70, 20));

        salario.setText("Salario");
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });
        getContentPane().add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 136, -1, -1));

        misdatos.setText("Mis datos");
        misdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misdatosActionPerformed(evt);
            }
        });
        getContentPane().add(misdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 136, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLEADO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 48, -1, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MicrofonoRadio1-e1367699562347.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Principal_GUI principal = new Principal_GUI();
        principal.setVisible(true);
        principal.setTitle("TIENDA DE MUSICA");
        principal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
      Salario_GUI salario = new Salario_GUI();
      salario.setVisible(true);
      salario.setTitle("TIENDA DE MUSICA");
      salario.setLocationRelativeTo(null);
      this.setVisible(false);
    }//GEN-LAST:event_salarioActionPerformed

    private void misdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misdatosActionPerformed
        Contrasena_Empleado_GUI misDatos = new Contrasena_Empleado_GUI();
        misDatos.setVisible(true);
        misDatos.setTitle("VERIFICACION");
        misDatos.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_misdatosActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton misdatos;
    private javax.swing.JButton salario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
