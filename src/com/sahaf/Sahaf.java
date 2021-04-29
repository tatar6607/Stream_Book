package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;

import java.util.*;
import java.util.stream.Collectors;

public class Sahaf {

    static List<Kitap> kitapListesi = new ArrayList<>();

    static {
        kitapListesi = Depo.kitaplar();
    }

    public static void main(String[] args) {

//        Bestseller olan kitaplari listele
 //       kitapListesi.stream().filter(t -> t.getBestSeller() == true).forEach(System.out::println);
        System.out.println(kitapListesi.size());
//        Bestseller olan kitap sayisi kac tane
        System.out.println("Bestseller olan kitap sayisi kac tane: " +
                kitapListesi.stream().filter(x->x.getBestSeller().equals(true))
                        .count());
//        yayın evi istanbul adresli olanlar
        System.out.println("yayın evi istanbul adresli olanlar: " +
                kitapListesi.stream().filter(x -> x.getYayinevi().getYayineviYeri().equals("Istanbul")).count());
//        yayın evi izmir adresli olanlar
        System.out.println("yayın evi izmir adresli olanlar" +
                kitapListesi.stream().filter(x -> x.getYayinevi().getYayineviYeri().equals("Izmir")).count());
//        kitap sayısı 5 ve üzeri olan yazar sayıları
        System.out.println("kitap sayısı 5 ve üzeri olan yazar sayıları " +
                kitapListesi.stream().filter(x -> x.getYazar().getKitapSayisi() > 4).count());
//        kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb)
        System.out.println("kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb) " +
                kitapListesi.stream().filter(x -> x.getKitapFiyati() % 1 == 0)
                        .map(t -> t.getYazar().getYazarAdi()).collect(Collectors.toList()));
//        kitap fiyatları tam fiyat olmayn kitap yazarları sayisi (12,5 vb)
        System.out.println("kitap fiyatları tam fiyat olmayn kitap yazarların sayisi (12,5 vb) " +
                (int) kitapListesi.stream().filter(x -> x.getKitapFiyati() % 1 == 0)
                        .map(t -> t.getYazar().getYazarAdi()).count());
//        yayın evinden çıkan " L" harfinden sonra başlayan kitap isimleri
        System.out.println(" yayın evinden çıkan \" L\" harfinden sonra başlayan kitap isimleri " +
                kitapListesi.stream().filter(x -> x.getYayinevi()
                        .getYayineviAdi().charAt(0) > 'L')
                        .map(t -> t.getKitapAdi())
                        .collect(Collectors.toList()));
//        en cok bestselleri, olan yayınevi
        Map<String,Integer> yayineviBestSeller = new HashMap<>();
        List<String>bestSellers = kitapListesi.stream().filter(x->x.getBestSeller()==true).map(t->t.getYayinevi().getYayineviAdi()).collect(Collectors.toList());
        Map<String, Long> counts =
                bestSellers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);
//        yazar bazında en pahalı kitap sahibi yazar ve yayın evi

        /*---------------@Samet-----------------*/
        //1. yazar ismi A ile baslayan yazarlarin toplam kitap sayisi
        //2. kitap isminda numerik karakter bulunduran kitaplarin listesi
        //3. kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi
        //4. depo.daki tum kitaplarin toplam fiyati
        //5. depo.daki tum kitaplarin fiyat ortalamasi
        //6. depo.daki kitaplarin ortalamasinin ustunde olan kitaplar
        //7. fiyati en yuksek olan kitap
        //8. best seller olup en ucuz olan kitap
        //9. yayinevi izmir olan kitaplarin yazarlarinin listesi
        //10. yayinevi ankara olan kitaplarin fiyat ortalamasi
        //11. ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir
        //12. hangi sehride daha fazla best seller kitap var...

    }

}
