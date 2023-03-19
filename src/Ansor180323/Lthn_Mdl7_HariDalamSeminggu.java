/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor180323;

/**
 *
 * @author acer
 */
public class Lthn_Mdl7_HariDalamSeminggu {
    public static void main(String[] args) {
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // while-loop
        System.out.println("Menggunakan while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        // do-while loop
        System.out.println("\nMenggunakan do-while loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);

        // for-loop
        System.out.println("\nMenggunakan for-loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}