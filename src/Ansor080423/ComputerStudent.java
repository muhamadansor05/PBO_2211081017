/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor080423;

import Ansor100423.StudentRecord;

/**
 *
 * @author acer
 */
 public class ComputerStudent extends StudentRecord{
    //latihan 1 dimodule 11
    private double compGrade;
    public ComputerStudent(){
        super( "Ali", "Padang" );
        System.out.println("Inside ComputerStudent Constructor");
    }
    
    public double getCompGrade(){
        return compGrade;
    } 
    public void setCompGrade(double cGrade){
        this.compGrade = cGrade;
    }
    public double getAverage(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade()+getCompGrade())/4;
        //untuk memeanggil variabel average, kita harus merubah public menjadi protected
    }
    
    //pemanggilan
    public static void main(String[] args){
        ComputerStudent siA = new ComputerStudent();
        siA.setName("Hamba Allah");
        siA.setCompGrade(90);
        siA.setEnglishGrade(80);
        siA.setMathGrade(90);
        siA.setScienceGrade(80);
        System.out.println("Nama  : "+siA.getName());
        System.out.println("Rata2 : "+siA.getAverage());
        System.out.println("Nilai : "+siA.nilaiHuruf());
    }

    private double getEnglishGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double getScienceGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setMathGrade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setScienceGrade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nilaiHuruf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}