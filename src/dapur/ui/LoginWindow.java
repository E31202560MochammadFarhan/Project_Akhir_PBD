/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dapur.ui;

import dapur.helper.ConnectionHelper;
import java.sql.*;
import javax.swing.JOptionPane;
import static dapur.helper.ConnectionHelper.getConnection;
import dapur.model.AkunStatic;
/**
 *
 * @author Farhansw
 */
public class LoginWindow extends javax.swing.JFrame {

    /** Creates new form LoginWindow */
    public LoginWindow() {
        initComponents();
        setLocationRelativeTo(null);    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        btSignup = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dapur Bu Yoyok");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Selamat Datang Silahkan Login");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btSignup.setText("SignUp");
        btSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsername)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btLogin)
                                .addGap(32, 32, 32)
                                .addComponent(btSignup)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pfPassword))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogin)
                    .addComponent(btSignup))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
//        try{
//            Connection k = getConnection();
//            Statement s = k.createStatement();
//            ResultSet r = s.executeQuery("select * from akun_customer where username='"+tfUsername.getText()+"'");
//            if(r.next()){
//                if(tfPassword.getText().equals(r.getString("password"))){
//                    JOptionPane.showMessageDialog(null, "Login Berhasil");
//                    this.dispose();
//                    //new MainWindow().setVisible(true);
//                }else{
//                    JOptionPane.showMessageDialog(null, "Username dan Password salah");
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "Username dan Password tidak tersedia silahkan daftar terlebih dahulu!");
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "terjadi kesalahan");
//        }

        String username=tfUsername.getText();
        String password=String.valueOf(pfPassword.getPassword());
        //Akun ak = new Akun();
        
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Username tidak boleh kosong");
            tfUsername.requestFocus();
        }else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Password tidak boleh kosong");
        } 
        try{
            Connection conn=ConnectionHelper.getConnection();
            Statement st=conn.createStatement();
            String sql= "SELECT * FROM akun_customer WHERE username='"+username+"'"; //AND password='"+password+"'";                
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                if(password.equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    AkunStatic.setNama_customer(rs.getString("nama_customer"));
                    AkunStatic.setId_akun(rs.getInt("id_akun"));
                    AkunStatic.setUsername(rs.getString("username"));
                    AkunStatic.setPassword(rs.getString("password"));
                    AkunStatic.setAlamat_customer(rs.getString("alamat_customer"));
                    AkunStatic.setNo_telp(rs.getString("no_hp"));
                    AkunStatic.setGender(rs.getString("gender"));
                    new mainwindow().setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Username dan Password salah","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Username dan Password tidak tersedia silahkan daftar terlebih dahulu!","Error",JOptionPane.ERROR_MESSAGE);
            }        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Login gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignupActionPerformed
        // TODO add your handling code here:
        new SignupWindow().setVisible(true);
    }//GEN-LAST:event_btSignupActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}
