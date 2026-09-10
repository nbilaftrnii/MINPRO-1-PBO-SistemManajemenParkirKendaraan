/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.*;
import service.ParkirService;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParkirService service = new ParkirService();

        int pilihan;
         do {
            System.out.println();
            System.out.println();
            System.out.println("|===================================================|");
            System.out.println("|                                                   |");
            System.out.println("|                🚗  MY PARKIR GW 🚗                 |");
            System.out.println("|         SISTEM MANAJEMEN PARKIR KENDARAAN         |");
            System.out.println("|                                                   |");
            System.out.println("|           ───────  Smart Parking  ───────           |");
            System.out.println("|                                                   |");
            System.out.println("|===================================================|");
            System.out.println("------------------- MENU UTAMA ----------------------");
            System.out.println("|                                                   |");
            System.out.println("|   [1]  Tambah Kendaraan                           |");
            System.out.println("|   [2]  Tambah Petugas                             |");
            System.out.println("|   [3]  Tambah Slot Parkir                         |");
            System.out.println("|   [4]  Tambah Data Parkir                         |");
            System.out.println("|   [5]  Lihat Data Parkir                          |");
            System.out.println("|   [6]  Update Data Parkir                         |");
            System.out.println("|   [7]  Hapus Data Parkir                          |");
            System.out.println("|   [8]  Cari Data Parkir                           |");
            System.out.println("|   [9]  Keluar                                     |");
            System.out.println("|                                                   |");
            System.out.println("-----------------------------------------------------");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                // Tambah Kendaraan
                case 1 -> {
                    System.out.print("ID Kendaraan: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Nomor Plat: ");
                    String plat = input.nextLine();
                    System.out.print("Jenis Kendaraan (Motor/Mobil): ");
                    String jenis = input.nextLine();
                    System.out.print("Merk: ");
                    String merk = input.nextLine();
                    System.out.print("Warna: ");
                    String warna = input.nextLine();
                    Kendaraan kendaraan =
                            new Kendaraan(id, plat, jenis, merk, warna);
                    service.tambahKendaraan(kendaraan);
                }
                // Tambah Petugas
                case 2 -> {
                    System.out.print("ID Petugas: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Petugas: ");
                    String nama = input.nextLine();
                    System.out.print("Username: ");
                    String username = input.nextLine();
                    System.out.print("Password: ");
                    String password = input.nextLine();
                    System.out.print("Shift: ");
                    String shift = input.nextLine();
                    Petugas petugas =
                            new Petugas(id, nama, username, password, shift);
                    service.tambahPetugas(petugas);
                }
                // Tambah Slot
                case 3 -> {
                    System.out.print("ID Slot: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Nomor Slot: ");
                    String nomor = input.nextLine();
                    System.out.print("Jenis Slot (Motor/Mobil): ");
                    String jenis = input.nextLine();
                    SlotParkir slot =
                            new SlotParkir(id, nomor, jenis, "Kosong");
                    service.tambahSlot(slot);
                }
                // TAMBAH PARKIR
                case 4 -> {
                    System.out.print("ID Parkir: ");
                    int idParkir = input.nextInt();
                    System.out.print("ID Kendaraan: ");
                    int idKendaraan = input.nextInt();
                    System.out.print("ID Petugas: ");
                    int idPetugas = input.nextInt();
                    System.out.print("ID Slot: ");
                    int idSlot = input.nextInt();
                    input.nextLine();
                    System.out.print("Waktu Masuk: ");
                    String waktuMasuk = input.nextLine();
                    Kendaraan kendaraan =
                            service.cariKendaraan(idKendaraan);
                    Petugas petugas =
                            service.cariPetugas(idPetugas);
                    SlotParkir slot =
                            service.cariSlot(idSlot);
                    if (kendaraan == null) {
                        System.out.println("Kendaraan tidak ditemukan!");
                    } else if (petugas == null) {
                        System.out.println("Petugas tidak ditemukan!");
                    } else if (slot == null) {
                        System.out.println("Slot tidak ditemukan!");
                    } else if (!slot.getStatusSlot().equalsIgnoreCase("Kosong")) {
                        System.out.println("Slot sedang terisi!");
                    } else {
                        Parkir parkir = new Parkir(
                                idParkir,
                                kendaraan,
                                petugas,
                                slot,
                                waktuMasuk
                        );
                        service.tambahParkir(parkir);
                    }
                }
                // Lihat Parkir
                case 5 -> {
                    List<Parkir> list = service.getAll();
                    if (list.isEmpty()) {
                        System.out.println("Belum ada data parkir!");
                    } else {
                        System.out.println();
                        System.out.println("========== DATA PARKIR ==========");
                        for (Parkir p : list) {
                            p.tampilkanInfo();
                        }
                    }
                }
                // Update Parkir
                case 6 -> {
                    System.out.print("ID Parkir yang ingin diupdate: ");
                    int id = input.nextInt();
                    input.nextLine();
                    Parkir parkir = service.cariById(id);
                    if (parkir == null) {
                        System.out.println("Data parkir tidak ditemukan!");
                    } else {
                        System.out.print("Waktu Keluar: ");
                        String waktuKeluar = input.nextLine();
                        System.out.print("Lama Parkir (jam): ");
                        int lamaParkir = input.nextInt();
                        input.nextLine();
                        System.out.print("Metode Pembayaran (Cash/QRIS): ");
                        String metode = input.nextLine();
                        service.updateParkir(
                                id,
                                waktuKeluar,
                                lamaParkir,
                                metode
                                );
                         parkir.tampilkanInfo();
                    }
                }
                // Hapus Parkir
                case 7 -> {
                    System.out.print("ID Parkir yang ingin dihapus: ");
                    int id = input.nextInt();
                    input.nextLine();
                    service.hapusParkir(id);
                }
                // Cari Parkir
                                case 8 -> {
                    System.out.print("Masukkan ID Parkir: ");
                    int id = input.nextInt();
                    input.nextLine();
                    Parkir hasil = service.cariById(id);

                    if (hasil != null) {
                        hasil.tampilkanInfo();
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                }
                // Keluar
                case 9 -> {
                    System.out.println("Terima kasih!");
                }
                default -> {
                    System.out.println("Pilihan tidak valid!");
                }
            }
        } while (pilihan != 9);
        input.close();
    }
}