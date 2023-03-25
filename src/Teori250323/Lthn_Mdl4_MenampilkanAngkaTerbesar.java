/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori250323;

/**
 *
 * @author acer
 */
public class Lthn_Mdl4_MenampilkanAngkaTerbesar {
    public static void main(String[] args) {
        // Menentukan tiga angka
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        
        // Menentukan nilai terbesar menggunakan operator kondisi ?
        int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        
        // Mencetak nilai terbesar ke layar
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Nilai tertingginya adalah: " + max);
    }
}