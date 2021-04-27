package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;

import java.util.ArrayList;
import java.util.List;

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

    }

}
