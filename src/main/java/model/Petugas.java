/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Petugas {
   private int idPetugas;
    private String namaPetugas;
    private String username;
    private String password;
    private String shift;

    public Petugas(int idPetugas, String namaPetugas, String username,
                   String password, String shift) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.username = username;
        this.password = password;
        this.shift = shift;
    }
    public int getIdPetugas() {
        return idPetugas;
    }
    public String getNamaPetugas() {
        return namaPetugas;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getShift() {
        return shift;
    }
    public void tampilkanInfo() {
        System.out.println("ID Petugas   : " + idPetugas);
        System.out.println("Nama Petugas : " + namaPetugas);
        System.out.println("Username     : " + username);
        System.out.println("Shift        : " + shift);
    }
}