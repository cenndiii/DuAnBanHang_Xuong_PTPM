/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

/**
 *
 * @author tranp
 */
public class SanPhamModel {
    private int index;
    private String maSp,tenSp, namBan;
    private double trongLuong;
    private String mota;
    private int soLuong;
    private double giaNhap,giaBan;
    private double thanhTien;
    public SanPhamModel(int index, String maSp, String tenSp, String namBan, double trongLuong, String mota, int soLuong, double giaNhap, double giaBan) {
        this.index = index;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.namBan = namBan;
        this.trongLuong = trongLuong;
        this.mota = mota;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public SanPhamModel(int index, String maSp, String tenSp, int soLuong, double giaBan,double thanhTien) {
        this.index = index;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.thanhTien = thanhTien;
    }

    // Bang san pham
    public SanPhamModel() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getNamBan() {
        return namBan;
    }

    public void setNamBan(String namBan) {
        this.namBan = namBan;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    // bang gio hang

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
      
}
