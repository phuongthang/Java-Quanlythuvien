/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Object.ChiTietPhieuTra;
import Object.DocGia;
import Object.PhieuTra;
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
public class DAO_PhieuTra {
    private Connection conn;
    public DAO_PhieuTra()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    }
    public ArrayList<PhieuTra> getListDocGia(String ten){
        ArrayList<PhieuTra> list = new ArrayList<>();
        String querry = "select dbDocGia.madocgia,tendocgia,ngaysinh,diachi,dienthoai,nhombandoc,sophieumuon,ngaymuon from dbdocgia,dbphieumuon where dbDocGia.madocgia = dbPhieuMuon.MaDocGia and tenDocgia Like N'%"+ten+"%'and SoPhieuMuon not in (select SoPhieuMuon from dbPhieuTra ) ";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                PhieuTra phieutra = new PhieuTra();
                phieutra.setMadocgia(rs.getString(1));
                phieutra.setTendocgia(rs.getString(2));
                phieutra.setNgaysinh(rs.getDate(3));
                phieutra.setDiachi(rs.getString(4));
                phieutra.setSdt(rs.getString(5));
                phieutra.setNhom(rs.getString(6));
                phieutra.setSophieumuon(rs.getString(7));
                phieutra.setNgaymuon(rs.getDate(8));
                list.add(phieutra);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    public boolean addPhieuTra(ChiTietPhieuTra ctphieutra)
    {
        String querry = "INSERT INTO dbPhieuTra(SoPhieuTra,MaDocGia,SoPhieuMuon,NgayTra) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, ctphieutra.getSophieutra());
            ps.setString(2, ctphieutra.getMabandoc());
            ps.setString(3, ctphieutra.getSophieumuon());
            ps.setDate(4, new Date(ctphieutra.getNgaytra().getTime()));
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean addCTPhieuTra(ChiTietPhieuTra ctphieutra)
    {
        String querry = "INSERT INTO dbChiTietPT(SoPhieuTra,MaSach,TinhTrang) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, ctphieutra.getSophieutra());
            ps.setString(2, ctphieutra.getMasach());
            ps.setString(3, ctphieutra.getTinhtrang());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
