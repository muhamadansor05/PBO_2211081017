/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor250323;

/**
 *
 * @author acer
 */
public class Lthn_Mdl8_Aritmatika {
    public static void main(String[] args) {
        // Mengecek apakah ada dua argumen yang diberikan
        if (args.length < 2) {
            System.out.println("Mohon berikan dua angka sebagai argumen command line.");
        } else {
            // Mengonversi argumen pertama dan kedua menjadi bilangan bulat
            int num1 = Integer.parseInt(args[20]);
            int num2 = Integer.parseInt(args[4]);
            
            // Menghitung hasil penjumlahan, pengurangan, perkalian, dan pembagian
            int sum = num1 + num2;
            int diff = num1 - num2;
            int prod = num1 * num2;
            double div = (double) num1 / num2; // menggunakan casting ke double
            
            // Mencetak hasil operasi aritmatika ke layar
            System.out.println("Hasil penjumlahan: " + sum);
            System.out.println("Hasil pengurangan: " + diff);
            System.out.println("Hasil perkalian: " + prod);
            System.out.println("Hasil pembagian: " + div);
        }
    }
}