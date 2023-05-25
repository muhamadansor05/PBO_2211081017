/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor060523.controller;
import java.util.Scanner;
import Ansor060523.model.*;
/**
 *
 * @author acer
 */
public class GajiController {
    private Scanner scanner = new Scanner(System.in);

    public void inputData() {
        System.out.print("Masukkan jumlah data gaji yang ingin diinputkan: ");
        int jumlahData = scanner.nextInt();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i+1));

            System.out.print("Masukkan bulan: ");
            int bulan = scanner.nextInt();

            System.out.print("Masukkan tahun: ");
            int tahun = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Masukkan NIP: ");
            String nip = scanner.nextLine();

            System.out.print("Masukkan gaji pokok: ");
            double gajiPokok = scanner.nextDouble();

            System.out.print("Masukkan tunjangan anak: ");
            double tunjanganAnak = scanner.nextDouble();

            System.out.print("Masukkan tunjangan istri: ");
            double tunjanganIstri = scanner.nextDouble();

            Gaji gaji = new Gaji(bulan, tahun, nip, gajiPokok, tunjanganAnak, tunjanganIstri);
            listGaji.add(gaji);
        }
    }
}