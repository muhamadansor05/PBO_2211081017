/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Ansor150423.model.Buku;

/**
 *
 * @author acer
 */
public class BukuDao {
    private Connection con;

    public BukuDao(Connection con) {
        this.con = con;
    }

    public ResultSet getAllBuku(String sql) throws SQLException{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
}