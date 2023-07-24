/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MuhamadAnsor.controller;

import Ansor.db.DbHelper;
import MuhamadAnsor.dao.BukuDao;
import MuhamadAnsor.dao.BukuDaoImpl;
import MuhamadAnsor.model.Buku;
import MuhamadAnsor.view.FormBuku;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class BukuController {
    private Buku buku;
    private BukuDao bukuDao;
    private Connection con;
    private FormBuku form;
    
    
    public BukuController(FormBuku form) {
        try {
            this.form = form;
            con = DbHelper.getConnection();
            bukuDao = new BukuDaoImpl(con);
            buku = new Buku();
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clear(){
        form.getTxtJudulBuku().setText("");
        form.getTxtKodeBuku().setText("");
        form.getTxtPengarang().setText("");
        form.getTxtPenerbit().setText("");
    }
    
    public void get(){
        try {
            String kode = form.getTblBuku()
                    .getValueAt(form.getTblBuku().getSelectedRow(), 0).toString();
            buku = bukuDao.getBuku(kode);
            form.getTxtKodeBuku().setText(buku.getKodeBuku());
            form.getTxtJudulBuku().setText(buku.getJudulBuku());
            form.getTxtPengarang().setText(buku.getPengarang());
            form.getTxtPenerbit().setText(buku.getPenerbit());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setJudulBuku(form.getTxtJudulBuku().getText());
            buku.setKodeBuku(form.getTxtKodeBuku().getText());
            buku.setPengarang(form.getTxtPengarang().getText());
            buku.setPenerbit(form.getTxtPenerbit().getText());
            bukuDao.insert(buku);
            JOptionPane.showMessageDialog(form, "Insert Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            buku.setJudulBuku(form.getTxtJudulBuku().getText());
            buku.setKodeBuku(form.getTxtKodeBuku().getText());
            buku.setPengarang(form.getTxtPengarang().getText());
            buku.setPenerbit(form.getTxtPenerbit().getText());
            bukuDao.update(buku);
            JOptionPane.showMessageDialog(form, "Update Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            bukuDao.delete(buku);
            JOptionPane.showMessageDialog(form, "Delete OK!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Delete Gagal!");
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void display(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblBuku().getModel();
            tableModel.setRowCount(0);
            tableModel.setRowCount(0);
            List<Buku> list = bukuDao.getAll();
            for(Buku a : list) {
                Object[] data = {
                    a.getKodeBuku(),
                    a.getJudulBuku(),
                    a.getPengarang(),
                    a.getPenerbit()
                };
                tableModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void Showdata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}