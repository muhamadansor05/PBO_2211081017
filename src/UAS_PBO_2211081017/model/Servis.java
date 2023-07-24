/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.model;

/**
 *
 * @author acer
 */
public class Servis {
    private String nomorTrans;
    private String tglServis;
    private String kodePelanggan;
    private String perbaikan;
    private double biayaPerbaikan;
    private double Diskon;
    private double total;
    
    public Servis() {
}

    public Servis(String nomorTrans, String tglServis, String kodePelanggan, String perbaikan, double biayaPerbaikan, double Diskon, double total) {
        this.nomorTrans = nomorTrans;
        this.tglServis = tglServis;
        this.kodePelanggan = kodePelanggan;
        this.perbaikan = perbaikan;
        this.biayaPerbaikan = biayaPerbaikan;
        this.Diskon = Diskon;
        this.total = total;
}

    public String getNomorTrans() {
        return nomorTrans;
    }

    public void setNomorTrans(String nomorTrans) {
        this.nomorTrans = nomorTrans;
    }

    public String getTglServis() {
        return tglServis;
    }

    public void setTglServis(String tglServis) {
        this.tglServis = tglServis;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getPerbaikan() {
        return perbaikan;
    }

    public void setPerbaikan(String perbaikan) {
        this.perbaikan = perbaikan;
    }

    public double getBiayaPerbaikan() {
        return biayaPerbaikan;
    }

    public void setBiayaPerbaikan(double biayaPerbaikan) {
        this.biayaPerbaikan = biayaPerbaikan;
    }

    public double getDiskon() {
        return Diskon;
    }

    public void setDiskon(double Diskon) {
        this.Diskon = Diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}