/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor180323;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class Lthn_Mdl6_JOptionpane {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-1:");
        double nilai1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-2:");
        double nilai2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-3:");
        double nilai3 = Double.parseDouble(input3);

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian adalah: " + rataRata);

        if (rataRata >= 60) {
            JOptionPane.showMessageDialog(null, "Santiang");
        } else {
            JOptionPane.showMessageDialog(null, "Bongak");
        }
    }
}