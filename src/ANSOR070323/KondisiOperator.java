/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DINDA070323;

/**
 *
 * @author LABSIKOMP03
 */
public class KondisiOperator {
    public static void main (String [] args){
        String  status = "";
        int grade = 80 ;
        
        // mendapatakan status pelajar
        status = (grade >= 60)? "Passed":"Fail";
        
        //print status
        System.out.println(status);
    }
}
