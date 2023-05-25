/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor060523.model;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Gaji {
    private int bulan;
    private int tahun;
    private String nip;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
    private double totalGaji;

    public Gaji(int bulan, int tahun, String nip, double gajiPokok, double tunjanganAnak, double tunjanganIstri) {
        this.bulan = bulan;
        this.tahun = tahun;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
        this.tunjanganIstri = tunjanganIstri;
        this.totalGaji = gajiPokok + tunjanganAnak + tunjanganIstri;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public String getNip() {
        return nip;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double getTunjanganIstri() {
        return tunjanganIstri;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public void setTunjanganIstri(double tunjanganIstri) {
        this.tunjanganIstri = tunjanganIstri;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
} 