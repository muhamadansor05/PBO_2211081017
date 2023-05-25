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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Ansor150423.model.Peminjaman;
import Ansor150423.view.FormPeminjaman;
/**
 *
 * @author acer
 */
public class PeminjamanController {

    FormPeminjaman view;
    BukuDao bukuDao;
    AnggotaDao anggotaDao;
    PeminjamanDao peminjamanDao;
    Koneksi k;
    Connection con;
    String[] tkodeAnggota;
    String[] tkodeBuku;
    Peminjaman peminjaman;

    public PeminjamanController(FormPeminjaman view) {
        try {
            this.view = view;
            k = new Koneksi();
            con = k.getConnection();
            bukuDao = new BukuDao(con);
            peminjamanDao = new PeminjamanDao(con);
            anggotaDao = new AnggotaDao(con);
            peminjaman = new Peminjaman();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void isiCboAnggota() {
        try {
            view.getCboKodeAnggota().removeAllItems();
            ResultSet rsanggota
                    = anggotaDao.getAllAnggota("select * from anggota");
            rsanggota.last();
            int jumlahData = rsanggota.getRow();
            tkodeAnggota = new String[jumlahData];
            int counter = 0;
            rsanggota.beforeFirst();
            while (rsanggota.next()) {
                view.getCboKodeAnggota().addItem(rsanggota.getString(2));
                tkodeAnggota[counter] = rsanggota.getString(1);
                counter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void isiCboBuku() {
        try {
            view.getCboKodeBuku().removeAllItems();
            ResultSet rsbuku = bukuDao.getAllBuku("select * from buku");
            rsbuku.last();
            int jumlahData = rsbuku.getRow();
            tkodeBuku = new String[jumlahData];
            int counter = 0;
            rsbuku.beforeFirst();
            while (rsbuku.next()) {
                view.getCboKodeBuku().addItem(rsbuku.getString(2));
                tkodeBuku[counter] = rsbuku.getString(1);
                counter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert() {
        try {
            peminjaman.setKodeanggota(
                    tkodeAnggota[view.getCboKodeAnggota().getSelectedIndex()]);
            peminjaman.setKodebuku(
                    tkodeBuku[view.getCboKodeBuku().getSelectedIndex()]);
            peminjaman.setTglpinjam(view.getTxtTglPinjam().getText());
            peminjaman.setTglkembali(view.getTxtTglKembali().getText());
            peminjamanDao.insert(peminjaman);
            JOptionPane.showMessageDialog(view, "Entri Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Entri Data Gagal " + ex.getMessage());
        }

    }

    public void update() {
        try {
            peminjaman.setKodeanggota(
                    tkodeAnggota[view.getCboKodeAnggota().getSelectedIndex()]);
            peminjaman.setKodebuku(
                    tkodeBuku[view.getCboKodeBuku().getSelectedIndex()]);
            peminjaman.setTglpinjam(view.getTxtTglPinjam().getText());
            peminjaman.setTglkembali(view.getTxtTglKembali().getText());
            peminjamanDao.update(peminjaman);
            JOptionPane.showMessageDialog(view, "Update Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Entri Data Gagal " + ex.getMessage());
        }

    }

    public void delete() {
        try {
            peminjaman.setKodeanggota(
                    tkodeAnggota[view.getCboKodeAnggota().getSelectedIndex()]);
            peminjaman.setKodebuku(
                    tkodeBuku[view.getCboKodeBuku().getSelectedIndex()]);
            peminjaman.setTglpinjam(view.getTxtTglPinjam().getText());
            peminjamanDao.delete(
                    peminjaman.getKodeanggota(),
                    peminjaman.getKodebuku(),
                    peminjaman.getTglpinjam());
            JOptionPane.showMessageDialog(view, "Delete Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Delete Data Gagal "
                    + ex.getMessage());
        }
    }

    public void cari() {
        try {
            String kdanggota =
                    tkodeAnggota[view.getCboKodeAnggota().getSelectedIndex()];
            String kdbuku =
                    tkodeBuku[view.getCboKodeBuku().getSelectedIndex()];
            String tglpinjam = view.getTxtTglPinjam().getText();
            peminjaman = peminjamanDao.getPeminjaman(
                    kdanggota, kdbuku, tglpinjam);
            if(peminjaman!=null){
               view.getTxtTglKembali().setText(peminjaman.getTglkembali()); 
            }else{
                view.getTxtTglKembali().setText("");
                JOptionPane.showMessageDialog(view, "Data Tidak Ada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}