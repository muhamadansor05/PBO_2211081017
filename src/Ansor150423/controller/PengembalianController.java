/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.controller;
import Ansor150423.model.Anggota;
import Ansor150423.model.AnggotaDao;
import Ansor150423.model.AnggotaDaoImpl;
import Ansor150423.model.Buku;
import Ansor150423.model.BukuDao;
import Ansor150423.model.BukuDaoImpl;
import Ansor150423.model.Peminjaman;
import Ansor150423.model.PeminjamanDaoImpl;
import Ansor150423.model.Pengembalian;
import Ansor150423.model.PengembalianDao;
import Ansor150423.model.PengembalianDaoImpl;
import Ansor150423.view.FormPeminjaman;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author acer
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman form;
    
    private Peminjaman peminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPeminjaman form){
        this.form = form;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void cls(){
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
        form.getTxtDikembalikan().setText("");
    }
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        form.getCboAnggota().removeAllItems();
        form.getCboBuku().removeAllItems();
        
        //isi
        for(Anggota anggota : listAnggota){
            form.getCboAnggota().addItem(anggota.getNobp());
        }
        for(Buku buku : listBuku){
            form.getCboBuku().addItem(buku.getKode());
        }
    }
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        //agar index peminjaman dao masih sama dengan index pengembalian dao
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan("");
        pengembalian.setTerlambat("");
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Buku dipinjam");
    }
    public void get(){
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            form.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            form.getCboBuku().setSelectedItem(peminjaman.getBuku().getKode());
            form.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            form.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            form.getTxtDikembalikan().setText(pengembalian.getDikembalikan());
        }
    }
    
    public void update(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.update(idx,peminjaman);
        
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void kembalikan(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Buku dikembalikan");
    }
    
    public void delete(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        pengembalianDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);

        // Mengambil data dari dua tabel
        java.util.List<Pengembalian> listPengembalian = pengembalianDao.getAll();
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAll();

        // Menambahkan data dari kedua tabel ke dalam satu list
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman peminjaman = listPeminjaman.get(i);
            Pengembalian pengembalian = null;
            if (i < listPengembalian.size()) {
                pengembalian = listPengembalian.get(i);
            }
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getAnggota().getNama(),
                peminjaman.getBuku().getKode(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
                (pengembalian == null) ? "" : pengembalian.getDikembalikan(),
                (pengembalian == null) ? "" : pengembalian.getTerlambat(),
                (pengembalian == null) ? "" : pengembalian.getDenda()
            };
            dataGabungan.add(data);
        }

        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}