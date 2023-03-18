/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori180323;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Lthn3 {
public static void main(String[] args) {
      // masukkan bilangan pertama
      // masukkan bilangan kedua
      // masukkan bilangan ketiga
      // jumlahkan ketiga bilangan
      // bagikan jumlah dengan 3
      // tampilkan hasil rata-rata
      Scanner input = new Scanner(System.in);
      
      System.out.print("Masukkan bilangan pertama: ");
      double bil1 = input.nextDouble();
      
      System.out.print("Masukkan bilangan kedua: ");
      double bil2 = input.nextDouble();
      
      System.out.print("Masukkan bilangan ketiga: ");
      double bil3 = input.nextDouble();
      
      double rata = (bil1 + bil2 + bil3) / 3;
      
      System.out.println(rata);
}
}