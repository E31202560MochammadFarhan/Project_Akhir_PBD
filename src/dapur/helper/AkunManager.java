/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.helper;
import java.util.*;
import java.sql.*;
import java.util.logging.*;
import dapur.model.Akun;
/**
 *
 * @author Farhansw
 */
public class AkunManager {
    public static List<Akun> showAllAkun(){
        List<Akun> akunList = new ArrayList<>();
        try{
            Connection conn = ConnectionHelper.getConnection();
            Statement stmn = conn.createStatement();
            ResultSet rs = stmn.executeQuery("Select * from buku");
            while (rs.next()){
                Akun akun = new Akun();
                akun.setId_akun(Integer.parseInt(rs.getString("id_akun")));
                akun.setUsername(rs.getString("username"));
                akun.setPassword(rs.getString("password"));
                akun.setEmail(rs.getString("email"));
                akun.setNama_customer(rs.getString("nama_customer"));
                akun.setAlamat_customer(rs.getString("alamat_customer"));
                akun.setGender(rs.getString("gender"));
                akun.setNo_telp(rs.getString("no_hp"));
                
                akunList.add(akun);
            }
        } catch (SQLException ex){
            Logger.getLogger(ConnectionCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
        return akunList;
    }
    
    public static Akun showAkun(int id) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        Akun akun = new Akun();
        
        PreparedStatement pstmn = conn.prepareStatement("Select * from buku where id_akun = ?");
        pstmn.setInt(1, id);
        ResultSet rs = pstmn.executeQuery();
        
        while (rs.next()) {
            akun.setId_akun(Integer.parseInt(rs.getString("id_buku")));
            akun.setUsername(rs.getString("username"));
            akun.setPassword(rs.getString("password"));
            akun.setEmail(rs.getString("email"));
            akun.setNama_customer(rs.getString("nama_customer"));
            akun.setAlamat_customer(rs.getString("alamat_customer"));
            akun.setGender(rs.getString("gender"));
            akun.setNo_telp(rs.getString("no_hp"));
        }
        return akun;
    }
    
    public static void tambahAkun(Akun akun) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("insert into akun_customer (id_akun ,username, "
            + "password, email, nama_customer, alamat_customer, gender, no_hp) values (?, ?, ?, ?, ?, ?, ?, ?)");
        pstmn.setInt(1, akun.getId_akun());
        pstmn.setString(2, akun.getUsername());
        pstmn.setString(3, akun.getPassword());
        pstmn.setString(4, akun.getEmail());
        pstmn.setString(5, akun.getNama_customer());
        pstmn.setString(6, akun.getAlamat_customer());
        pstmn.setString(7, akun.getGender());
        pstmn.setString(8, akun.getNo_telp());
        pstmn.execute();
    }
    
    public static void updateAkun(Akun akun) throws SQLException{
        Connection conn = ConnectionHelper.getConnection();
        PreparedStatement pstmn = conn.prepareStatement("UPDATE buku SET username =?, "
            + "password = ?, email = ?, nama_customer = ?, alamat_customer = ?, gender = ?, no_hp = ?");
        pstmn.setString(1, akun.getUsername());
        pstmn.setString(2, akun.getPassword());
        pstmn.setString(3, akun.getEmail());
        pstmn.setString(4, akun.getNama_customer());
        pstmn.setString(5, akun.getAlamat_customer());
        pstmn.setString(6, akun.getGender());
        pstmn.setString(7, akun.getNo_telp());
        pstmn.execute();
    }
}
