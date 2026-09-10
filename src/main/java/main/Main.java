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
    // Validasi Input
    public static int inputIntPositif(Scanner input, String pesan) { 
        int angka;
        while (true) { 
            System.out.print(pesan);
            if (input.hasNextInt()) { 
                angka = input.nextInt();
                input.nextLine();
                
            if (angka > 0) { 
                return angka;
            } else { 
                System.out.println("Input harus lebih dari 0!");
            }
        } else { 
                System.out.println("Input harus berupa angka!");
                input.nextLine();
            }
        } 
    }
    public static String inputTidakKosong(Scanner input, String pesan) { 
        String data;
        while (true) { 
            System.out.print(pesan);
            data = input.nextLine().trim(); 
            
            if (!data.isEmpty()) { 
                return data;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }
    public static String inputJenisKendaraan(Scanner input) { 
        while (true) {
           String jenis = inputTidakKosong( 
                   input, 
                   "Jenis Kendaraan (Motor/Mobil): " 
           ); 
           if (jenis.equalsIgnoreCase("Motor")) { 
               return "Motor";
           }  
           if (jenis.equalsIgnoreCase("Mobil")) { 
               return "Mobil";
           }
            System.out.println("Jenis kendaraan hanya Motor atau Mobil!");
        }
    }
    public static String inputJenisSlot(Scanner input) { 
        while (true) { 
            String jenis = inputTidakKosong( 
                    input, 
                    "Jenis Slot (Motor/Mobil): " 
            );
            if (jenis.equalsIgnoreCase("Motor")) { 
                return "Motor";
            }
            if (jenis.equalsIgnoreCase("Mobil")) { 
                return "Mobil"; 
            }
            System.out.println("Jenis slot hanya Motor atau Mobil!");
        }
    }
    public static String inputMetodePembayaran(Scanner input) { 
        while (true) { 
            String metode = inputTidakKosong( 
                    input, 
                    "Metode Pembayaran (Cash/QRIS): " 
            );
            if (metode.equalsIgnoreCase("Cash")) { 
                return "Cash"; 
            }
            if (metode.equalsIgnoreCase("QRIS")) { 
                return "QRIS"; 
            }
            System.out.println("Metode pembayaran hanya Cash atau QRIS!");
        }
    }
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
                    int id = inputIntPositif( 
                            input, 
                            "ID Kendaraan: " 
                    );
                    String plat = inputTidakKosong( 
                            input, "Nomor Plat: " 
                    );
                    String jenis = inputJenisKendaraan(input); 
                    String merk = inputTidakKosong( 
                            input, 
                            "Merk: " 
                    );
                    String warna = inputTidakKosong( 
                            input, 
                            "Warna: " 
                    );
                    Kendaraan kendaraan = new Kendaraan( 
                            id, 
                            plat, 
                            jenis, 
                            merk, 
                            warna 
                    );
                    service.tambahKendaraan(kendaraan);
                }
                // Tambah Petugas
                case 2 -> {
                    int id = inputIntPositif( 
                            input, 
                            "ID Petugas: " 
                    ); 
                    String nama = inputTidakKosong( 
                            input, 
                            "Nama Petugas: " 
                    ); 
                    String username = inputTidakKosong( 
                            input, 
                            "Username: " 
                    ); 
                    String password = inputTidakKosong( 
                            input, 
                            "Password: " 
                    );
                    String shift = inputTidakKosong( 
                            input, 
                            "Shift: " 
                    ); 
                    Petugas petugas = new Petugas( 
                            id, 
                            nama, 
                            username, 
                            password, 
                            shift 
                    );
                    service.tambahPetugas(petugas);
                }
                // Tambah Slot
                case 3 -> {
                    int id = inputIntPositif( 
                            input, 
                            "ID Slot: " 
                    ); 
                    String nomor = inputTidakKosong( 
                            input, 
                            "Nomor Slot: " 
                    );
                    String jenis = inputJenisSlot(input); 
                    SlotParkir slot = new SlotParkir( 
                            id, 
                            nomor, 
                            jenis, 
                            "Kosong" 
                    );
                    service.tambahSlot(slot);
                }
                // TAMBAH PARKIR
                case 4 -> {
                    int idParkir = inputIntPositif( 
                            input, 
                            "ID Parkir: " 
                    ); 
                // Cek ID parkir 
                if (service.cariById(idParkir) != null) { 
                    System.out.println( 
                            "ID Parkir sudah digunakan!" 
                    ); 
                    break; 
                } 
                int idKendaraan = inputIntPositif( 
                        input, 
                        "ID Kendaraan: " 
                );
                int idPetugas = inputIntPositif( 
                        input, 
                        "ID Petugas: " 
                ); 
                int idSlot = inputIntPositif( 
                        input, 
                        "ID Slot: " 
                ); 
                String waktuMasuk = inputTidakKosong( 
                        input, 
                        "Waktu Masuk: " 
                ); 
                Kendaraan kendaraan =
                    service.cariKendaraan(idKendaraan);
                Petugas petugas =
                    service.cariPetugas(idPetugas);
                SlotParkir slot =
                    service.cariSlot(idSlot);
                //Validasi
                    if (kendaraan == null) {
                        System.out.println("Kendaraan tidak ditemukan!");
                    } else if (petugas == null) {
                        System.out.println("Petugas tidak ditemukan!");
                    } else if (slot == null) {
                        System.out.println("Slot tidak ditemukan!");
                    } else if (!slot.getStatusSlot()
                                .equalsIgnoreCase("Kosong")) {
                        System.out.println("Slot sedang terisi!");
                    } else if ( !slot.getJenisSlot() 
                            .equalsIgnoreCase( 
                                kendaraan.getJenisKendaraan() 
                            ) 
                    ) {
                        System.out.println( 
                                "Jenis kendaraan tidak sesuai " 
                                        + "dengan jenis slot!" 
                        );
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