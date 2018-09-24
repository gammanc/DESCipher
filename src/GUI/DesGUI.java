/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import des.DES;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author saulr
 */
public class DesGUI extends javax.swing.JFrame {

    public DesGUI() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Cifrado DES para archivos");
    }
    
    String parent = "";
    
    void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        if (f != null){
            String filename = f.getAbsolutePath();
            parent = f.getParent();
            txt_origen.setText(filename);
        }
    }
    
    boolean validateFiles(){
        if(parent.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un archivo a cifrar");
            return false;
        }
        if (txt_origen.getText().equals( parent + "\\" +txt_destino.getText())){
            JOptionPane.showMessageDialog(rootPane, "El archivo de origen y destino son los mismos.");
            return false;
        }
        if(txt_destino.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Proporcione un nombre de archivo de destino.");
            return false;
        }
        if(txt_clave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Proporcione una llave.");
            return false;
        }
        if(txt_clave.getText().trim().length() < 6){
            JOptionPane.showMessageDialog(rootPane, "La llave es muy corta");
            return false;
        }
        return true;
    }
    
    void clean(){
        parent = "";
        txt_origen.setText("");
        txt_destino.setText("");
        txt_clave.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Encriptar = new javax.swing.JButton();
        Desenctripar = new javax.swing.JButton();
        txt_origen = new javax.swing.JTextField();
        txt_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seleccionar1.setText("Seleccionar");
        seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Archivo de origen : ");

        jLabel5.setText("Nombre archivo destino : ");

        Encriptar.setText("Cifrar");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        Desenctripar.setText("Descifrar");
        Desenctripar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenctriparActionPerformed(evt);
            }
        });

        txt_origen.setFocusable(false);
        txt_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_origenMouseClicked(evt);
            }
        });

        jLabel2.setText("Clave : ");

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(seleccionar1))
                            .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Encriptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Desenctripar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encriptar)
                    .addComponent(Desenctripar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar1ActionPerformed
       openFile();
    }//GEN-LAST:event_seleccionar1ActionPerformed

    private void DesenctriparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenctriparActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("d", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Tu archivo fue descifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Descifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_DesenctriparActionPerformed

    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        DES des = new DES();
        if(validateFiles()){
            des.applyDES("e", txt_clave.getText(), txt_origen.getText(), parent + "\\" +txt_destino.getText());
            JOptionPane.showMessageDialog(this,
                    "Tu archivo fue cifrado correctamente\n Está ubicado en: "+parent + "\\" +txt_destino.getText(),
                    "Cifrado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
    }//GEN-LAST:event_EncriptarActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void txt_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_origenMouseClicked
        openFile();
    }//GEN-LAST:event_txt_origenMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desenctripar;
    private javax.swing.JButton Encriptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton seleccionar1;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_destino;
    private javax.swing.JTextField txt_origen;
    // End of variables declaration//GEN-END:variables
}
