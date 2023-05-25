/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.controller;
import UTS_A.model.Pelanggan;
/**
 *
 * @author acer
 */

public class WarnetController {
    private Pelanggan pelanggan;
    private String tglMasuk;
    private int jamMasuk;
    private int jamKeluar;
    private int tarif;

    public WarnetController(Pelanggan pelanggan, String tglMasuk, int jamMasuk, int jamKeluar) {
        this.pelanggan = pelanggan;
        this.tglMasuk = tglMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = 10000;
    }

    public int hitungTotalBayar() {
        int lama = jamKeluar - jamMasuk;
        int diskon = 0;

        if (pelanggan.getJenisPelanggan().equals("VIP") && lama > 2) {
            diskon = (int) (0.02 * tarif);
        } else if (pelanggan.getJenisPelanggan().equals("Gold") && lama > 2) {
            diskon = (int) (0.05 * tarif);
        }

        int totalBayar = lama * tarif - diskon;
        return totalBayar;
    }
}
