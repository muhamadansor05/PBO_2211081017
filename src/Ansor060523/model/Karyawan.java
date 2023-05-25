/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor060523.model;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Karyawan {
    protected String nip;
    protected String golJabatan;

    public Karyawan(String nip, String golJabatan) {
        this.nip = nip;
        this.golJabatan = golJabatan;
    }

    public String getNip() {
        return nip;
    }

    public String getGolJabatan() {
        return golJabatan;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setGolJabatan(String golJabatan) {
        this.golJabatan = golJabatan;
    }
} 