/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor060423;

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
    anna.setMathGrade(85);
    anna.setEnglishGrade(90);
    anna.setScienceGrade(80);

    cris.setName("Cris");
    cris.setAddress("BukitTinggi");
    cris.setAge(20);
    cris.setMathGrade(75);
    cris.setEnglishGrade(80);
    cris.setScienceGrade(85);

    //menampilkan
    System.out.println("Data Objek Anna");
    System.out.println("Nama        :"+anna.getName());
    System.out.println("Address     :"+anna.getAddress());
    System.out.println("Age         :"+anna.getAge());

    System.out.println("\nData Objek Cris");
    cris.print("");
    cris.print(70,80,90);

    System.out.println("\nData Objek Ali");
    ali.print("");

    //menampilkan nilai huruf
    System.out.println("\nNilai Huruf Anna: " + anna.getLetterGrade());
    System.out.println("Nilai Huruf Cris: " + cris.getLetterGrade());

    //menampilkan jumlah siswa
    System.out.println("count="+StudentRecord.getStudentCount());

}
}