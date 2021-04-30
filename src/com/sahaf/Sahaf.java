package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sahaf {

    static List<Kitap> kitapListesi = new ArrayList<>();

    static {
        kitapListesi = Depo.kitaplar();
    }

    public static void main(String[] args) {

//        Bestseller olan kitaplari listele
        kitapListesi.stream().filter(t -> t.getBestSeller() == true).forEach(System.out::println);

//        Bestseller olan kitap sayisi kac tane
//        yayın evi istanbul adresli olanlar
//        yayın evi izmir adresli olanlar
//        kitap sayısı 5 ve üzeri olan yazar sayıları
//        kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb)
//        yayın evinden çıkan " L" harfinden sonra başlayan kitap isimleri
//        yayın evi bazında bestseller olan kitaplar
//        en cok bestselleri, olan yayınevi
//        yazar bazında en pahalı kitap sahibi yazar ve yayın evi

        /*---------------@Aziz-----------------*/
        //1. yazar ismi A ile baslayan yazarlarin toplam kitap sayisi
        System.out.println("\n======================================");

        System.out.println("\nISMI A ile BASLAYAN YAZARLARIN TOPLAM KITAP SAYISI: "+kitapListesi.
                stream().
                filter(t->t.getYazar().getYazarAdi().startsWith("A")).
                distinct().mapToInt(t->t.getYazar().getKitapSayisi()).sum());

        //2. kitap isminda numerik karakter bulunduran kitaplarin listesi

        //3. kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi
        System.out.println("\n======================================");
        System.out.println("ISMI IKI VEYA DAHA FAZLA KELIMEDEN OLUSAN KITAPLARIN LISTESI: ");
        kitapListesi.
                stream().
                filter(t->t.getKitapAdi().contains(" ")).
                forEach(t-> System.out.println(t.getKitapAdi()));

        //4. depo.daki tum kitaplarin toplam fiyati
        System.out.println("\n======================================");

        System.out.println("DEPODAKI TUM KITAPLARIN TOPLAM FIYATI: "+kitapListesi.
                stream().
                mapToDouble(t->t.getKitapFiyati()).
                sum());

        //5. depo.daki tum kitaplarin fiyat ortalamasi
        System.out.println("\n======================================");

        System.out.println("DEPODAKI TUM KITAPLARIN FIYAT ORTALAMASI: ");
        kitapListesi.
                stream().
                mapToDouble(t->t.getKitapFiyati()).average().
                ifPresent(t-> System.out.println(t));

        //6. depo.daki kitaplarin ortalamasinin ustunde olan kitaplar
        System.out.println("\n======================================");
        System.out.println("DEPODAKI KITAPALRIN ORTALAMASININ SUTUNDE OLAN KITAPLAR: ");
        double ortalama= kitapListesi.stream().collect(Collectors.averagingDouble(Kitap::getKitapFiyati));
        kitapListesi.
                stream().
                filter(t->t.getKitapFiyati()>ortalama).
                forEach(t-> System.out.println(t.getKitapAdi()+ " "+ t.getKitapFiyati()));

        //7. fiyati en yuksek olan kitap
        System.out.println("\n======================================");
        System.out.println("FIYATI EN YUKSEK OLAN KITAP: ");
        kitapListesi.
                stream().
                sorted(Comparator.comparing(Kitap::getKitapFiyati).reversed()).
                limit(1).
                forEach(t-> System.out.println(t.getKitapAdi()+ " "+ t.getKitapFiyati()));


        //8. best seller olup en ucuz olan kitap
        System.out.println("\n======================================");
        System.out.println("BESTSELER OLUP EN UCUZ OLAN KITAP: ");
        kitapListesi.
                stream().
                filter(Kitap::getBestSeller).sorted(Comparator.comparing(t->t.getKitapFiyati())).
                limit(1).
                forEach(t-> System.out.println(t.getKitapAdi()+ " "+ t.getKitapFiyati()));


        //9. yayinevi izmir olan kitaplarin yazarlarinin listesi
        System.out.println("\n======================================");
        System.out.println("YAYIN EVI IZMIR OLAN KITAPLARIN YAZARLARI: ");
        kitapListesi.
                stream().filter(t->t.getYayinevi().getYayineviYeri().equalsIgnoreCase("izmir")).
                forEach(t-> System.out.println(t.getYazar().getYazarAdi()+ " "+ t.getYayinevi().getYayineviYeri()));


        //10. yayinevi ankara olan kitaplarin fiyat ortalamasi
        System.out.println("\n======================================");
        System.out.println("YAYIN EVI ANKARA OLAN KITAPLARIN FIYAT ORTALAMASI: ");
        kitapListesi.
                stream().filter(t->t.getYayinevi().getYayineviYeri().equalsIgnoreCase("Ankara")).
                mapToDouble(Kitap::getKitapFiyati).
                average().
                ifPresent(t-> System.out.println(t));



        //11. ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir
        //12. hangi sehride daha fazla best seller kitap var...

    }

}
