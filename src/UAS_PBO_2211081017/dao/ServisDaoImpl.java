/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.dao;

import UAS_PBO_2211081017.model.Servis;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class ServisDaoImpl implements ServisDao {
    private List<Servis> database;

    public ServisDaoImpl() {
        database = new ArrayList<>();
    }

    @Override
    public void tambahServis(Servis servis) {
        database.add(servis);
    }

    @Override
    public void updateServis(Servis servis) {
        for (Servis s : database) {
            if (s.getNomorTrans() == servis.getNomorTrans()) {
                s.setTglServis(servis.getTglServis());
                s.setKodePelanggan(servis.getKodePelanggan());
                s.setPerbaikan(servis.getPerbaikan());
                s.setBiayaPerbaikan(servis.getBiayaPerbaikan());
                s.setDiskon(servis.getDiskon());
                s.setTotal(servis.getTotal());
                break;
            }
        }
    }

    public void hapusServis(int nomorTrans) {
        Servis servis = null;
        for (Servis s : database) {
            if (s.getNomorTrans() == nomorTrans) {
                servis = s;
                break;
            }
        }
        if (servis != null) {
            database.remove(servis);
        }
    }

    public Servis getServisByNomorTransaksi(int nomorTransaksi) {
        for (Servis s : database) {
            if (s.getNomorTrans() == nomorTransaksi) {
                return s;
            }
        }
        return null;
    }
    
    public List<Servis> getAllServis() {
        return new ArrayList<>(database);
    }
}