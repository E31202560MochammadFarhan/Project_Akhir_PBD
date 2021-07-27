/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.helper;
import dapur.model.menu;
import java.util.*;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Farhansw
 */
public class MenuManager {
    /**
    public static void tambahMenu(menu menu) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into akun_customer (id_akun ,username, "
            + "password, email, nama_customer, alamat_customer, gender, no_hp) values (?, ?, ?, ?, ?, ?, ?, ?)");
        pstmn.setInt(1, akun.getId_akun());
        pstmn.setString(2, akun.getUsername());
        pstmn.setString(3, akun.getPassword());
        pstmn.setString(4, akun.getEmail());
   f     pstmn.setString(5, akun.getNama_customer());
        pstmn.setString(6, akun.getAlamat_customer());
        pstmn.setString(7, akun.getGender());
        pstmn.setString(8, akun.getNo_telp());
        pstmn.execute();
    }**/
}
