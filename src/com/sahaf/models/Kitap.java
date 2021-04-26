package com.sahaf.models;

public class Kitap {
    String kitapAdi;
    Double KitapFiyati;
    Boolean bestSeller;
    Yazar yazar;
    Yayinevi yayinevi;

    public Kitap(String kitapAdi, Double kitapFiyati, Boolean bestSeller, Yazar yazar, Yayinevi yayinevi) {
        this.kitapAdi = kitapAdi;
        KitapFiyati = kitapFiyati;
        this.bestSeller = bestSeller;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public Double getKitapFiyati() {
        return KitapFiyati;
    }

    public void setKitapFiyati(Double kitapFiyati) {
        KitapFiyati = kitapFiyati;
    }

    public Boolean getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public Yayinevi getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(Yayinevi yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", KitapFiyati=" + KitapFiyati +
                ", popularite=" + bestSeller +
                ", yazar=" + yazar +
                ", yayinevi=" + yayinevi +
                '}';
    }
}
