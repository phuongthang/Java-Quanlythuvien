/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Phuong Thang
 */
public class DAO_DangKy {
    private Connection conn;
    public DAO_DangKy()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    }
    public boolean DangKy(String username, String password, String quyentruycap)
    {
        String querry = "Insert Into dbNguoiDung(TaiKhoan, MatKhau, QuyenTruyCap) Values('"+username+"','"+password+"','"+quyentruycap+"')";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public String Sosanh(String username){
        String check = "";
        String querry = "Select count(*) from dbNguoiDung where TaiKhoan = '"+username+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                check = rs.getString(1);
                
                
            }
        } catch (Exception e) {
        }
        return check;
        
    }
}
