/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor080423;

/**
 *
 * @author acer
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee1 emp = new Employee1();
        student.setName("Budi");
        student.setAddress("Padang");
        emp.setName("Doni");
        emp.setAddress("Bukittinggi");
        
        printInformation(student);
        
        printInformation(emp);
        
 //       ref = student;
 //       String temp = ref.getName();
 //       System.out.println(temp);
       
 //       ref = emp;
 //       String temp1 = ref.getName();
 //       System.out.println(temp1);
    }
    
    public static void printInformation( Person p ){
        if(p instanceof Student){
             System.out.println("Nama Student     :"+p.getName());
             System.out.println("Alamat Student   :"+p.getAddress());
        }else if(p instanceof Employee1){
            System.out.println("Nama Employee     :"+p.getName());
            System.out.println("Alamat Employee   :"+p.getAddress());
            
        }
            
    }
}