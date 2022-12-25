/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class Pegawai {
    private int id;
    private String nama;
    private String posisi;
    private Date tglLahir;

    public Pegawai(int id, String nama, String posisi, Date tglLahir) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.tglLahir = tglLahir;
    }
    
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
    
}
