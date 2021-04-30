package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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
        System.out.println("Bestseller olan kitap sayisi kac tane: " +"\n"+
                kitapListesi.stream().filter(x->x.getBestSeller().equals(true))
                        .count());
//        yayın evi istanbul adresli olanlar
        System.out.println("yayın evi istanbul adresli olanlar: " +"\n"+
                kitapListesi.stream().filter(x -> x.getYayinevi().getYayineviYeri().equals("Istanbul")).count());
//        yayın evi izmir adresli olanlar
        System.out.println("yayın evi izmir adresli olanlar" +"\n"+
                kitapListesi.stream().filter(x -> x.getYayinevi().getYayineviYeri().equals("Izmir")).count());
//        kitap sayısı 5 ve üzeri olan yazar sayıları
        System.out.println("kitap sayısı 5 ve üzeri olan yazar sayıları " +"\n"+
                kitapListesi.stream().filter(x -> x.getYazar().getKitapSayisi() > 4).count());
//        kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb)
        System.out.println("kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb) " +"\n"+
                kitapListesi.stream().filter(x -> x.getKitapFiyati() % 1 == 0)
                        .map(t -> t.getYazar().getYazarAdi()).collect(Collectors.toList()));
//        kitap fiyatları tam fiyat olmayn kitap yazarları sayisi (12,5 vb)
        System.out.println("kitap fiyatları tam fiyat olmayn kitap yazarların sayisi (12,5 vb) " +"\n"+
                (int) kitapListesi.stream().filter(x -> x.getKitapFiyati() % 1 == 0)
                        .map(t -> t.getYazar().getYazarAdi()).count());
//        yayın evinden çıkan " L" harfinden sonra başlayan kitap isimleri
        System.out.println(" yayın evinden çıkan \" L\" harfinden sonra başlayan kitap isimleri " +"\n"+
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
        double highestPrice = kitapListesi.stream().map(x -> x.getKitapFiyati()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);
        String writerWithHighsetPrice = kitapListesi.stream().filter(x->x.getKitapFiyati()==highestPrice).collect(Collectors.toList()).get(0).getKitapAdi();
        System.out.println(writerWithHighsetPrice+ " " + highestPrice);
        /*---------------@Samet-----------------*/
        //1. yazar ismi A ile baslayan yazarlarin toplam kitap sayisi
        System.out.println("yazar ismi A ile baslayan yazarlarin toplam kitap sayisi " +"\n"+
                kitapListesi.stream().filter(x -> x.getYazar().getYazarAdi().startsWith("A"))
                        .map(x -> x.getYazar()
                                .getKitapSayisi()).reduce(0, (x, y) -> (x + y)));
        //2. kitap isminda numerik karakter bulunduran kitaplarin listesi
        System.out.println("kitap isminda numerik karakter bulunduran kitaplarin listesi " +
                kitapListesi.stream().filter(x -> x.getKitapAdi().matches(".*\\d.*")).map(x->x.getKitapAdi())
                        .collect(Collectors.toList()));
        //3. kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi
        System.out.println("kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi " +"\n"+
                kitapListesi.stream().map(x -> x.getKitapAdi()).filter(kitapAdi -> kitapAdi.trim().contains(" "))
                .collect(Collectors.toList()));
        //4. depo.daki tum kitaplarin toplam fiyati
        double d  =   kitapListesi.stream().map(x -> x.getKitapFiyati()).reduce(0.0, (x, y) -> (x + y));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("depo.daki tum kitaplarin toplam fiyati "+df.format(d)+"\n");
        //5. depo.daki tum kitaplarin fiyat ortalamasi
        System.out.println("depo.daki tum kitaplarin fiyat ortalamasi "+ df.format(d/kitapListesi.size())+"\n");
        //6. depo.daki kitaplarin ortalamasinin ustunde olan kitaplar
        System.out.println("depo.daki kitaplarin ortalamasinin ustunde olan kitaplar "+ "\n" +
                kitapListesi.stream().filter(x -> x.getKitapFiyati() > d / kitapListesi.size())
                        .map(x -> x.getKitapAdi()).collect(Collectors.toList()));
        //7. fiyati en yuksek olan kitap
        System.out.println("fiyati en yuksek olan kitap " + "\n" +
                kitapListesi.stream().map(x -> x.getKitapFiyati()).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0));
        //8. best seller olup en ucuz olan kitap
        System.out.println("best seller olup en ucuz olan kitap "+ "\n" +
                kitapListesi.stream().filter(x -> x.getBestSeller()).
                        map(x -> x.getKitapFiyati()).sorted().
                        collect(Collectors.toList()).get(0));
        //9. yayinevi izmir olan kitaplarin yazarlarinin listesi
        System.out.println("yayinevi izmir olan kitaplarin yazarlarinin listesi " + "\n" +
                kitapListesi.stream().filter(x -> x.getYayinevi().getYayineviYeri()
                        .equals("Izmir")).map(x -> x.getYazar()
                        .getYazarAdi()).collect(Collectors.toList()));
        //10. yayinevi ankara olan kitaplarin fiyat ortalamasi
        long numberOfBooksFromAnkara = kitapListesi.stream().filter(x->x.getYayinevi().getYayineviYeri()
                .equals("Ankara")).map(x->x.getKitapFiyati()).count();
        double ortalamaAnkara = kitapListesi.stream().filter(x->x.getYayinevi().getYayineviYeri()
                .equals("Ankara")).map(x->x.getKitapFiyati()).reduce(0.0, (x, y) -> (x + y))/numberOfBooksFromAnkara;
        System.out.println("yayinevi ankara olan kitaplarin fiyat ortalamasi: " + "\n" +df.format(ortalamaAnkara));
        //11. ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir
        long numberOfBooksFromIstanbul = kitapListesi.stream().filter(x->x.getYayinevi().getYayineviYeri()
                .equals("Istanbul")).map(x->x.getKitapFiyati()).count();
        double ortalamaIstanbul = kitapListesi.stream().filter(x->x.getYayinevi().getYayineviYeri()
                .equals("Istanbul")).map(x->x.getKitapFiyati()).reduce(0.0, (x, y) -> (x + y))/numberOfBooksFromAnkara;
        System.out.println("yayinevi ankara olan kitaplarin fiyat ortalamasi: " + "\n" +df.format(ortalamaIstanbul));
            String result = ortalamaAnkara>ortalamaIstanbul?"ankara":"istanbul";
        System.out.println("ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir" + "\n" + result);
        //12. hangi sehride daha fazla best seller kitap var...
        long istanbul= kitapListesi.stream().filter(x->x.getBestSeller()).filter(x->x.getYayinevi().getYayineviYeri().equals("Istanbul")).count();
        long ankara= kitapListesi.stream().filter(x->x.getBestSeller()).filter(x->x.getYayinevi().getYayineviYeri().equals("Ankara")).count();
        long izmir= kitapListesi.stream().filter(x->x.getBestSeller()).filter(x->x.getYayinevi().getYayineviYeri().equals("Izmir")).count();
        if (istanbul > ankara && istanbul > izmir) {
            System.out.println("istanbul ist expensive");
        }

        if (ankara > istanbul && ankara > izmir) {
            System.out.println("ankara ist expensive");
        }

        if (izmir > ankara && izmir > istanbul) {
            System.out.println("izmir ist expensive");
        }


    }

}
