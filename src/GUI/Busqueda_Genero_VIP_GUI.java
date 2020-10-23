
package GUI;

import BaseDatos.Adm_Busqueda_Canciones_DB;
import BaseDatos.conexion;
import TiendaMusik.Canciones;

/*
  @author Castel...
 */
public class Busqueda_Genero_VIP_GUI extends javax.swing.JFrame {

    Adm_Busqueda_Canciones_DB busquedaNombre = new Adm_Busqueda_Canciones_DB();
    conexion conex = new conexion();
    
    public Busqueda_Genero_VIP_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genero = new javax.swing.JLabel();
        genero1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        descargar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genero.setText("GENERO");
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 82, 109, 28));

        genero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genero1KeyTyped(evt);
            }
        });
        getContentPane().add(genero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 82, 107, 31));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSQUEDA POR GENERO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 65));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 179, 163, 34));

        descargar.setText("DESCARGAR");
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        getContentPane().add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 132, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 194, 76, 19));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 132, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica-con-notas-musicales_23-2147487251.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        Descargar_Canciones_GUI descargar = new Descargar_Canciones_GUI();
        descargar.setVisible(true);
        descargar.setTitle("BUSQUEDAS");
        descargar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_descargarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Busqueda_Canciones_VIP_GUI busque = new Busqueda_Canciones_VIP_GUI();
        busque.setVisible(true);
        busque.setTitle("BUSQUEDAS");
        busque.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        conex.postgresConn();
        genero1.setEditable(true);
        if ("".equals(genero1.getText())) {
            resultado.setText("INGRESE GENERO");
        } else {
            Canciones cancion = new Canciones(null,null,genero1.getText());
            if (busquedaNombre.BuscarGenero(cancion)) {
                resultado.setText("CANCION ENCONTRADA");
                genero1.setText("");
            } else {
                genero1.setText("");
                resultado.setText("CANCION NO ENCONTRADA");
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void genero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genero1KeyTyped
       char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_genero1KeyTyped

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton descargar;
    private javax.swing.JLabel genero;
    private javax.swing.JTextField genero1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
