/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor100423;

/**
 *
 * @author acer
 */
public class StudentRecordData {
    public static void main(String[] args){
        StudentRecord dataSiswa[] = new StudentRecord[100];
        StudentRecord d1 = new StudentRecord();
        d1.setName("Ani");
        d1.setAddres("padang");
        d1.setAge(34);
        dataSiswa[0]=d1;

        System.out.println(dataSiswa[0].getName());
        System.out.println(dataSiswa[0].getAddres());
        
        d1.setName("");
        d1.setAddres("");
        d1.setAge(34);
        dataSiswa[0]=d1;

        System.out.println(dataSiswa[0].getName());
        
    }
}