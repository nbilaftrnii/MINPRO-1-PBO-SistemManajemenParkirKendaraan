/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Parkir {
    private int idParkir;
    private Kendaraan kendaraan;
    private Petugas petugas;
    private SlotParkir slot;
    private String waktuMasuk;
    private String waktuKeluar;
    private String statusParkir;
    private String metodePembayaran;
    private double jumlahBayar;
    private String statusPembayaran;
    
    public Parkir(int idParkir, Kendaraan kendaraan, Petugas petugas,
                  SlotParkir slot, String waktuMasuk) {
        this.idParkir = idParkir;
        this.kendaraan = kendaraan;
        this.petugas = petugas;
        this.slot = slot;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = "-";
        this.statusParkir = "Masih Parkir";
        this.metodePembayaran = "-";
        this.jumlahBayar = 0;
        this.statusPembayaran = "Belum Bayar";
    }
    public int getIdParkir() {
        return idParkir;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    public Petugas getPetugas() {
        return petugas;
    }
    public SlotParkir getSlot() {
        return slot;
    }
    public String getWaktuMasuk() {
        return waktuMasuk;
    }
    public String getWaktuKeluar() {
        return waktuKeluar;
    }
    public String getStatusParkir() {
        return statusParkir;
    }
    public String getMetodePembayaran() {
        return metodePembayaran;
    }
    public double getJumlahBayar() {
        return jumlahBayar;
    }
    public String getStatusPembayaran() {
        return statusPembayaran;
    }
    public void setWaktuKeluar(String waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }
    public void setStatusParkir(String statusParkir) {
        this.statusParkir = statusParkir;
    }
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }
    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    
    // Logika tarif parkir
    public double hitungTarif(int lamaParkir) {
        double tarifPerJam;
        if (kendaraan.getJenisKendaraan().equalsIgnoreCase("Motor")) {
            tarifPerJam = 2000;
        } else if (kendaraan.getJenisKendaraan().equalsIgnoreCase("Mobil")) {
            tarifPerJam = 5000;
        } else {
            tarifPerJam = 3000;
        }
        
        double total = tarifPerJam * lamaParkir;

        // Tarif maksimal
        if (kendaraan.getJenisKendaraan().equalsIgnoreCase("Motor")
                && total > 20000) {
            total = 20000;
        } else if (kendaraan.getJenisKendaraan().equalsIgnoreCase("Mobil")
                && total > 50000) {
            total = 50000;
        }
        return total;
    }
    public void tampilkanInfo() {
    System.out.println();
    System.out.println("========================================");
    System.out.println("           🚗 MY PARKIR GW 🚗");
    System.out.println("           - RECEIPT PARKIR -");
    System.out.println("========================================");
    System.out.println("ID Parkir        : " + idParkir);
    System.out.println("Nomor Plat       : " + kendaraan.getNomorPlat());
    System.out.println("Jenis Kendaraan  : " + kendaraan.getJenisKendaraan());
    System.out.println("Slot             : " + slot.getNomorSlot());
    System.out.println("Petugas          : " + petugas.getNamaPetugas());
    System.out.println("----------------------------------------");
    System.out.println("Waktu Masuk      : " + waktuMasuk);
    System.out.println("Waktu Keluar     : " + waktuKeluar);
    System.out.println("Jumlah Bayar     : Rp" + jumlahBayar);
    System.out.println("Metode Pembayaran: " + metodePembayaran);
    System.out.println("Status Pembayaran: " + statusPembayaran);
    System.out.println("========================================");
    System.out.println("           TERIMA KASIH");
    System.out.println("        HATI-HATI DI JALAN!");
    System.out.println("========================================");
    }
}

