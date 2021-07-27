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
public class pemesananStatic {
    private static int id_pemesanan;
    private static int id_paket;
    private static int id_menu;
    private static int id_akun;
    private static int jumlah;
    private static int total_harga;

    public static int getJumlah() {
        return jumlah;
    }

    public static void setJumlah(int jumlah) {
        pemesananStatic.jumlah = jumlah;
    }

    public static int getTotal_harga() {
        return total_harga;
    }

    public static void setTotal_harga(int total_harga) {
        pemesananStatic.total_harga = total_harga;
    }

    public static int getId_pemesanan() {
        return id_pemesanan;
    }

    public static void setId_pemesanan(int id_pemesanan) {
        pemesananStatic.id_pemesanan = id_pemesanan;
    }

    public static int getId_paket() {
        return id_paket;
    }

    public static void setId_paket(int id_paket) {
        pemesananStatic.id_paket = id_paket;
    }

    public static int getId_menu() {
        return id_menu;
    }

    public static void setId_menu(int id_menu) {
        pemesananStatic.id_menu = id_menu;
    }

    public static int getId_akun() {
        return id_akun;
    }

    public static void setId_akun(int id_akun) {
        pemesananStatic.id_akun = id_akun;
    }

  
   
}
