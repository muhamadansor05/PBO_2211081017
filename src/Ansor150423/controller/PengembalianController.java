/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.controller;
import dao.AnggotaDao;
import dao.BukuDao;
import dao.Koneksi;
import dao.PeminjamanDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Ansor150423.view.FormPengembalian;
/**
 *
 * @author acer
 */
public class PengembalianController {
    FormPengembalian view;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Connection con;
    Koneksi k;
    String[] tkodeAnggota;
    String[] tkodeBuku;

    public PengembalianController(FormPengembalian view) {
        try {
            this.view = view;
            this.peminjamanDao = new PeminjamanDao(con);
            this.anggotaDao = new AnggotaDao(con);
            this.bukuDao = new BukuDao(con);
            this.k = new Koneksi();
            this.con = k.getConnection();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}