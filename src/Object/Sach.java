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
public class Sach {

    public Sach(String masach, String tensach, String tentacgia, String noixuatban, String namxuatban, String loai) {
        this.masach = masach;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.noixuatban = noixuatban;
        this.namxuatban = namxuatban;
        this.loai = loai;
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

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNoixuatban() {
        return noixuatban;
    }

    public void setNoixuatban(String noixuatban) {
        this.noixuatban = noixuatban;
    }

    public String getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(String namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Sach() {
    }
    private String masach;
    private String tensach;
    private String tentacgia;
    private String noixuatban;
    private String namxuatban;
    private String loai;
}
