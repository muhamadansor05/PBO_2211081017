/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor100423;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class StudentRecordB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StudentRecordA saya = new StudentRecordA();

        saya.setNama("pito");
        saya.setAddres("Padang");
        saya.setAge("19");
        saya.setNilaiIPA(100);
        int NilaiIPA = saya.setNilaiIPA();
        saya.setNilaiInggris(70);
        int NilaiInggris = saya.setNilaiInggris();
        saya.setNilaiMTK(65);
        int NilaiMTK = saya.setNilaiMTK();

        System.out.println("Nama   : "+saya.getNama());
        System.out.println("Alamat : "+saya.getAddres());
        System.out.println("Umur   : "+saya.getAge());
        System.out.println("Rata   : "+saya.getrata(NilaiIPA, NilaiInggris,NilaiMTK));
        System.out.println("Nilai  : "+saya.getNilaiHuruf(saya.getrata(NilaiIPA, NilaiInggris,NilaiMTK)));
    }
}