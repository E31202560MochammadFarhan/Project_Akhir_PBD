/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.helper;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Farhansw
 */
public class ConnectionCheck {
    public static void main(String[] args) {
        isConnected();
        tampilPaket();
    }
    
    private static boolean isConnected(){
        try{
            ConnectionHelper.getConnection();
            System.out.println("Database Terhubung!");
            return true;
        }catch (SQLException ex){
            Logger.getLogger(ConnectionCheck.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Tidak dapat terhubung ke database!");
            return false;
        }
    }
    
    public static void tampilPaket(){
        try{
            Connection conn = ConnectionHelper.getConnection();
            Statement stmn = conn.createStatement();
            ResultSet rs = stmn.executeQuery("Select * from paket_internet");
            
            while (rs.next()){
                System.out.println("ID Paket: "+rs.getString("id_paket")+", Nama Paket: "+rs.getString("nama_paket")
                    +", Harga Paket: "+rs.getString("harga_paket")+", Speed Paket: "+rs.getString("speed_paket"));
            }
        }catch (SQLException ex){
            Logger.getLogger(ConnectionCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
