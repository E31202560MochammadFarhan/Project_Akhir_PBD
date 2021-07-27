/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapur.model;

/**
 *
 * @author Farhansw
 */
public class AkunStatic {
    private static int id_akun;
    private static String username;
    private static String password;
    private static String email;
    private static String nama_customer;
    private static String alamat_customer;
    private static String gender;
    private static String no_telp;

    public static int getId_akun() {
        return id_akun;
    }

    public static void setId_akun(int id_akun) {
        AkunStatic.id_akun = id_akun;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AkunStatic.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AkunStatic.password = password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        AkunStatic.email = email;
    }

    public static String getNama_customer() {
        return nama_customer;
    }

    public static void setNama_customer(String nama_customer) {
        AkunStatic.nama_customer = nama_customer;
    }

    public static String getAlamat_customer() {
        return alamat_customer;
    }

    public static void setAlamat_customer(String alamat_customer) {
        AkunStatic.alamat_customer = alamat_customer;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        AkunStatic.gender = gender;
    }

    public static String getNo_telp() {
        return no_telp;
    }

    public static void setNo_telp(String no_telp) {
        AkunStatic.no_telp = no_telp;
    }

    
}
