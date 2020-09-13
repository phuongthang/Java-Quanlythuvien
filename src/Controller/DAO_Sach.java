/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Object.Sach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Phuong Thang
 */
public class DAO_Sach {
    private Connection conn;
    public DAO_Sach()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Sach> getListSach(){
        ArrayList<Sach> list = new ArrayList<>();
        String querry = "SELECT * FROM dbSach";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Sach sach = new Sach();
                sach.setMasach(rs.getString(1));
                sach.setTensach(rs.getString(2));
                sach.setTentacgia(rs.getString(3));
                sach.setNoixuatban(rs.getString(4));
                sach.setNamxuatban(rs.getString(5));
                sach.setLoai(rs.getString(6));
                list.add(sach);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public boolean addSach(Sach sach)
    {
        String querry = "INSERT INTO dbSach(MaSach,TenSach,TenTacGia,NoiXuatBan,NamXuatBan,Loai) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, sach.getMasach());
            ps.setString(2, sach.getTensach());
            ps.setString(3, sach.getTentacgia());
            ps.setString(4, sach.getNoixuatban());
            ps.setString(5, sach.getNamxuatban());
            ps.setString(6, sach.getLoai());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateSach(Sach sach)
    {
        String querry = "UPDATE dbSach SET MaSach=?, TenSach =?, TenTacGia = ?,NoiXuatBan =?,NamXuatBan=?,Loai=? WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, sach.getMasach());
            ps.setString(2, sach.getTensach());
            ps.setString(3, sach.getTentacgia());
            ps.setString(4, sach.getNoixuatban());
            ps.setString(5, sach.getNamxuatban());
            ps.setString(6, sach.getLoai());
            ps.setString(7, sach.getMasach());
            
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteSach(String masach)
    {
        String querry = "DELETE FROM dbSach WHERE MaSach='"+masach+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Sach> findSach(String truyvan){
        ArrayList<Sach> list = new ArrayList<>();
        String querry = "SELECT * FROM dbSach WHERE MaSach = '"+truyvan+"' OR TenSach LIKE N'%"+truyvan+"%' OR TenTacGia LIKE N'%"+truyvan+"%' OR NoiXuatBan LIKE N'%"+truyvan+"%' OR Loai LIKE N'%"+truyvan+"%' OR NamXuatBan = N'"+truyvan+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Sach sach = new Sach();
                sach.setMasach(rs.getString(1));
                sach.setTensach(rs.getString(2));
                sach.setTentacgia(rs.getString(3));
                sach.setNoixuatban(rs.getString(4));
                sach.setNamxuatban(rs.getString(5));
                sach.setLoai(rs.getString(6));
                list.add(sach);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<String> getListLoaiSach(){
        ArrayList<String> listloai = new ArrayList<>();
        String querry = "select DISTINCT Loai From dbSach";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String loai = rs.getString(1);
                
                listloai.add(loai);
                
            }
        } catch (Exception e) {
        }
        return listloai;
    }
    public ArrayList<Sach> getListSachTheoLoai(String loai){
        ArrayList<Sach> list = new ArrayList<>();
        String querry = "SELECT * FROM dbSach where Loai = N'"+loai+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Sach sach = new Sach();
                sach.setMasach(rs.getString(1));
                sach.setTensach(rs.getString(2));
                sach.setTentacgia(rs.getString(3));
                sach.setNoixuatban(rs.getString(4));
                sach.setNamxuatban(rs.getString(5));
                sach.setLoai(rs.getString(6));
                list.add(sach);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<Sach> getListSachTheoTen(String ten){
        ArrayList<Sach> list = new ArrayList<>();
        String querry = "SELECT * FROM dbSach where TenSach Like N'%"+ten+"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Sach sach = new Sach();
                sach.setMasach(rs.getString(1));
                sach.setTensach(rs.getString(2));
                sach.setTentacgia(rs.getString(3));
                sach.setNoixuatban(rs.getString(4));
                sach.setNamxuatban(rs.getString(5));
                sach.setLoai(rs.getString(6));
                list.add(sach);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<Sach> getListSachTheoTenLoai(String ten,String loai){
        ArrayList<Sach> list = new ArrayList<>();
        String querry = "SELECT * FROM dbSach where TenSach Like N'%"+ten+"%'and Loai = N'"+loai+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Sach sach = new Sach();
                sach.setMasach(rs.getString(1));
                sach.setTensach(rs.getString(2));
                sach.setTentacgia(rs.getString(3));
                sach.setNoixuatban(rs.getString(4));
                sach.setNamxuatban(rs.getString(5));
                sach.setLoai(rs.getString(6));
                list.add(sach);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
