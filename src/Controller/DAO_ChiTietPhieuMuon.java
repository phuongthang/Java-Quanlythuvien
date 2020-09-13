/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Object.DocGia;
import Object.PhieuMuon;
import Object.Sach;
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
public class DAO_ChiTietPhieuMuon {
    private Connection conn;
    public DAO_ChiTietPhieuMuon()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    }
    public ArrayList<DocGia> TimDocGia(String truyvan){
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
    public ArrayList<Sach> TimSach(String truyvan){
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
    
    public ArrayList<PhieuMuon> getListPhieuMuon(String sophieumuon){
        ArrayList<PhieuMuon> list = new ArrayList<>();
        String querry = "select dbPhieuMuon.Sophieumuon,dbDocGia.madocgia,tendocgia,ngaymuon,ngaytra,dbSach.masach,tensach from dbPhieuMuon,dbDocGia,dbSach,dbChiTietPM where dbPhieuMuon.MaDocGia = dbDocGia.MaDocGia and dbSach.MaSach = dbChiTietPM.MaSach and dbChiTietPM.SoPhieuMuon = dbPhieuMuon.SoPhieuMuon and dbPhieuMuon.SoPhieuMuon = '"+sophieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                PhieuMuon phieumuon = new PhieuMuon();
                phieumuon.setMaphieumuon(rs.getString(1));
                phieumuon.setMadocgia(rs.getString(2));
                phieumuon.setTendocgia(rs.getString(3));
                phieumuon.setNgaymuon(rs.getDate(4));
                phieumuon.setNgaytra(rs.getDate(5));
                phieumuon.setMasach(rs.getString(6));
                phieumuon.setTensach(rs.getString(7));
                list.add(phieumuon);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public boolean addPhieuMuon(PhieuMuon phieumuon)
    {
        String querry = "INSERT INTO dbPhieuMuon(SoPhieuMuon,NgayMuon,NgayTra) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, phieumuon.getMaphieumuon());
            ps.setDate(2, new Date(phieumuon.getNgaymuon().getTime()));
            ps.setDate(3, new Date(phieumuon.getNgaytra().getTime()));
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updatePMDocGia(String maphieumuon, String madocgia)
    {
        String querry = "UPDATE dbPhieuMuon SET MaDocGia='"+madocgia+"' where sophieumuon = '"+maphieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean addChiTietPM(String maphieumuon,String masach)
    {
        String querry = "INSERT INTO dbChiTietPM(Sophieumuon,Masach) Values('"+maphieumuon+"','"+masach+"')";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updatePM(PhieuMuon phieumuon)
    {
        String querry = "UPDATE dbPhieuMuon SET MaDocGia=?, NgayTra = ? WHERE Sophieumuon = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, phieumuon.getMadocgia());
            ps.setDate(2, new Date(phieumuon.getNgaytra().getTime()));
            ps.setString(3, phieumuon.getMaphieumuon());         
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deletePhieuMuon(String sophieumuon)
    {
        String querry = "DELETE FROM dbPhieuMuon WHERE Sophieumuon='"+sophieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteCTPhieuMuon(String masach,String sophieumuon)
    {
        String querry = "DELETE FROM dbChiTietPM WHERE Masach='"+masach+"' and Sophieumuon = '"+sophieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteCTPM(String sophieumuon)
    {
        String querry = "DELETE FROM dbChiTietPM WHERE Sophieumuon = '"+sophieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deletePM(String sophieumuon)
    {
        String querry = "DELETE FROM dbPhieuMuon WHERE Sophieumuon = '"+sophieumuon+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
