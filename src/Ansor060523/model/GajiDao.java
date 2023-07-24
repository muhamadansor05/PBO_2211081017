/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ansor060523.model;

import java.util.List;

/**
 *
 * @author acer
 */
public interface GajiDao {
    void save(Gaji gaji);
    void update(int index, Gaji gaji);
    void delete(int index);
    Gaji getGaji(int index);
    List<Gaji> getAll();
}