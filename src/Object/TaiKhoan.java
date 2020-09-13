/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Phuong Thang
 */
public class TaiKhoan {

    public TaiKhoan() {
    }

    public TaiKhoan(String taikhoan, String matkhau, String quyentruycap) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.quyentruycap = quyentruycap;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    public String getQuyentruycap() {
        return quyentruycap;
    }

    public void setQuyentruycap(String quyentruycap) {
        this.quyentruycap = quyentruycap;
    }
    private  String taikhoan;
    private  String matkhau;
    private  String quyentruycap;
}
