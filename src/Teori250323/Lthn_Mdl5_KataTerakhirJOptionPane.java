/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori250323;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class Lthn_Mdl5_KataTerakhirJOptionPane {
    public static void main(String[] args) {
        String word1, word2, word3;
        
        // Meminta input dari user untuk tiga kata menggunakan JOptionPane
        word1 = JOptionPane.showInputDialog("Masukkan kata pertama:");
        word2 = JOptionPane.showInputDialog("Masukkan kata kedua:");
        word3 = JOptionPane.showInputDialog("Masukkan kata ketiga:");
        
        // Menampilkan output dari input user ke layar menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, word1 + word2 + word3);
    }
}
