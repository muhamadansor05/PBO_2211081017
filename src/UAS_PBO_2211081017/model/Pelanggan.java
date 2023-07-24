/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.model;

/**
 *
 * @author acer
 */
public class Pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String noHP;
    private String jenisPelanggan;
    public Pelanggan() {
}

    public Pelanggan(String kodepelanggan, String namapelanggan, String noHP, String jenispelanggan) {
        this.kodePelanggan = kodepelanggan;
        this.namaPelanggan = namapelanggan;
        this.noHP = noHP;
        this.jenisPelanggan = jenispelanggan;
    } 

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }
    }