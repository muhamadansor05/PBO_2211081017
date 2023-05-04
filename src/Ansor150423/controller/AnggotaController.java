/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Ansor150423.model.*;
import Ansor150423.view.FormAnggota;
/*
 *
 * @author acer
 */
public class AnggotaController {

    Anggota anggota;  //model
    FormAnggota view; // view 
    AnggotaDao dao; // ke database
    Koneksi k;

    public AnggotaController(FormAnggota view) {
        try {
            k = new Koneksi();
            anggota = new Anggota();
            dao = new AnggotaDao(k.getConnection());
            this.view = view;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert_anggota() {
        try {
            anggota.setNobp(this.view.getTxtNobp().getText());
            anggota.setNama(this.view.getTxtNama().getText());
            anggota.setAlamat(this.view.getTxtAlamat().getText());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(view, "Entri Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Entri Data Gagal" + ex.getMessage());
        }
    }
    
    public void update_anggota() {
        try {
            anggota.setKodeanggota(this.view.getTxtkodeAnggota().getText());
            anggota.setNamaanggota(this.view.getTxtNamaAnggota().getText());
            anggota.setTgllahir(this.view.getTxtTglLahir().getText());
            anggota.setJekel(this.view.getCboJekel().getSelectedItem().toString());
            anggota.setIdprodi(this.view.getCboProdi().getSelectedIndex() + 1);
            dao.update(anggota);
            JOptionPane.showMessageDialog(view, "Update Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Update Data Gagal" + ex.getMessage());
        }
    }
    
    public void delete_anggota() {
        try {
            String kode = view.getTxtkodeAnggota().getText();
            dao.delete(kode);
            JOptionPane.showMessageDialog(view, "Delete Data ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Delete Data Gagal" + ex.getMessage());
        }
    }

    public void cari_anggota() {
        try {
            String kode = view.getTxtkodeAnggota().getText();
            anggota = dao.getAnggota(kode);
            if (anggota != null) {
                view.getTxtNamaAnggota().setText(anggota.getNamaanggota());
                view.getTxtTglLahir().setText(anggota.getTgllahir());
                view.getCboJekel().setSelectedItem(anggota.getJekel());
                view.getCboProdi().setSelectedIndex(anggota.getIdprodi() - 1);
            } else {
                view.getTxtNamaAnggota().setText("");
                view.getTxtTglLahir().setText("");
                JOptionPane.showMessageDialog(view, "Data Tidak Ada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Error "+ex.getMessage());
        }
    }
    
    public void update_tabel(){
        try {
            final ResultSet rs = dao.getAllAnggota("select * from anggota");
            String[][] data = new String[1][5];
            if(rs != null){
                rs.last();
                final int row = rs.getRow();
                rs.beforeFirst();
                int i=0;
                data = new String[row][5];
                while(rs.next()){
                    data[i][0]=rs.getString(1);
                    data[i][1]=rs.getString(2);
                    data[i][2]=rs.getString(3);
                    data[i][3]=rs.getString(4);
                    data[i][4]=rs.getString(5);
                    i++;
                }
            }else{
                data[0][0]="No Data";
            }
            final String[] nkolom = {"KODE","NAMA ANGGOTA","TGL LAHIR","JEKEL","ID PRODI"};
            final DefaultTableModel tmodel = new DefaultTableModel(data, nkolom);
            view.getTabelAnggota().setModel(tmodel);
            view.getTabelAnggota().setSelectionMode(0);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}