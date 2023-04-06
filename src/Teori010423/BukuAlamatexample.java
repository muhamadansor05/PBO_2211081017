/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori010423;

/**
 *
 * @author acer
 */
public class BukuAlamatexample {
    private MainBukuAlamat[] daftarBukuAlamat = new MainBukuAlamat[100];
    private int jumlahData = 0;
    
    public void tambahData(MainBukuAlamat data) {
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
    public void updateData(int index, MainBukuAlamat data) {
        if (index < 0 || index >= jumlahData) {
            System.out.println("Index tidak valid.");
        } else {
            daftarBukuAlamat[index] = data;
            System.out.println("Data berhasil diupdate.");
            public class Main {
    public static void main(String[] args) {
        // create an object of BukuAlamat class
        MainBukuAlamat alamat = new MainBukuAlamat("Muhamad Ansor", "Jl. Dr wahidin 2 ", "082288600104", "muhamadansor05.com");
        
        // print the values of the object's attributes
        System.out.println("Nama: " + alamat.getNama());
        System.out.println("Alamat: " + alamat.getAlamat());
        System.out.println("Nomor Telepon: " + alamat.getNomorTelepon());
        System.out.println("Alamat E-Mail: " + alamat.getAlamatEmail());
        
        // update the values of the object's attributes
        alamat.setNama("Muhamad Ansor");
        alamat.setAlamat("Jl. Dr wahidin 2");
        alamat.setNomorTelepon("082288600104");
        alamat.setAlamatEmail("muhamadansor05.com");
        
        // print the updated values of the object's attributes
        System.out.println("Nama: " + alamat.getNama());
        System.out.println("Alamat: " + alamat.getAlamat());
        System.out.println("Nomor Telepon: " + alamat.getNomorTelepon());
        System.out.println("Alamat E-Mail: " + alamat.getAlamatEmail());
    }
}
        }
    }
}