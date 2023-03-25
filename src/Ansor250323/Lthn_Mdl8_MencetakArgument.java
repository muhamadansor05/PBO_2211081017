/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor250323;

/**
 *
 * @author acer
 */
public class Lthn_Mdl8_MencetakArgument {
    public static void main(String[] args) {
        // Mengecek apakah ada argumen yang diberikan
        if (args.length == 0) {
            System.out.println("Tidak ada argumen yang diberikan.");
        } else {
            System.out.println("Berikut ini adalah argumen yang diberikan:");
            // Mencetak semua argumen ke layar
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}