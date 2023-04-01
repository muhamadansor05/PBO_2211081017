/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori010423;

/**
 *
 * @author acer
 */
public class Lthn_Modul10 {
    private BukuAlamat[] daftarBukuAlamat = new BukuAlamat[100];
    private int jumlahData = 0;
    
    // Method untuk memasukkan data
    public void tambahData(BukuAlamat data) {
        if (jumlahData < 100) {
            daftarBukuAlamat[jumlahData] = data;
            jumlahData++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat sudah penuh.");
        }
    }
    
    // Method untuk menghapus data
    public void hapusData(int index) {
        if (index < 0 || index >= jumlahData) {
            System.out.println("Index tidak valid.");
        } else {
            for (int i = index; i < jumlahData-1; i++) {
                daftarBukuAlamat[i] = daftarBukuAlamat[i+1];
            }
            daftarBukuAlamat[jumlahData-1] = null;
            jumlahData--;
            System.out.println("Data berhasil dihapus.");
        }
    }
    
    // Method untuk menampilkan seluruh data
    public void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Buku alamat kosong.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Data ke-" + (i+1));
                System.out.println("Nama: " + daftarBukuAlamat[i].getNama());
                System.out.println("Alamat: " + daftarBukuAlamat[i].getAlamat());
                System.out.println("Nomor Telepon: " + daftarBukuAlamat[i].getNomorTelepon());
                System.out.println("Alamat E-Mail: " + daftarBukuAlamat[i].getAlamatEmail());
                System.out.println();
            }
        }
    }
    
    // Method untuk update data
    public void updateData(int index, BukuAlamat data) {
        if (index < 0 || index >= jumlahData) {
            System.out.println("Index tidak valid.");
        } else {
            daftarBukuAlamat[index] = data;
            System.out.println("Data berhasil diupdate.");
        }
    }
}