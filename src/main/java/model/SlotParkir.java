/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class SlotParkir {
    private int idSlot;
    private String nomorSlot;
    private String jenisSlot;
    private String statusSlot;

    public SlotParkir(int idSlot, String nomorSlot,
                      String jenisSlot, String statusSlot) {
        this.idSlot = idSlot;
        this.nomorSlot = nomorSlot;
        this.jenisSlot = jenisSlot;
        this.statusSlot = statusSlot;
    }
    public int getIdSlot() {
        return idSlot;
    }
    public String getNomorSlot() {
        return nomorSlot;
    }
    public String getJenisSlot() {
        return jenisSlot;
    }
    public String getStatusSlot() {
        return statusSlot;
    }
    public void setStatusSlot(String statusSlot) {
        this.statusSlot = statusSlot;
    }
    public void tampilkanInfo() {
        System.out.println("ID Slot      : " + idSlot);
        System.out.println("Nomor Slot   : " + nomorSlot);
        System.out.println("Jenis Slot   : " + jenisSlot);
        System.out.println("Status Slot  : " + statusSlot);
    }
}
