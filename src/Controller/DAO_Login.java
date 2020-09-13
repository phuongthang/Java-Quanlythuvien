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
public class DAO_Login {
    private Connection conn;
    public DAO_Login()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DAO_Connection.url
                    + DAO_Connection.username + DAO_Connection.password);
        } catch (Exception e) {
        }
    }
    public boolean Login(String username, String password)
    {
        String querry = "SELECT * FROM dbNguoiDung WHERE TaiKhoan ='"+username+"' AND MatKhau = '"+password+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(querry);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                return true;
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    public String QuyenTruyCap(String username){
        String check = "";
        String querry = "Select quyentruycap from dbNguoiDung where TaiKhoan = '"+username+"'";
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
