package com.sahaf.data;

import lambda.stream_kitapci.models.Kitap;
import lambda.stream_kitapci.models.Yayinevi;
import lambda.stream_kitapci.models.Yazar;

import java.util.ArrayList;
import java.util.List;

public class Depo {

    static List<Kitap> kitapListesi = new ArrayList<>();
    static List<Yazar> yazarListesi = new ArrayList<>();
    static List<Yayinevi> yayineviListesi = new ArrayList<>();

    // ================ VERI EKLEME ===================///
    // yazar eklemek icin
    static void yazarEkle() {

        Yazar yazar1 = new Yazar("Ali", true, 30);
        Yazar yazar2 = new Yazar("Ali", true, 30);
        Yazar yazar3 = new Yazar("Ali", true, 30);
        Yazar yazar4 = new Yazar("Ali", true, 30);
        Yazar yazar5 = new Yazar("Ali", true, 30);
        Yazar yazar6 = new Yazar("Ali", true, 30);
        Yazar yazar7 = new Yazar(null, null, null);
        yazarListesi.add(yazar1);
        yazarListesi.add(yazar1);
    //    ...
        yazarListesi.add(yazar7);
    }

    // yayin evi ekle
    static void yayineviEkle() {

        Yayinevi yayinevi1 = new Yayinevi("Atlas","Istanbul");
        Yayinevi yayinevi2 = new Yayinevi("Atlas","Istanbul");
        Yayinevi yayinevi3 = new Yayinevi("Atlas","Istanbul");
        Yayinevi yayinevi4 = new Yayinevi("Atlas","Istanbul");
        Yayinevi yayinevi5 = new Yayinevi("Atlas","Istanbul");
        yayineviListesi.add(yayinevi1);
    }

    // kitap ekle
    static void kitapEkle() {
        Kitap kitap1 = new Kitap("Ali Ata Bak", 12.0,true,yazarListesi.get(0), yayineviListesi.get(0));
        kitapListesi.add(kitap1);

    }


    /// ASAGI KISIM AYRI
    public static List<Yazar> yazarlar() {
        yazarEkle();
        return yazarListesi;
    }



    public static List<Yayinevi> yayinevleri() {
        yayineviEkle();
        return yayineviListesi;
    }

    public static List<Kitap> kitaplar() {
        return kitapListesi;
    }

}
