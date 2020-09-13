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
public class PhieuMuon {

    public PhieuMuon() {
    }

    public PhieuMuon(String maphieumuon, String madocgia, String tendocgia, Date ngaymuon, Date ngaytra, String masach, String tensach) {
        this.maphieumuon = maphieumuon;
        this.madocgia = madocgia;
        this.tendocgia = tendocgia;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.masach = masach;
        this.tensach = tensach;
    }

    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
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

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    private String maphieumuon;
    private String madocgia;
    private String tendocgia;
    private Date ngaymuon;
    private Date ngaytra;
    private String masach;
    private String tensach;
}
