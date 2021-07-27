/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.helper;

import dapur.model.pembayaran;
import dapur.model.pemesananStatic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Farhansw
 */
public class pembayaran_manajer {
public static void tambahPembayaran(pembayaran pembayaran) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into pembayaran (id_pembayaran ,id_pemesanan, "
                + "jenis_pembayaran, jenis_nontunai, total, bayar, kembalian) values (?, ?, ?, ?, ?, ?, ?)");
        pstmn.setInt(1, pembayaran.getId_pembayaran());
        pstmn.setInt(2, pemesananStatic.getId_pemesanan());
        pstmn.setString(3, pembayaran.getJenis_pembayaran());
        pstmn.setString(4, pembayaran.getJenis_nontunai());
        pstmn.setInt(5, pembayaran.getTotal());
        pstmn.setInt(6, pembayaran.getBayar());
        pstmn.setInt(7, pembayaran.getKembalian());
        pstmn.execute();
    }    
}
