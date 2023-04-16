/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor300323;
import java.util.Scanner;
/**
 *
 * @author acer
 */
import java.util.Scanner;

import java.util.*;

public class AritmatikaExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[3][5];
        int[] total = new int[3];

        System.out.println("Input Nilai Perlombaan Cerdas Cermat");
        System.out.println("------------------------------------");

        // Input nilai peserta
        for (int i = 0; i < 3; i++) {
            System.out.println("Grup " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai Peserta " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                total[i] += nilai[i][j];
            }
            System.out.println();
        }

        // Tampilkan total nilai per grup
        System.out.println("Total Nilai");
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Grup " + (i + 1) + ": " + total[i]);
        }
        System.out.println();

        // Urutkan total nilai dari terbesar ke terkecil
        int[] sortedTotal = Arrays.copyOf(total, total.length);
        Arrays.sort(sortedTotal);
        for (int i = sortedTotal.length - 1; i >= 0; i--) {
            int idx = Arrays.binarySearch(total, sortedTotal[i]);
            System.out.println("Grup " + (idx + 1) + " : " + sortedTotal[i]);
        }
    }
}