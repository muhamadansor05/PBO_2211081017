/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor080423;

/**
 *
 * @author acer
 */
public class Manusia extends LivingThing{
    public void berjalan(){
        System.out.println("Berjalan seperti manusia...");
    }
    
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.bernapas();
        m.makan();
        m.berjalan();
    }
}