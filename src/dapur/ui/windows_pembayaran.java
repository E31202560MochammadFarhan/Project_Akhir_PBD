/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.ui;

import dapur.helper.pembayaran_manajer;
import dapur.model.pembayaran;
import dapur.model.pemesananStatic;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Farhansw
 */
public class windows_pembayaran extends javax.swing.JFrame {
    pembayaran pembayaranGlobal;
    String id_pemesanan = Integer.toString(pemesananStatic.getId_pemesanan());
    //String totalpak = PaketInternet.getHarga_paket();
    int totalpem = pemesananStatic.getTotal_harga();
    /**
     * Creates new form windows_pembayaran
     */
    public windows_pembayaran() {
        initComponents();
        setLocationRelativeTo(null);
        tfTotal.setText(String.valueOf(totalpem));
    }
    
    public void showMessage(String message, int type){
       if(type == 1){
           JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
       } else {
           JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
     
    private boolean validasiInput() throws SQLException{
       boolean isCompleted = false;
       pembayaran pem = new pembayaran();
       pem.setTotal(Integer.parseInt(tfTotal.getText()));
       pem.setBayar(Integer.parseInt(tfBayar.getText()));
       pem.setKembalian(Integer.parseInt(tfKembali.getText()));
       
       if (rbNontunai.isSelected()) {
           pem.setJenis_pembayaran(rbNontunai.getText());
           pem.setJenis_nontunai(cbNontunai.getSelectedItem().toString());
           isCompleted = true;
       } else if (rbTunai.isSelected()) {
           pem.setJenis_pembayaran(rbTunai.getText());
           isCompleted = true;
       }
        
        pembayaranGlobal = pem;
        if (!isCompleted) {
            showMessage("Silahkan pilih metode pembayaran!", 2);
            return false;
        } else {
            return true;
        }
    }
    
    private void getKembalian(){
        try {
           int Total = Integer.parseInt(tfTotal.getText());
           int Bayar = Integer.parseInt(tfBayar.getText());
           int Kembalian = (Bayar - Total);
           tfKembali.setText(String.valueOf(Kembalian));
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbTunai = new javax.swing.JRadioButton();
        rbNontunai = new javax.swing.JRadioButton();
        cbNontunai = new javax.swing.JComboBox<>();
        btBayar = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfKembali = new javax.swing.JTextField();
        btHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dapur Bu Yoyok");

        jLabel1.setText("Total Pembayaran    :");

        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("Metode Pmbayaran   :");

        rbTunai.setText("Tunai");
        rbTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTunaiActionPerformed(evt);
            }
        });

        rbNontunai.setText("Non Tunai");

        cbNontunai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gopay", "ShoopePay", "Dana", "OVO" }));
        cbNontunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNontunaiActionPerformed(evt);
            }
        });

        btBayar.setText("BAYAR");
        btBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBayarActionPerformed(evt);
            }
        });

        btBatal.setText("BATAL");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PEMBAYARAN");

        jLabel4.setText("Bayar:");

        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });

        jLabel5.setText("Kembalian:");

        tfKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKembaliActionPerformed(evt);
            }
        });

        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfTotal)
                                .addGap(123, 123, 123))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbTunai)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btBayar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btBatal))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbNontunai)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbNontunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 118, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btHitung)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBayar)
                                    .addComponent(tfKembali))
                                .addGap(125, 125, 125))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbTunai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNontunai)
                    .addComponent(cbNontunai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBayar)
                    .addComponent(btBatal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed

    private void rbTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTunaiActionPerformed

    private void cbNontunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNontunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNontunaiActionPerformed

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        // TODO add your handling code here:
        dispose();
        new mainwindow().setVisible(true);
    }//GEN-LAST:event_btBatalActionPerformed

    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBayarActionPerformed

    private void tfKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKembaliActionPerformed

    private void btBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBayarActionPerformed
        // TODO add your handling code here:
        try {
            if (validasiInput()) {
                pembayaran_manajer.tambahPembayaran(pembayaranGlobal);
                showMessage("Terimakasih", 1);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(windows_pembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBayarActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        // TODO add your handling code here:
        getKembalian();
    }//GEN-LAST:event_btHitungActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(windows_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windows_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windows_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windows_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windows_pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btBayar;
    private javax.swing.JButton btHitung;
    private javax.swing.JComboBox<String> cbNontunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbNontunai;
    private javax.swing.JRadioButton rbTunai;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfKembali;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
