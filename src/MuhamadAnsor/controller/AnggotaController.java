/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MuhamadAnsor.controller;

import Ansor.db.DbHelper;
import MuhamadAnsor.dao.AnggotaDao;
import MuhamadAnsor.dao.AnggotaDaoImpl;
import MuhamadAnsor.model.Anggota;
import MuhamadAnsor.view.FormAnggota;
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
public class AnggotaController {
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    private Connection con;
    private FormAnggota form;
    
    
    public AnggotaController(FormAnggota form) {
        try {
            this.form = form;
            con = DbHelper.getConnection();
            anggotaDao = new AnggotaDaoImpl(con);
            anggota = new Anggota();
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clear(){
        form.getTxtNama().setText("");
        form.getTxtKodeAnggota().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtNotif().setText("");
        
        form.getCboKelamin().removeAllItems();
        form.getCboKelamin().addItem("Jenis kelamin");
        form.getCboKelamin().addItem("L");
        form.getCboKelamin().addItem("P");
        form.getCboKelamin().setSelectedIndex(0);
    }
    
    public void get(){
        try {
            String kode = form.getTblAnggota()
                    .getValueAt(form.getTblAnggota().getSelectedRow(), 0).toString();
            anggota = anggotaDao.getAnggota(kode);
            form.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            form.getTxtNama().setText(anggota.getNamaAnggota());
            form.getTxtAlamat().setText(anggota.getAlamat());
            form.getCboKelamin().setSelectedItem(anggota.getJenisKelamin());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setNamaAnggota(form.getTxtNama().getText());
            anggota.setKodeAnggota(form.getTxtKodeAnggota().getText());
            anggota.setAlamat(form.getTxtAlamat().getText());
            anggota.setJenisKelamin(form.getCboKelamin().getSelectedItem().toString());
            anggotaDao.insert(anggota);
            JOptionPane.showMessageDialog(form, "Insert Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            anggota.setNamaAnggota(form.getTxtNama().getText());
            anggota.setKodeAnggota(form.getTxtKodeAnggota().getText());
            anggota.setAlamat(form.getTxtAlamat().getText());
            anggota.setJenisKelamin(form.getCboKelamin().getSelectedItem().toString());
            anggotaDao.update(anggota);
            JOptionPane.showMessageDialog(form, "Update Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            anggotaDao.delete(anggota);
            JOptionPane.showMessageDialog(form, "Delete OK!");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void display(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblAnggota().getModel();
            tableModel.setRowCount(0);
            tableModel.setRowCount(0);
            List<Anggota> list = anggotaDao.getAll();
            for(Anggota a : list) {
                Object[] data = {
                    a.getKodeAnggota(),
                    a.getNamaAnggota(),
                    a.getAlamat(),
                    a.getJenisKelamin()
                };
                tableModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}