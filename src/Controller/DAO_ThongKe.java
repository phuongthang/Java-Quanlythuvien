/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Object.ThongKe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Phuong Thang
 */
public class DAO_ThongKe {
    private Connection conn;
    public DAO_ThongKe()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    } 
    public ArrayList<ThongKe> ThongKeLoaiSach(){
        ArrayList<ThongKe> list = new ArrayList<>();
        String querry = "select loai,count(*) as soluong from dbsach group by loai";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ThongKe tk = new ThongKe();
                tk.setMa(rs.getString(1));
                tk.setSoluong(rs.getString(2));
                list.add(tk);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<ThongKe> ThongKeDocGia(String start, String end){
        ArrayList<ThongKe> list = new ArrayList<>();
        String querry = "select nhombandoc,count(*) as soluong from dbdocgia,dbphieumuon where dbdocgia.MaDocGia = dbPhieuMuon.MaDocGia and NgayMuon between '"+start+"' and '"+end+"'  group by NhomBanDoc order by soluong desc";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ThongKe tk = new ThongKe();
                tk.setMa(rs.getString(1));
                tk.setSoluong(rs.getString(2));
                list.add(tk);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<ThongKe> ThongKeLuotMuon(String start, String end){
        ArrayList<ThongKe> list = new ArrayList<>();
        String querry = "select loai,count(*) as soluong from dbsach,dbphieumuon,dbchitietpm where dbsach.masach = dbChiTietPM.MaSach and dbchitietpm.SoPhieuMuon = dbPhieuMuon.SoPhieuMuon and NgayMuon between '"+start+"' and '"+end+"' group by loai order by soluong desc";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ThongKe tk = new ThongKe();
                tk.setMa(rs.getString(1));
                tk.setSoluong(rs.getString(2));
                list.add(tk);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<ThongKe> ThongKeDocGiaAll(){
        ArrayList<ThongKe> list = new ArrayList<>();
        String querry = "select nhombandoc,count(*) as soluong from dbdocgia,dbphieumuon where dbdocgia.MaDocGia = dbPhieuMuon.MaDocGia  group by NhomBanDoc order by soluong desc";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ThongKe tk = new ThongKe();
                tk.setMa(rs.getString(1));
                tk.setSoluong(rs.getString(2));
                list.add(tk);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public ArrayList<ThongKe> ThongKeLuotMuonAll(){
        ArrayList<ThongKe> list = new ArrayList<>();
        String querry = "select loai,count(*) as soluong from dbsach,dbphieumuon,dbchitietpm where dbsach.masach = dbChiTietPM.MaSach and dbchitietpm.SoPhieuMuon = dbPhieuMuon.SoPhieuMuon group by loai order by soluong desc";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ThongKe tk = new ThongKe();
                tk.setMa(rs.getString(1));
                tk.setSoluong(rs.getString(2));
                list.add(tk);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
