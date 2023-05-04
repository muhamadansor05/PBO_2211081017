/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ansor150423.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Ansor150423.model.Peminjaman;
/**
 *
 * @author acer
 */
public class PeminjamanDao {
    private Connection con;

    public PeminjamanDao(Connection con) {
        this.con = con;
    }
    
    public void insert(Peminjaman peminjaman) throws SQLException {
        String query = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }
    
    public void update(Peminjaman peminjaman) throws SQLException {
        String query = "update peminjaman set tglkembali=?"
                     + " where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getKodeanggota());
        ps.setString(3, peminjaman.getKodebuku());
        ps.setString(4, peminjaman.getTglpinjam()); 
        ps.executeUpdate();
    }
    
    public void delete(String kodeanggota, String kodebuku, String tglpinjam) throws SQLException {
        String query = "delete from peminjaman "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws SQLException{
        String query = "select * from peminjaman "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=? ";
        Peminjaman peminjaman = null; 
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public ResultSet getAllPeminjaman(String sql) throws SQLException{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
