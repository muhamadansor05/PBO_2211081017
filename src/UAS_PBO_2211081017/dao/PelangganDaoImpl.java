/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_2211081017.dao;

import UAS_PBO_2211081017.model.Pelanggan;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class PelangganDaoImpl implements PelangganDao {
    private Connection cn;
    private Pelanggan pl;

    public PelangganDaoImpl(Connection cn) {
        this.cn = cn;

    }

public class PelangganDAOImpl implements PelangganDao {
    private List<Pelanggan> database;

    public PelangganDAOImpl() {
        database = new ArrayList<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        database.add(pelanggan);
    }

    public void updatePelanggan(Pelanggan pelanggan) {
        for (Pelanggan p : database) {
            if (p.getKodePelanggan() == pelanggan.getKodePelanggan()) {
                p.setNamaPelanggan(pelanggan.getNamaPelanggan());
                p.setNoHP(pelanggan.getNoHP());
                p.setJenisPelanggan(pelanggan.getJenisPelanggan());
                break;
            }
        }
    }

    public void hapusPelanggan(int kodePelanggan) {
        Pelanggan pelanggan = null;
        for (Pelanggan p : database) {
            if (p.getKodePelanggan() == kodePelanggan) {
                pelanggan = p;
                break;
            }
        }
        if (pelanggan != null) {
            database.remove(pelanggan);
        }
    }

    public Pelanggan getPelangganByKode(int kodePelanggan) {
        for (Pelanggan p : database) {
            if (p.getKodePelanggan() == kodePelanggan) {
                return p;
            }
        }
        return null;
    }

    public List<Pelanggan> getAllPelanggan() {
        return new ArrayList<>(database);
    }
}
}