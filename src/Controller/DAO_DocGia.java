/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Object.DocGia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Phuong Thang
 */
public class DAO_DocGia {
    private Connection conn;
    public DAO_DocGia()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    }
    public ArrayList<DocGia> getListDocGia(){
        ArrayList<DocGia> list = new ArrayList<>();
        String querry = "SELECT * FROM dbDocGia";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia = new DocGia();
                docgia.setMadocgia(rs.getString(1));
                docgia.setTendocgia(rs.getString(2));
                docgia.setNgaysinh(rs.getDate(3));
                docgia.setGioitinh(rs.getString(4));
                docgia.setDiachi(rs.getString(5));
                docgia.setSdt(rs.getString(6));
                docgia.setNhom(rs.getString(7));
                list.add(docgia);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public boolean addDocGia(DocGia docgia)
    {
        String querry = "INSERT INTO dbDocGia(MaDocGia,TenDocGia,NgaySinh,GioiTinh,DiaChi,DienThoai,NhomBanDoc) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, docgia.getMadocgia());
            ps.setString(2, docgia.getTendocgia());
            ps.setDate(3, new Date(docgia.getNgaysinh().getTime()));
            ps.setString(4, docgia.getGioitinh());
            ps.setString(5, docgia.getDiachi());
            ps.setString(6, docgia.getSdt());
            ps.setString(7, docgia.getNhom());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateDocGia(DocGia docgia)
    {
        String querry = "UPDATE dbDocGia SET MaDocGia=?, TenDocGia =?, NgaySinh = ?,GioiTinh =?,DiaChi =?,DienThoai=? , NhomBanDoc = ? WHERE MaDocGia = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, docgia.getMadocgia());
            ps.setString(2, docgia.getTendocgia());
            ps.setDate(3, new Date(docgia.getNgaysinh().getTime()));
            ps.setString(4, docgia.getGioitinh());
            ps.setString(5, docgia.getDiachi());
            ps.setString(6, docgia.getSdt());
            ps.setString(7, docgia.getNhom());
            ps.setString(8, docgia.getMadocgia());
            
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteDocGia(String madocgia)
    {
        String querry = "DELETE FROM dbDocGia WHERE MaDocGia='"+madocgia+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<DocGia> findDocGia(String truyvan){
        ArrayList<DocGia> list = new ArrayList<>();
        String querry = "SELECT * FROM dbDocGia WHERE MaDocGia = '"+truyvan+"' OR TenDocGia LIKE N'%"+truyvan+"%' OR GIOITINH=N'"+truyvan+"'OR DiaChi LIKE N'%"+truyvan+"%' OR NhomBanDoc Like N'%"+truyvan+"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia = new DocGia();
                docgia.setMadocgia(rs.getString(1));
                docgia.setTendocgia(rs.getString(2));
                docgia.setNgaysinh(rs.getDate(3));
                docgia.setGioitinh(rs.getString(4));
                docgia.setDiachi(rs.getString(5));
                docgia.setSdt(rs.getString(6));
                docgia.setNhom(rs.getString(7));
                list.add(docgia);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
