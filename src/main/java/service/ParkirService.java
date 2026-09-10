/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ParkirService {
    private ArrayList<Kendaraan> daftarKendaraan;
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<SlotParkir> daftarSlot;
    private ArrayList<Parkir> daftarParkir;

    public ParkirService() {
        daftarKendaraan = new ArrayList<>();
        daftarPetugas = new ArrayList<>();
        daftarSlot = new ArrayList<>();
        daftarParkir = new ArrayList<>();
    }

    // Kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
        System.out.println("Data kendaraan berhasil ditambahkan!");
    }
    public Kendaraan cariKendaraan(int id) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getIdKendaraan() == id) {
                return k;
            }
        }
        return null;
    }
    
    // Petugas
    public void tambahPetugas(Petugas petugas) {
        daftarPetugas.add(petugas);
        System.out.println("Data petugas berhasil ditambahkan!");
    }
    public Petugas cariPetugas(int id) {
        for (Petugas p : daftarPetugas) {
            if (p.getIdPetugas() == id) {
                return p;
            }
        }
        return null;
    }

    // Slot
    public void tambahSlot(SlotParkir slot) {
        daftarSlot.add(slot);
        System.out.println("Data slot berhasil ditambahkan!");
    }
    public SlotParkir cariSlot(int id) {
        for (SlotParkir s : daftarSlot) {
            if (s.getIdSlot() == id) {
                return s;
            }
        }
        return null;
    }
    
    // Parkir
    public void tambahParkir(Parkir parkir) {
        daftarParkir.add(parkir);
        parkir.getSlot().setStatusSlot("Terisi");
        System.out.println("Data parkir berhasil ditambahkan!");
    }
    public List<Parkir> getAll() {
        return daftarParkir;
    }
    public Parkir cariById(int id) {
        for (Parkir p : daftarParkir) {
            if (p.getIdParkir() == id) {
                return p;
            }
        }
        return null;
    }
public void updateParkir(int id, String waktuKeluar,
                             int lamaParkir, String metodePembayaran) {

        Parkir parkir = cariById(id);
        if (parkir != null) {
            double total = parkir.hitungTarif(lamaParkir);
            parkir.setWaktuKeluar(waktuKeluar);
            parkir.setStatusParkir("Selesai");
            parkir.setJumlahBayar(total);
            parkir.setMetodePembayaran(metodePembayaran);
            parkir.setStatusPembayaran("Lunas");
 System.out.println("Data parkir berhasil diupdate!");
            System.out.println("Total pembayaran: Rp" + total);
        } else {
            System.out.println("Data parkir tidak ditemukan!");
        }
    }
public void hapusParkir(int id) {
        Parkir parkir = cariById(id);

        if (parkir != null) {
            parkir.getSlot().setStatusSlot("Kosong");
            daftarParkir.remove(parkir);
            System.out.println("Data parkir berhasil dihapus!");
        } else {
            System.out.println("Data parkir tidak ditemukan!");
        }
    }
}
