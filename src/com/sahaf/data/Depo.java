package com.sahaf.data;



import com.sahaf.models.Kitap;
import com.sahaf.models.Yayinevi;
import com.sahaf.models.Yazar;

import java.util.*;
import java.util.List;

public class Depo {

    static List<Kitap> kitapListesi = new ArrayList<>();
    static List<Yazar> yazarListesi = new ArrayList<>();
    static List<Yayinevi> yayineviListesi = new ArrayList<>();

    // ================ VERI EKLEME ===================///
    // yazar eklemek icin
    static void yazarEkle() {
        Yazar yazar1 = new Yazar("Ali Yanki", false, 6);
        Yazar yazar2 = new Yazar("Nisa BEREN", true, 7);
        Yazar yazar3 = new Yazar("Deniz PERDE", false, 11);
        Yazar yazar4 = new Yazar("Arin BARIN", false, 7);
        Yazar yazar5 = new Yazar("Yusuf Ali BOZTEPE", true, 42);
        Yazar yazar6 = new Yazar("Meliha AKKULAK", true, 2);
        Yazar yazar7 = new Yazar("Serhat HOSAN", true, 5);
        Yazar yazar8 = new Yazar("Polat SARIYILDIZ", false, 9);
        Yazar yazar9 = new Yazar("Yusuf UFUK", true, 1);
        Yazar yazar10 = new Yazar("Hatice MACUN", false, 5);
        yazarListesi.add(yazar1);
        yazarListesi.add(yazar2);
        yazarListesi.add(yazar3);
        yazarListesi.add(yazar4);
        yazarListesi.add(yazar5);
        yazarListesi.add(yazar6);
        yazarListesi.add(yazar7);
        yazarListesi.add(yazar8);
        yazarListesi.add(yazar9);
        yazarListesi.add(yazar10);




    }

    // yayin evi ekle
    static void yayineviEkle() {

        Yayinevi yayinevi1 = new Yayinevi("Atlas Yayinevi","Istanbul");
        Yayinevi yayinevi2 = new Yayinevi("Dinar Yayinevi","Yozgat");
        Yayinevi yayinevi3 = new Yayinevi("Selendi Yayinevi","Ankara");
        Yayinevi yayinevi4 = new Yayinevi("Tavas Yayinevi","Istanbul");
        Yayinevi yayinevi5 = new Yayinevi("Arsin Yayinevi","Ankara");
        Yayinevi yayinevi6 = new Yayinevi("Baskil Yayinevi","Izmir");
        Yayinevi yayinevi7 = new Yayinevi("Ladik Yayinevi","Ankara");
        Yayinevi yayinevi8 = new Yayinevi("Demirci Yayinevi","Izmir");
        Yayinevi yayinevi9 = new Yayinevi("Artova Yayinevi","Izmir");
        Yayinevi yayinevi10 = new Yayinevi("Bala Yayinevi","Izmir");
        yayineviListesi.add(yayinevi1);
        yayineviListesi.add(yayinevi2);
        yayineviListesi.add(yayinevi3);
        yayineviListesi.add(yayinevi4);
        yayineviListesi.add(yayinevi5);
        yayineviListesi.add(yayinevi6);
        yayineviListesi.add(yayinevi7);
        yayineviListesi.add(yayinevi8);
        yayineviListesi.add(yayinevi9);
        yayineviListesi.add(yayinevi10);
    }

    // kitap ekle
    static void kitapEkle() {
        Kitap kitap1 = new Kitap("SEFİLLER", 12.0,true,yazarListesi.get(0), yayineviListesi.get(0));
        Kitap kitap2 = new Kitap("YABAN", 17.50,true,yazarListesi.get(1), yayineviListesi.get(0));
        Kitap kitap3 = new Kitap("DÖNÜŞÜM", 10.0,true,yazarListesi.get(2), yayineviListesi.get(1));
        Kitap kitap4 = new Kitap("BUNUN ADI FİNDEL", 5.0,true,yazarListesi.get(3), yayineviListesi.get(1));
        Kitap kitap5 = new Kitap("SAKIZ SARDUNYA", 33.0,true,yazarListesi.get(4), yayineviListesi.get(2));
        Kitap kitap6 = new Kitap("SADAKO", 25.0,true,yazarListesi.get(5), yayineviListesi.get(3));
        Kitap kitap7 = new Kitap("YALNIZ EFE", 45.0,false,yazarListesi.get(6), yayineviListesi.get(4));
        Kitap kitap8 = new Kitap("TOM SAWYER", 80.0,true,yazarListesi.get(7), yayineviListesi.get(6));
        Kitap kitap9 = new Kitap("BEYAZ YELE", 112.0,true,yazarListesi.get(8), yayineviListesi.get(5));
        Kitap kitap10 = new Kitap("MUTLU PRENS", 102.35,false,yazarListesi.get(9), yayineviListesi.get(10));
        Kitap kitap11 = new Kitap("GANGA", 1.0,true,yazarListesi.get(10), yayineviListesi.get(2));
        Kitap kitap12 = new Kitap("ESRARLI KÖŞK", 10.35,true,yazarListesi.get(10), yayineviListesi.get(2));
        Kitap kitap13 = new Kitap("LATA ŞİBA", 66.0,false,yazarListesi.get(10), yayineviListesi.get(3));
        Kitap kitap14 = new Kitap("EYVAH KİTAP", 61.25,true,yazarListesi.get(10), yayineviListesi.get(6));
        Kitap kitap15 = new Kitap("87 OĞUZ", 18.0,false,yazarListesi.get(10), yayineviListesi.get(4));
        Kitap kitap16 = new Kitap("SİYAH LALE", 20.25,true,yazarListesi.get(5), yayineviListesi.get(2));
        Kitap kitap17 = new Kitap("YASEMEN", 9.0,true,yazarListesi.get(6), yayineviListesi.get(5));
        Kitap kitap18 = new Kitap("MATİLLA", 8.0,false,yazarListesi.get(7), yayineviListesi.get(5));
        Kitap kitap19 = new Kitap("KURGAN", 84.15,false,yazarListesi.get(8), yayineviListesi.get(2));
        Kitap kitap20 = new Kitap("AY’I BOYAMAK", 63.85,true,yazarListesi.get(9), yayineviListesi.get(2));
        Kitap kitap21 = new Kitap("PETEY", 4.0,true,yazarListesi.get(3), yayineviListesi.get(6));
        Kitap kitap22 = new Kitap("KIRK GRAM TEBESSÜM", 41.0,true,yazarListesi.get(3), yayineviListesi.get(6));
        Kitap kitap23 = new Kitap("SANA BİR MÜJDEM VAR", 64.0,true,yazarListesi.get(4), yayineviListesi.get(8));
        Kitap kitap24 = new Kitap("PATENLİ KIZ", 11.0,false,yazarListesi.get(4), yayineviListesi.get(8));
        Kitap kitap25 = new Kitap("EJDER KRAL", 13.0,true,yazarListesi.get(5), yayineviListesi.get(10));
        Kitap kitap26 = new Kitap("KARA OKLAR ÇETESİ", 84.5,true,yazarListesi.get(5), yayineviListesi.get(10));
        Kitap kitap27 = new Kitap("KUM SAATİ", 84.0,false,yazarListesi.get(6), yayineviListesi.get(9));
        Kitap kitap28 = new Kitap("PARADOKYA SERİSİ", 8.6,true,yazarListesi.get(6), yayineviListesi.get(9));
        Kitap kitap30 = new Kitap("DOLUNAY DEDEKTİFLERİ 1", 84.25,true,yazarListesi.get(7), yayineviListesi.get(2));
        Kitap kitap29 = new Kitap("ANILARDAN ÖYKÜLER", 4.35,false,yazarListesi.get(7), yayineviListesi.get(2));
        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);
        kitapListesi.add(kitap3);
        kitapListesi.add(kitap4);
        kitapListesi.add(kitap5);
        kitapListesi.add(kitap6);
        kitapListesi.add(kitap7);
        kitapListesi.add(kitap8);
        kitapListesi.add(kitap9);
        kitapListesi.add(kitap10);
        kitapListesi.add(kitap11);
        kitapListesi.add(kitap12);
        kitapListesi.add(kitap13);
        kitapListesi.add(kitap14);
        kitapListesi.add(kitap15);
        kitapListesi.add(kitap16);
        kitapListesi.add(kitap17);
        kitapListesi.add(kitap18);
        kitapListesi.add(kitap19);
        kitapListesi.add(kitap20);
        kitapListesi.add(kitap21);
        kitapListesi.add(kitap22);
        kitapListesi.add(kitap23);
        kitapListesi.add(kitap24);
        kitapListesi.add(kitap25);
        kitapListesi.add(kitap26);
        kitapListesi.add(kitap27);
        kitapListesi.add(kitap28);
        kitapListesi.add(kitap29);
        kitapListesi.add(kitap30);

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
