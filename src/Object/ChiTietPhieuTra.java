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
public class ChiTietPhieuTra {

    public ChiTietPhieuTra() {
    }

    public String getSophieutra() {
        return sophieutra;
    }

    public void setSophieutra(String sophieutra) {
        this.sophieutra = sophieutra;
    }

    public String getMabandoc() {
        return mabandoc;
    }

    public void setMabandoc(String mabandoc) {
        this.mabandoc = mabandoc;
    }

    public String getSophieumuon() {
        return sophieumuon;
    }

    public void setSophieumuon(String sophieumuon) {
        this.sophieumuon = sophieumuon;
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

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    private String sophieutra;
    private String mabandoc;
    private String sophieumuon;
    private Date ngaytra;
    private String masach;
    private String tinhtrang;
}
