/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MuhamadAnsor.dao;

import MuhamadAnsor.model.Pengembalian;
import java.util.List;

/**
 *
 * @author acer
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws Exception;
    void update(Pengembalian pengembalian) throws Exception;
    void delete(Pengembalian pengembalian) throws Exception;
    Pengembalian getPengembalian(String kodeAnggota,String kodeBuku, String tglPinjam, String tglDikembalikan) throws Exception;
    List<Pengembalian> getAll() throws Exception;
    List<Pengembalian> getAll(String kategori, String cari) throws Exception;
    int selisihTanggal(String tgl1, String tgl2) throws Exception;
}