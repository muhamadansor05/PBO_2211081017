/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor160323;
import javax.swing.JOptionPane;
public class ContohOptionPane {
    public static void main (String[] args){
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your name");
	String msg = "Hello" + name + "!";
		
	JOptionPane.showMessageDialog(null, msg);
    }
}