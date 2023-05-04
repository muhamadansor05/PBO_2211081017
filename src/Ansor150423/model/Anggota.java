/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.model;
import javax.swing.JTextField;
/**
 *
 * @author acer
 */
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;

    public Anggota (){

    }

    public Anggota(String nobp, String nama, String alamat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNobp(){
        return nobp;
    }
    public void setNobp(String string){
        this.nobp = string;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}