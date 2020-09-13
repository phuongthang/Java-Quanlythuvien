/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.Date;

/**
 *
 * @author Phuong Thang
 */
public class PhieuTra {

    public PhieuTra() {
    }

    public PhieuTra(String madocgia, String tendocgia, Date ngaysinh, String diachi, String sdt, String nhom, String sophieumuon,Date ngaymuon) {
        this.madocgia = madocgia;
        this.tendocgia = tendocgia;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.nhom = nhom;
        this.sophieumuon = sophieumuon;
        this.ngaymuon = ngaymuon;
    }

    public String getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(String madocgia) {
        this.madocgia = madocgia;
    }

    public String getTendocgia() {
        return tendocgia;
    }

    public void setTendocgia(String tendocgia) {
        this.tendocgia = tendocgia;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getSophieumuon() {
        return sophieumuon;
    }

    public void setSophieumuon(String sophieumuon) {
        this.sophieumuon = sophieumuon;
    }
    private String madocgia,tendocgia,diachi,sdt,nhom,sophieumuon;
    private Date ngaysinh;
    private Date ngaymuon;

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }
}
