/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor300323;

/**
 *
 * @author acer
 */
public class CastingExplisit {
    public static void main(String[] args) {
        char valChar = 'A';
        int valInt = (int) valChar; // melakukan casting eksplisit dari char ke int
        System.out.print(valInt); // mencetak nilai valInt yang telah di-casting
        double x = 10.2;
        int y = 2;
        int result = (int) (x / y); // typecast operasi pembagian dari double ke int
        System.out.println(result); // output: 5
    }
}