package com.sahaf.models;

public class Yayinevi {
    String yayineviAdi;
    String yayineviYeri;

    public Yayinevi(String yayineviAdi, String yayineviYeri) {
        this.yayineviAdi = yayineviAdi;
        this.yayineviYeri = yayineviYeri;
    }

    public String getYayineviAdi() {
        return yayineviAdi;
    }

    public void setYayineviAdi(String yayineviAdi) {
        this.yayineviAdi = yayineviAdi;
    }

    public String getYayineviYeri() {
        return yayineviYeri;
    }

    public void setYayineviYeri(String yayineviYeri) {
        this.yayineviYeri = yayineviYeri;
    }

    @Override
    public String toString() {
        return "Yayinevi{" +
                "yayineviAdi='" + yayineviAdi + '\'' +
                ", yayineviYeri='" + yayineviYeri + '\'' +
                '}';
    }
}
