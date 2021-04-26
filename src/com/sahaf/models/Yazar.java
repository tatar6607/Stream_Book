package com.sahaf.models;

public class Yazar {
    String yazarAdi;
    Boolean yerliMi;
    Integer kitapSayisi;

    public Yazar(String yazarAdi, Boolean yerliMi, Integer kitapSayisi) {
        this.yazarAdi = yazarAdi;
        this.yerliMi = yerliMi;
        this.kitapSayisi = kitapSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public Boolean getYerliMi() {
        return yerliMi;
    }

    public void setYerliMi(Boolean yerliMi) {
        this.yerliMi = yerliMi;
    }

    public Integer getKitapSayisi() {
        return kitapSayisi;
    }

    public void setKitapSayisi(Integer kitapSayisi) {
        this.kitapSayisi = kitapSayisi;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "yazarAdi='" + yazarAdi + '\'' +
                ", yerliMi=" + yerliMi +
                ", kitapSayisi=" + kitapSayisi +
                '}';
    }
}
