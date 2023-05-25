/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ansor150423.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Ansor150423.model.Anggota;
/**
 *
 * @author acer
 */
public interface AnggotaDao {

    private Connection con;

    public AnggotaDao(Connection con) {
        this.con = con;
    }

    public void insert(Anggota anggota) throws SQLException {
        String query = "insert into anggota values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getNamaanggota());
        ps.setString(3, anggota.getTgllahir());
        ps.setString(4, anggota.getJekel());
        ps.setInt(5, anggota.getIdprodi());
        ps.executeUpdate();
    }
    
    public void update(Anggota anggota) throws SQLException {
        String query = "update anggota set namaanggota=?,"
                + " tgllahir=?, jekel=?, "
                + "idprodi=? where kodeanggota=? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(5, anggota.getKodeanggota());
        ps.setString(1, anggota.getNamaanggota());
        ps.setString(2, anggota.getTgllahir());
        ps.setString(3, anggota.getJekel());
        ps.setInt(4, anggota.getIdprodi());
        ps.executeUpdate();
    }
    
    public void delete(String kode) throws SQLException {
        String query = "delete from anggota where kodeanggota=? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, kode);
        ps.executeUpdate();
    }
    
    public Anggota getAnggota(String kode) throws SQLException{
        String query = "select * from anggota where kodeanggota=?";
        Anggota anggota = null;
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setTgllahir(rs.getString(3));
            anggota.setJekel(rs.getString(4));
            anggota.setIdprodi(rs.getInt(5));
        }
        return anggota;
    }
    
    public ResultSet getAllAnggota(String sql) throws SQLException{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
