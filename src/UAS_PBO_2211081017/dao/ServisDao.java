/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UAS_PBO_2211081017.dao;

import UAS_PBO_2211081017.model.Servis;
import java.util.List;

/**
 *
 * @author acer
 */

public interface ServisDao {
    void tambahServis(Servis servis);
    void updateServis(Servis servis);
    void hapusServis(int nomorTransaksi);
    Servis getServisByNomorTransaksi(int nomorTransaksi);
    List<Servis> getAllServis();
}