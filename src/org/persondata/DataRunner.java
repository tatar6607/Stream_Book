package org.persondata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataRunner {

    public static void main(String[] args) {
        Database.creationAllData();
        System.out.println("Database.allPerson = " + Database.allPerson);
        List<Object> myReturnList = new ArrayList<>();
//        myReturnList = Database.allPerson.stream()
//                    .filter(x->x.name.equals("ali"))
//                    .map(x->x.getChildren().stream().filter(t-> t.isStudent()).count()>0)
//                    .collect(Collectors.toList());
//        System.out.println(myReturnList);

        //ismi ali olup cocugunun yasi 20.den kucuk olan cocuklarin isim yas ve arkadas sayisi
        myReturnList = Database.allPerson.stream().filter(x->x.name.equals("ali"))
                        .flatMap(t->t.getChildren().stream().filter(x->x.age<20))
                        .map(x->"name: "+x.getName()+" age: "+ x.getAge()+" friends : "+x.friend)
                        .collect(Collectors.toList());
        System.out.println(myReturnList);

        //calisan kisilerin toplam cocuklari
        System.out.println(Database.allPerson.stream().filter(x -> x.worker)
                .flatMap(t -> t.getChildren().stream()).count());

        //calismayan kisilerin cocuklarinin isim ve yaslari
        System.out.println("calismayan kisilerin cocuklarinin isim ve yaslari \n" +
                Database.allPerson.stream().filter(t -> !t.worker)
                        .flatMap(x -> x.getChildren().stream())
                        .map(h -> h.getName()+ " "+ h.getAge()).collect(Collectors.toList()));
        }


}
