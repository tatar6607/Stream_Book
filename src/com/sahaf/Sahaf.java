package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;

import java.util.ArrayList;
import java.util.List;
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
                kitapListesi.stream().filter(Kitap::getBestSeller)
                        .count());
//        yayın evi istanbul adresli olanlar
//        yayın evi izmir adresli olanlar
//        kitap sayısı 5 ve üzeri olan yazar sayıları
//        kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb)
//        yayın evinden çıkan " L" harfinden sonra başlayan kitap isimleri
//        yayın evi bazında bestseller olan kitaplar
//        en cok bestselleri, olan yayınevi
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
