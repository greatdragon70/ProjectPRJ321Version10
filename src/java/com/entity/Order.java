/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author huong karatedo
 */
public class Order {
    private String maDH;
    private int maBC;
    private String tenNguoiGui;
    private String diaChiGui;
    private int sdtGui;
    private String tenNguoiNhan;
    private String diaChiNhan;
    private String loaiHang;
    private float khoiLuong;
    private int sdtNhan;
    private float phiShip;
    private float phiThuHo;
    private float tongTien;
    private String guiTinh;

    public Order(String maDH, int maBC, String tenNguoiGui, String diaChiGui, int sdtGui, String tenNguoiNhan, String diaChiNhan, String loaiHang, float khoiLuong, int sdtNhan, float phiShip, float phiThuHo, float tongTien, String guiTinh) {
        this.maDH = maDH;
        this.maBC = maBC;
        this.tenNguoiGui = tenNguoiGui;
        this.diaChiGui = diaChiGui;
        this.sdtGui = sdtGui;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChiNhan = diaChiNhan;
        this.loaiHang = loaiHang;
        this.khoiLuong = khoiLuong;
        this.sdtNhan = sdtNhan;
        this.phiShip = phiShip;
        this.phiThuHo = phiThuHo;
        this.tongTien = tongTien;
        this.guiTinh = guiTinh;
    }

    
    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public int getMaBC() {
        return maBC;
    }

    public void setMaBC(int maBC) {
        this.maBC = maBC;
    }

    public String getTenNguoiGui() {
        return tenNguoiGui;
    }

    public void setTenNguoiGui(String tenNguoiGui) {
        this.tenNguoiGui = tenNguoiGui;
    }

    public String getDiaChiGui() {
        return diaChiGui;
    }

    public void setDiaChiGui(String diaChiGui) {
        this.diaChiGui = diaChiGui;
    }

    public int getSdtGui() {
        return sdtGui;
    }

    public void setSdtGui(int sdtGui) {
        this.sdtGui = sdtGui;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public int getSdtNhan() {
        return sdtNhan;
    }

    public void setSdtNhan(int sdtNhan) {
        this.sdtNhan = sdtNhan;
    }

    public float getPhiShip() {
        return phiShip;
    }

    public void setPhiShip(float phiShip) {
        this.phiShip = phiShip;
    }

    public float getPhiThuHo() {
        return phiThuHo;
    }

    public void setPhiThuHo(float phiThuHo) {
        this.phiThuHo = phiThuHo;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getGuiTinh() {
        return guiTinh;
    }

    public void setGuiTinh(String guiTinh) {
        this.guiTinh = guiTinh;
    }

   

}
