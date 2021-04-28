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

        Yayinevi yayinevi1 = new Yayinevi("Atlas Yayinevi", "Istanbul");
        Yayinevi yayinevi2 = new Yayinevi("Dinar Yayinevi", "Yozgat");
        Yayinevi yayinevi3 = new Yayinevi("Selendi Yayinevi", "Ankara");
        Yayinevi yayinevi4 = new Yayinevi("Tavas Yayinevi", "Istanbul");
        Yayinevi yayinevi5 = new Yayinevi("Arsin Yayinevi", "Ankara");
        Yayinevi yayinevi6 = new Yayinevi("Baskil Yayinevi", "Izmir");
        Yayinevi yayinevi7 = new Yayinevi("Ladik Yayinevi", "Ankara");
        Yayinevi yayinevi8 = new Yayinevi("Demirci Yayinevi", "Izmir");
        Yayinevi yayinevi9 = new Yayinevi("Artova Yayinevi", "Izmir");
        Yayinevi yayinevi10 = new Yayinevi("Bala Yayinevi", "Izmir");
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
        yazarlar();
        yayinevleri();
        Yazar yazar = null;
        Yayinevi yayinevi = null;
        String kitapAdi= "";
        Double kitapFiyat = 0.0;
        Boolean isBestseller = false;

        String [] kitapAdlari = {"SEFİLLER","YABAN","DÖNÜŞÜM", "BUNUN ADI FİNDEL","SAKIZ SARDUNYA", "SADAKO",
                "YALNIZ EFE", "TOM SAWYER", "BEYAZ YELE", "MUTLU PRENS", "GANGA","ESRARLI KÖŞK","LATA ŞİBA","EYVAH KİTAP",
                "87 OĞUZ","MATİLLA","KURGAN","AY’I BOYAMAK","PETEY","KIRK GRAM TEBESSÜM","SANA BİR MÜJDEM VAR",
                "PATENLİ KIZ","EJDER KRAL","KARA OKLAR ÇETESİ","KUM SAATİ","PARADOKYA SERİSİ", "DOLUNAY DEDEKTİFLERİ 1",
                "ANILARDAN ÖYKÜLER", "SINEKLI BAKKAL", "VADIDEKI ZAMBAK"};
        Double [] kitapFiyatlari = {12.0, 17.50,10.0,5.0,33.0,25.0,45.0,80.0,112.0,102.35,1.0,10.35,66.0,61.25,17.25,
                9.0,8.0,5.6,55.7,30.0,11.45,150.32,300.33,45.88,58.02,36.45,25.0,45.0,12.0,17.50
        };

        Boolean [] bestSellers = {true, true, false, true, false, false, false, true, true, false,true, false, true,false,false,true,true,false,false,false,false,
                true, true, true,false, true,true,false,true,false
        };

        int indexYY = 0;
        int kitapIndex = 0;
        for (int i = 0; i < 30; i++) {
            yazar = yazarListesi.get(indexYY);
            yayinevi = yayineviListesi.get(indexYY++);

            indexYY = indexYY==10 ? 0 : indexYY;

            kitapAdi = kitapAdlari[kitapIndex];
            kitapFiyat = kitapFiyatlari[kitapIndex];
            isBestseller = bestSellers[kitapIndex++];

            kitapListesi.add(new Kitap(kitapAdi, kitapFiyat, isBestseller, yazar, yayinevi));
        }

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
        kitapEkle();
        return kitapListesi;
        //gunluk calisma

    }

}
