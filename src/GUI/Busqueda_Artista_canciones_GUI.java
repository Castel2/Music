
package GUI;

import BaseDatos.Adm_Busqueda_Canciones_DB;
import BaseDatos.conexion;
import TiendaMusik.Canciones;

/*
  @author Castel..
 */
public class Busqueda_Artista_canciones_GUI extends javax.swing.JFrame {

    Adm_Busqueda_Canciones_DB busquedaNombre = new Adm_Busqueda_Canciones_DB();
    conexion conex = new conexion();
    
    public Busqueda_Artista_canciones_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        descargar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        artista = new javax.swing.JLabel();
        artista1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 183, 163, 34));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSQUEDA POR ARTISTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 65));

        descargar.setText("DESCARGAR");
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        getContentPane().add(descargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 140, -1, -1));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 198, 76, 19));

        artista.setText("ARTISTA");
        getContentPane().add(artista, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 98, 101, -1));

        artista1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                artista1KeyTyped(evt);
            }
        });
        getContentPane().add(artista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 91, 107, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica-con-notas-musicales_23-2147487251.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        conex.postgresConn();
        artista1.setEditable(true);
        if ("".equals(artista1.getText())) {
            resultado.setText("INGRESE ARTISTA");
        } else {
            Canciones cancion = new Canciones(null,artista1.getText(),null);
            if (busquedaNombre.BuscarArtista(cancion)) {
                resultado.setText("CANCION ENCONTRADA");
                artista1.setText("");
            } else {
                artista1.setText("");
                resultado.setText("CANCION NO ENCONTRADA");
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
       Descargar_Canciones_GUI descargar = new Descargar_Canciones_GUI();
       descargar.setVisible(true);
       descargar.setTitle("BUSQUEDAS");
       descargar.setLocationRelativeTo(null);
       this.setVisible(false); 
    }//GEN-LAST:event_descargarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Busqueda_Canciones busque = new Busqueda_Canciones();
        busque.setVisible(true);
        busque.setTitle("BUSQUEDAS");
        busque.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void artista1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_artista1KeyTyped
      char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_artista1KeyTyped

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artista;
    private javax.swing.JTextField artista1;
    private javax.swing.JButton buscar;
    private javax.swing.JButton descargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
