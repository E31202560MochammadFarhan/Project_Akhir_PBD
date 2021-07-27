/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.helper;

import dapur.model.pemesanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Farhansw
 */
public class pemesanan_manajer {
public static void tambahPemesanan(pemesanan pemesanan) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into pemesanan (id_pemesanan ,id_paket, id_menu,id_akun)) values (?, ?, ?, ?");
        pstmn.setInt(1, pemesanan.getId_pemesanan());
        pstmn.setInt(2, pemesanan.getId_paket());
        pstmn.setInt(3, pemesanan.getId_menu());
        pstmn.setInt(4, pemesanan.getId_akun());
        
        pstmn.execute();
    }   


}
