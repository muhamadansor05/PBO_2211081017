/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor300323;

/**
 *
 * @author acer
 */
public class Aritmatika {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        
        int hasilTambah = tambah(a, b); // panggil method tambah
        System.out.println("Hasil tambah " + a + " dan " + b + " adalah " + hasilTambah);

        boolean ganjil = cekGanjil(a); // panggil method cekGanjil
        if (ganjil) {
            System.out.println(a + " adalah bilangan ganjil");
        } else {
            System.out.println(a + " bukan bilangan ganjil");
        }
    }
    
    public static int tambah(int a, int b) {
        return a + b;
    }
    
    public static boolean cekGanjil(int a) {
        return a % 2 != 0;
    }
}