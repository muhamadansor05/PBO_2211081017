/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teori010423;

/**
 *
 * @author acer
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("Ali");
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        
        cris.setName("Cris");
        cris.setAddress("BukitTinggi");
        cris.setAge(20);
        
        //menampilkan
        System.out.println("Data Objek Anna");
        System.out.println("Nama        :"+anna.getName());
        System.out.println("Address     :"+anna.getAddress());
        System.out.println("Age         :"+anna.getAge());
        
        //memanggil method print
           System.out.println("\nData Objek Cris");
           cris.print("");
           cris.print(70,80,90);
           
           System.out.println("\nData Objek Ali");
           ali.print("");
           
           
        //menampilkan jumlah siswa
         System.out.println("count="+StudentRecord.getStudentCount());
         
    }
}