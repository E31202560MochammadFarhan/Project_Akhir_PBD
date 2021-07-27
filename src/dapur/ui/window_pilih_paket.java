/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.ui;

import dapur.helper.ConnectionHelper;
import dapur.model.menu;
import java.sql.SQLException;
import dapur.model.paket;
import dapur.model.paketStatic;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Farhansw
 */
public class window_pilih_paket extends javax.swing.JFrame {
paket paketGlobal;
    /**
     * Creates new form window_pilih_paket
     */
    public window_pilih_paket() {
        initComponents();
    }
    public void showMessage(String message, int type){
        if (type == 1){
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbP1 = new javax.swing.JRadioButton();
        rbP2 = new javax.swing.JRadioButton();
        rbP3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btSimpan = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dapur Bu Yoyok");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Paket Menu Andalan Dapur Bu Yoyok");

        rbP1.setText("Paket Tumpeng");

        rbP2.setText("Paket Gudeg Yogya");

        rbP3.setText("Paket Nasi Kotak");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("HARGA PAKET\nRp. 75.000\n\n1. Gudeg Resep \n   Asli Yogya\n2. Ayam Kuah Pedas\n3. Kerupuk Udang\n4. Krecek Santan");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("HARGA PAKET\nRp. 25.000\n\n1. Ayam / Bebek/ \n  Rendang\n2. Kentang Balado\n3. Sambal Hijau/Merah\n4. Kerupuk Udang\n5. Sayur Papaya");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("HARGA PAKET\nRp. 50.000\n1. Nasi Kuning\n\n2. Perkedel 10 pcs\n\n3. Ayam potong / \n  kampung \n ( bisa milih \n   bakar \n   atau goreng)\n\n4.Kwitiau Goreng\n\n5. Telor Asin");
        jScrollPane1.setViewportView(jTextArea1);

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(rbP1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbP3)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSimpan)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btCancel)
                                .addGap(71, 71, 71))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbP1)
                    .addComponent(rbP2)
                    .addComponent(rbP3))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSimpan)
                            .addComponent(btCancel))
                        .addGap(197, 197, 197))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        if (rbP1.isSelected()){
            try{
                Connection conn = ConnectionHelper.getConnection();
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM paket_andalan WHERE id_paket = 1";
                ResultSet rs = st.executeQuery(sql);

                if(rs.next()){
                    paketStatic.setId_paket(rs.getInt("id_paket"));
                    paketStatic.setNama_paket(rs.getString("nama_paket")); 
                    paketStatic.setHarga_paket(rs.getString("harga_paket"));
                    JOptionPane.showMessageDialog(null, "Paket dipilih");
                    dispose();
                    new mainwindow().setVisible(true);
                }
            }catch(SQLException e){
                Logger.getLogger(window_pilih_paket.class.getName()).log(Level.SEVERE, null, e);
            }
        }else if(rbP2.isSelected()){
            try{
                Connection conn = ConnectionHelper.getConnection();
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM paket_andalan WHERE id_paket = 2";
                ResultSet rs = st.executeQuery(sql);

                if(rs.next()){
                    paketStatic.setId_paket(rs.getInt("id_paket"));
                    paketStatic.setNama_paket(rs.getString("nama_paket")); 
                    paketStatic.setHarga_paket(rs.getString("harga_paket"));
                    JOptionPane.showMessageDialog(null, "Paket dipilih");
                    dispose();
                    new mainwindow().setVisible(true);
                }
                   
                
            }catch(SQLException e){
                Logger.getLogger(window_pilih_paket.class.getName()).log(Level.SEVERE, null, e);
            }
        }else if(rbP3.isSelected()){
            try{
                Connection conn = ConnectionHelper.getConnection();
                Statement st = conn.createStatement();
                String sql = "SELECT * FROM paket_andalan WHERE id_paket = 3";
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()){
                    paketStatic.setId_paket(rs.getInt("id_paket"));
                    paketStatic.setNama_paket(rs.getString("nama_paket")); 
                    paketStatic.setHarga_paket(rs.getString("harga_paket"));
                    JOptionPane.showMessageDialog(null, "Paket dipilih");
                    dispose();
                    new mainwindow().setVisible(true);
                }
            }catch(SQLException e){
                Logger.getLogger(window_pilih_paket.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(window_pilih_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window_pilih_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window_pilih_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window_pilih_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window_pilih_paket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JRadioButton rbP1;
    private javax.swing.JRadioButton rbP2;
    private javax.swing.JRadioButton rbP3;
    // End of variables declaration//GEN-END:variables
}