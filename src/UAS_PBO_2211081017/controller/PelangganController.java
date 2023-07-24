/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.controller;

import UAS_PBO_2211081017.model.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class PelangganController {

    private List<Pelanggan> daftarPelanggan;

    public PelangganController() {
        daftarPelanggan = new ArrayList<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        try {
            daftarPelanggan.add(pelanggan);
            JOptionPane.showMessageDialog("Pelanggan berhasil ditambahkan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan pelanggan: " + e.getMessage());
        }
    }

    public void updatePelanggan(Pelanggan pelanggan) {
        try {
            for (Pelanggan p : daftarPelanggan) {
                for (p.getKodePelanggan().equals(pelanggan.getKodePelanggan())) {
                    p.setNamaPelanggan(pelanggan.getNamaPelanggan());
                    p.setNoHP(pelanggan.getNoHP());
                    p.setJenisPelanggan(pelanggan.getJenisPelanggan());
                    System.out.println("Pelanggan berhasil diperbarui.");
                    return;
                }
            }
            throw new Exception("Pelanggan dengan kode " + pelanggan.getKodePelanggan() + " tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memperbarui pelanggan: " + e.getMessage());
        }
    }

    public void hapusPelanggan(String kodePelanggan) {
        try {
            Pelanggan pelanggan = null;
            for (Pelanggan p : daftarPelanggan) {
                if (p.getKodePelanggan().equals(kodePelanggan)) {
                    pelanggan = p;
                    break;
                }
            }
            if (pelanggan != null) {
                daftarPelanggan.remove(pelanggan);
                System.out.println("Pelanggan berhasil dihapus.");
            } else {
                throw new Exception("Pelanggan dengan kode " + kodePelanggan + " tidak ditemukan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Delete Berhasil.");
        }
    }

    public Pelanggan getPelangganByKode(String kodePelanggan) {
        try {
            for (Pelanggan p : daftarPelanggan) {
                if (p.getKodePelanggan().equals(kodePelanggan)) {
                    return p;
                }
            }
            throw new Exception("Pelanggan dengan kode " + kodePelanggan + " tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat mencari pelanggan: " + e.getMessage());
            return null;
        }
    }

    public List<Pelanggan> getAllPelanggan() {
        return new ArrayList<>(daftarPelanggan);
    }
}