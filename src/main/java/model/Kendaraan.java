/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private int idKendaraan;
    private String nomorPlat;
    private String jenisKendaraan;
    private String merk;
    private String warna;

    public Kendaraan(int idKendaraan, String nomorPlat, String jenisKendaraan,
                     String merk, String warna) {
        this.idKendaraan = idKendaraan;
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
        this.warna = warna;
    }
    public int getIdKendaraan() {
        return idKendaraan;
    }
    public String getNomorPlat() {
        return nomorPlat;
    }
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    public String getMerk() {
        return merk;
    }
    public String getWarna() {
        return warna;
    }
    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void tampilkanInfo() {
        System.out.println("ID Kendaraan : " + idKendaraan);
        System.out.println("Nomor Plat   : " + nomorPlat);
        System.out.println("Jenis        : " + jenisKendaraan);
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
    }
}
