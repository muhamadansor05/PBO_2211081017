/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UAS_PBO_2211081017.dao;

import UAS_PBO_2211081017.model.Pelanggan;
import java.util.List;

/**
 *
 * @author acer
 */
public interface PelangganDao {
    public interface AnggotaDao {
    void insert (Pelanggan Pelanggan) throws Exception;
    void update (String index, Pelanggan Pelanggan) throws Exception;
    void delete (String index) throws Exception;
    Pelanggan getPelanggan(String kodePelanggan) throws Exception;
    List<Pelanggan> getAll() throws Exception;
}
}