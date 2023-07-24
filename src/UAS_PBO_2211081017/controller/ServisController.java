/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.controller;

import UAS_PBO_2211081017.model.Servis;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */

public class ServisController {
    private List<Servis> daftarServis;

    public ServisController() {
        daftarServis = new ArrayList<>();
    }

    public void tambahServis(Servis servis) {
        try {
            daftarServis.add(servis);
            JOptionPane.showMessageDialog(null, "Data servis berhasil ditambahkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data servis: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateServis(Servis servis) {
        try {
            for (Servis s : daftarServis) {
                if (s.getNomorTrans() == servis.getNomorTrans()) {
                    s.setTglServis(servis.getTglServis());
                    s.setKodePelanggan(servis.getKodePelanggan());
                    s.setPerbaikan(servis.getPerbaikan());
                    s.setBiayaPerbaikan(servis.getBiayaPerbaikan());
                    s.setDiskon(servis.getDiskon());
                    s.setTotal(servis.getTotal());
                    JOptionPane.showMessageDialog(null, "Data servis berhasil diperbarui.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            throw new Exception("Servis dengan nomor transaksi " + servis.getNomorTrans() + " tidak ditemukan.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui data servis: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void hapusServis(int nomorTransaksi) {
        try {
            Servis servis = null;
            for (Servis s : daftarServis) {
                if (s.getNomorTrans() == nomorTransaksi) {
                    servis = s;
                    break;
                }
            }
            if (servis != null) {
                daftarServis.remove(servis);
                JOptionPane.showMessageDialog(null, "Data servis berhasil dihapus.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                throw new Exception("Servis dengan nomor transaksi " + nomorTransaksi + " tidak ditemukan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data servis: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Servis getServisByNomorTrans(int nomorTransaksi) {
        try {
            for (Servis s : daftarServis) {
                if (s.getNomorTrans() == nomorTransaksi) {
                    return s;
                }
            }
            throw new Exception("Servis dengan nomor transaksi " + nomorTransaksi + " tidak ditemukan.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencari data servis: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<Servis> getAllServis() {
        return new ArrayList<>(daftarServis);
    }

    public void cetakSemuaServis() {
        try {
            if (daftarServis.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tidak ada data servis yang tersedia.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
  
}
