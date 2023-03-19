/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor180323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author acer
 */
public class Lthn_Mdl6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan nilai ujian ke-1:");
        double nilai1 = Double.parseDouble(reader.readLine());

        System.out.println("Masukkan nilai ujian ke-2:");
        double nilai2 = Double.parseDouble(reader.readLine());

        System.out.println("Masukkan nilai ujian ke-3:");
        double nilai3 = Double.parseDouble(reader.readLine());

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.println("Rata-rata nilai ujian adalah: " + rataRata);

        if (rataRata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}