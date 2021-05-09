package com.sahaf;


import com.sahaf.data.Depo;
import com.sahaf.models.Kitap;
import com.sahaf.models.Yayinevi;
import com.sahaf.models.Yazar;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sahaf {
    private static List<Kitap> kitapListesi;

    static {
        kitapListesi = Depo.kitaplar();
    }


    public static void main(String[] args) {
//        Depo depoKitaplar = new Depo();
//        kitapListesi = depoKitaplar.kitaplar();
        System.out.println("kitapListesi.stream().count() = " + (long) kitapListesi.size());
        System.out.println("kitapListesi.stream().count() = " + (long) kitapListesi.size());

//        Bestseller olan kitaplari listele
        //   kitapListesi.stream().filter(t -> t.getBestSeller() == true).forEach(System.out::println);

//        Bestseller olan kitap sayisi kac tane
        int bestSellerCount = (int) kitapListesi.stream().filter(Kitap::getBestSeller).count();
        System.out.println("bestSellerCount = " + bestSellerCount);
//
//        yayın evi istanbul adresli olanlar
        Set<Kitap> setYayinEvleri = kitapListesi.
                stream().
                filter(t -> t.getYayinevi().getYayineviYeri().equalsIgnoreCase("istanbul")).
                collect(Collectors.toSet());
        System.out.println("setYayinEvleri = " + setYayinEvleri.size());
        //   System.out.println("setYayinEvleri = " + setYayinEvleri);
        //    setYayinEvleri.stream().forEach(t -> System.out.println(t.getYayinevi().getYayineviYeri()));
        //        yayın evi izmir adresli olanlar
        Set<Kitap> setYayinEvleriIzmir = kitapListesi.
                stream().
                filter(t -> t.getYayinevi().getYayineviYeri().equalsIgnoreCase("izmir")).
                collect(Collectors.toSet());

//        kitap sayısı 5 ve üzeri olan yazar sayıları
        Set<Kitap> moreThan5 =
                kitapListesi.
                        stream().
                        filter(t -> t.getYazar().getKitapSayisi() >= 5).
                        collect(Collectors.toSet());
        System.out.println("moreThan5.size() = " + moreThan5.size());

        // Sadece yazarlarin arasinda kitap sayisi 5 ten buyuk olanlari bulmak icin yazarlar listesinde stream olusturmak gerek
        int morethan5_yazar = Depo.yazarlar().stream().filter(t -> t.getKitapSayisi() >= 5).collect(Collectors.toSet()).size();
        System.out.println("morethan5_yazarlar = " + morethan5_yazar);

        System.out.println("depoYazarlar.yazarlar().stream().count() = " + Depo.yazarlar().stream().count());

        // unique ifadeleri bulmak icin
//        Collection<Yazar> uniqPeopleByAge = Depo.yazarlar().
//                stream().
//                collect(Collectors.toMap(Yazar::getYazarAdi, Function.identity(),
//                        (person1, person2) -> person1)).
//                values();
//        System.out.println(uniqPeopleByAge.size());

//        kitap fiyatları tam fiyat olmayn kitap yazarları (12,5 vb)
        //       depoKitaplar.kitaplar().clear();
        System.out.println("Tam sayi fiyata sahip olanlari bulmak");
        kitapListesi.stream().
                filter(t -> (t.getKitapFiyati() - t.getKitapFiyati().intValue() == 0)).
                forEach(t -> System.out.println(t.getYazar().getYazarAdi() + " " + t.getKitapFiyati()));

        System.out.println("Tam fiyat olmayanlari bulmak");
        kitapListesi.stream().
                filter(t -> (t.getKitapFiyati() - t.getKitapFiyati().intValue() != 0)).
                forEach(t -> System.out.println(t.getYazar().getYazarAdi() + " " + t.getKitapFiyati()));

        // yazar isimlerini toplamak
        System.out.println("Tam fiyat olmayan kitaplarin yazaralri: =======================");
        List<String> yazarlar =
                kitapListesi.stream().
                        filter(t -> (t.getKitapFiyati() - t.getKitapFiyati().intValue() != 0)).
                        map(Kitap::getYazar).
                        collect(Collectors.toList()).
                        stream().
                        map(Yazar::getYazarAdi).
                        collect(Collectors.toList());
        System.out.println(yazarlar);

//       "Baskil Yayinevi" yayın evinden çıkan " L" harfinden sonra başlayan kitap isimleri
        System.out.println("Baskil yayinevi S ile baslayan kitaplar: =======================");
        kitapListesi.stream().
                filter(t -> t.getYayinevi().getYayineviAdi().equals("Baskil Yayinevi") && t.getKitapAdi().startsWith("S")).
                forEach(t -> System.out.println(t.getYayinevi() + " " + t.getKitapAdi()));

//        yayın evi bazında bestseller olan kitaplar
        System.out.println("\nYayin evi bazinda best seller olan kitaplar: ==============");

        kitapListesi.
                stream().
                collect(Collectors.groupingBy(Kitap::getYayinevi)).
                values().
                stream().
                flatMap(Collection::stream). //Listin icindeki kitaplari cekiyor
                filter(Kitap::getBestSeller).
                forEach(t -> System.out.println(t.getYayinevi().getYayineviAdi() + " " + t.getKitapAdi() + "  " + t.getBestSeller()));

//        en cok bestselleri, olan yayınevi
        System.out.println("En cok bestselleri olan yayınevi ======================");

        String yayinevi = kitapListesi.
                stream().
                collect(Collectors.groupingBy(Kitap::getYayinevi)).
                values().
                stream().
                flatMap(Collection::stream).
                filter(Kitap::getBestSeller).
                collect(Collectors.groupingBy(Kitap::getYayinevi, Collectors.counting())).
                entrySet().
                stream().
                max(Map.Entry.comparingByValue()).get().getKey().getYayineviAdi();
        System.out.println("en cok bestselleri olan yayinevi = " + yayinevi);


//        yazar bazında en pahalı kitap sahibi yazar ve yayın evi
        String mostExpensiveBook =
                kitapListesi.
                        stream().
                        max(Comparator.comparingDouble(Kitap::getKitapFiyati)).
                        get().
                        getKitapAdi();

        String mostExpensiveBooksAuthor =
                kitapListesi.
                        stream().
                        max(Comparator.comparingDouble(Kitap::getKitapFiyati)).
                        get().
                        getYazar().getYazarAdi();

        String mostExpensiveBookPublisher =
                kitapListesi.
                        stream().
                        max(Comparator.comparingDouble(Kitap::getKitapFiyati)).
                        get().
                        getYayinevi().getYayineviAdi();

        Double mostExpensiveBookPrice =
                kitapListesi.
                        stream().
                        max(Comparator.comparingDouble(Kitap::getKitapFiyati)).
                        get().
                        getKitapFiyati();

        System.out.println("Fiyat bazinda en pahali kitap fiyati - yazari - yayinevi");

        System.out.println(mostExpensiveBook + " === " +
                mostExpensiveBooksAuthor + " === " +
                mostExpensiveBookPublisher + " === " +
                mostExpensiveBookPrice);


//        /*---------------@Samet-----------------*/
        //1. yazar ismi A ile baslayan yazarlarin toplam kitap sayisi
        System.out.println("1. yazar ismi A ile baslayan yazarlarin toplam kitap sayisi ===========================");
        int kitapSayisi = (int) kitapListesi.
                stream().filter(t -> t.getYazar().getYazarAdi().startsWith("A")).count();
        System.out.println("kitapSayisi = " + kitapSayisi);

        int toplamKitapSayisi = (int) (Integer) kitapListesi.
                stream().
                map(Kitap::getYazar). // sadece yazalari al
                collect(Collectors.toList()). // listele
                stream(). // 2. streami baslat
                distinct().
                filter(t -> t.getYazarAdi().startsWith("A")).
                mapToInt(Yazar::getKitapSayisi).sum();

        System.out.println("A ile baslayan yazarlara kayitli toplam kitap sayisi => " + toplamKitapSayisi);

        //2. kitap isminda numerik karakter bulunduran kitaplarin listesi
        System.out.println("2. kitap isminda numerik karakter bulunduran kitaplarin listesi ===========================");
        List<String> kitaplarDigit = new ArrayList<>();
        kitapListesi.
                stream().
                map(Kitap::getKitapAdi).
                filter(t -> t.matches(".*\\d+.*")).
                forEach(kitaplarDigit::add);
        System.out.println("kitaplarDigit = " + kitaplarDigit);

        //3. kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi
        System.out.println("3. kitap ismi iki veya daha fazla kelimeden olusan kitaplarin listesi ===========================");

        List<String> kitaplar2Kelime = new ArrayList<>();
        kitapListesi.
                stream().
                map(Kitap::getKitapAdi).
                filter(t -> t.split(" ").length >= 2).
                forEach(kitaplar2Kelime::add);
        System.out.println("kitaplar2Kelime = " + kitaplar2Kelime);

        //4. depo.daki tum kitaplarin toplam fiyati
        System.out.println("depo.daki tum kitaplarin toplam fiyati ===========================");
        double totalPrice = kitapListesi.
                stream().
                mapToDouble(Kitap::getKitapFiyati).
                sum();
        System.out.println(totalPrice);

        //5. depo.daki tum kitaplarin fiyat ortalamasi
        System.out.println("5. depo.daki tum kitaplarin fiyat ortalamasi ===========================");
        double priceAvg = kitapListesi.
                stream().
                mapToDouble(Kitap::getKitapFiyati).
                average().
                getAsDouble();
        System.out.println("priceAvg = " + priceAvg);

        //6. depo.daki kitaplarin ortalamasinin ustunde olan kitaplar
        System.out.println("6. depo.daki kitaplarin ortalamasinin ustunde olan kitaplar ========================");
        List<String> ortalamaUstuKuitaplar = new ArrayList<>();
        kitapListesi.
                stream().
                filter(t -> t.getKitapFiyati() > priceAvg).
                map(Kitap::getKitapAdi).forEach(ortalamaUstuKuitaplar::add);
        System.out.println("ortalamaUstuKuitaplar = " + ortalamaUstuKuitaplar);

        //7. fiyati en yuksek olan kitap
        System.out.println("7. fiyati en yuksek olan kitap ====================== ");
        kitapListesi.
                stream().
                sorted(Comparator.comparingDouble(Kitap::getKitapFiyati).reversed()).
                limit(1).forEach(t -> System.out.println(t.getKitapAdi()));

        //8. best seller olup en ucuz olan kitap
        System.out.println("8. best seller olup en ucuz olan kitap =============================");
        kitapListesi.
                stream().
                filter(Kitap::getBestSeller).
                sorted(Comparator.comparingDouble(Kitap::getKitapFiyati)).
                limit(1).forEach(t -> System.out.println(t.getKitapAdi()));

        //9. yayinevi izmir olan kitaplarin yazarlarinin listesi
        System.out.println("9. yayinevi izmir olan kitaplarin yazarlarinin listesi ===============================");
        Set<String> izmirliYazarlar = new HashSet<>();
        kitapListesi.
                stream().
                filter(t -> t.getYayinevi().getYayineviYeri().equals("Izmir")).
                forEach(t -> izmirliYazarlar.add(t.getYazar().getYazarAdi()));
        System.out.println("izmirliYazarlar = " + izmirliYazarlar);

        //10. yayinevi ankara olan kitaplarin fiyat ortalamasi
        System.out.println("10. yayinevi ankara olan kitaplarin fiyat ortalamasi ============================== ");
        double avgAnkara = kitapListesi.
                                    stream().
                                    filter(t -> t.getYayinevi().getYayineviYeri().equalsIgnoreCase("Ankara")).
                                    mapToDouble(Kitap::getKitapFiyati).average().getAsDouble();

        System.out.println("avgAnkara = " + avgAnkara);
        System.out.println("avgIstanbul = " + getAvg("Istanbul"));

        //11. ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir
        System.out.println("11. ankara mi istanbul mu daha pahaliya kitap satiyor..ortalamasini karsilastir =================");
        String pahaliSehir  = getAvg("Ankara") > getAvg("Istanbul") ? "Ankara" : "Istanbul";
        System.out.println("pahaliSehir = " + pahaliSehir);

        //12. hangi sehride daha fazla best seller kitap var...
        System.out.println("12. hangi sehride daha fazla best seller kitap var...  ============================= ");
        String enFazlaBestSellerSehir =
                kitapListesi.
                stream().
                filter(Kitap::getBestSeller).
                map(Kitap::getYayinevi).
                collect(Collectors.groupingBy(Yayinevi::getYayineviYeri, Collectors.counting())).
                entrySet().
                stream().
                max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("enFazlaBestSellerSehir = " + enFazlaBestSellerSehir);

    }

    public static Double getAvg(String city) {
        return kitapListesi.
                stream().
                filter(t -> t.getYayinevi().getYayineviYeri().equalsIgnoreCase(city)).
                mapToDouble(Kitap::getKitapFiyati).average().getAsDouble();
    }


}
