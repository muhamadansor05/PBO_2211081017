/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori250323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author acer
 */
public class Lthn_Mdl5_KataTerakhirBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word1, word2, word3;
        try {
            // Meminta input dari user untuk tiga kata
            System.out.print("Masukkan kata pertama: ");
            word1 = reader.readLine();
            
            System.out.print("Masukkan kata kedua: ");
            word2 = reader.readLine();
            
            System.out.print("Masukkan kata ketiga: ");
            word3 = reader.readLine();
            
            // Menampilkan output dari input user ke layar
            System.out.println("Kata pertama: " + word1);
            System.out.println("Kata kedua: " + word2);
            System.out.println("Kata ketiga: " + word3);
            System.out.println(word1 + word2 + word3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}