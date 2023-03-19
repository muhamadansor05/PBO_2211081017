/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor180323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class Lthn_Mdl7_NomorTerbesar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
            numbers[i] = Double.parseDouble(input);
        }

        double maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + maxNumber);
    }
}