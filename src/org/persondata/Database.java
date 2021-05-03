package org.persondata;

import java.util.ArrayList;
import java.util.List;

public class Database {

    static List<PersonEntity> allPerson = new ArrayList<>();
    static List<ChildEntity> childEntity = new ArrayList<>();

    static void creationAllData(){
//        PersonEntity person1 =new PersonEntity("ali","duman",19,false,"istanbul");
//        PersonEntity person2 =new PersonEntity("ahmet","erturk",19,false,"istanbul");
//        PersonEntity person3 =new PersonEntity("melike","veli",19,false,"istanbul");
//        PersonEntity person4 =new PersonEntity("fatma","turk",19,false,"istanbul");
//        PersonEntity person5 =new PersonEntity("nuri","mutlu",19,false,"istanbul");
//        PersonEntity person6 =new PersonEntity("gulsen","cakir",19,false,"istanbul");
//        PersonEntity person7 =new PersonEntity("zehra","yilmaz",19,false,"istanbul");
//        ChildEntity child0 = new ChildEntity("yusuf",19,false,20);
//        ChildEntity child1 = new ChildEntity("ali",29,true,5);
//        ChildEntity child2 = new ChildEntity("ahmet",22,true,1);
//        ChildEntity child3 = new ChildEntity("cengiz",31,false,15);
//        ChildEntity child4 = new ChildEntity("fatma",35,true,12);
//        ChildEntity child5 = new ChildEntity("ruya",27,true,8);
//        ChildEntity child6 = new ChildEntity("melike",33,false,6);
//        ChildEntity child7 = new ChildEntity("semih",19,false,21);
//        ChildEntity child8 = new ChildEntity("salim",29,true,8);
//        ChildEntity child9 = new ChildEntity("mehmet",22,true,2);
//        ChildEntity child10 = new ChildEntity("kadir",31,false,17);
//        ChildEntity child11 = new ChildEntity("gulsen",35,true,6);
//        ChildEntity child12 = new ChildEntity("pinar",27,true,18);
//        ChildEntity child13 = new ChildEntity("melike",33,false,26);
//        person1.addChildren(child0);
//        person1.addChildren(child1);
//        allPerson.add(person1);
//        allPerson.get(0).addChildren(childEntity.get(0));
//        allPerson.get(1).addChildren(childEntity.get(1));
//        allPerson.get(2).addChildren(childEntity.get(2));
//        allPerson.get(3).addChildren(childEntity.get(3));
//        allPerson.get(4).addChildren(childEntity.get(4));
//        allPerson.get(5).addChildren(childEntity.get(5));
//        allPerson.get(6).addChildren(childEntity.get(6));
//        allPerson.get(7).addChildren(childEntity.get(7));
//        allPerson.get(0).addChildren(childEntity.get(8));
//        allPerson.get(1).addChildren(childEntity.get(9));
//        allPerson.get(2).addChildren(childEntity.get(10));
//        allPerson.get(3).addChildren(childEntity.get(11));
//        allPerson.get(4).addChildren(childEntity.get(12));
//        allPerson.get(5).addChildren(childEntity.get(13));
//        allPerson.get(6).addChildren(childEntity.get(14));

        allPerson.add(new PersonEntity("ali","duman",19,true,"istanbul",
                                        new ChildEntity("yusuf",19,false,20),
                                        new ChildEntity("ali",29,true,5)));
        allPerson.add(new PersonEntity("ahmet","erturk",19,true,"ankara",
                                        new ChildEntity("ahmet",22,true,1),
                                        new ChildEntity("cengiz",31,false,15)));
        allPerson.add(new PersonEntity("melike","veli",19,false,"izmir",
                                        new ChildEntity("fatma",35,true,12),
                                        new ChildEntity("ruya",27,true,8)));
        allPerson.add(new PersonEntity("fatma","turk",19,true,"istanbul",
                                        new ChildEntity("melike",33,false,6),
                                        new ChildEntity("semih",19,false,21),
                                        new ChildEntity("salim",29,true,8)));
        allPerson.add(new PersonEntity("nuri","mutlu",19,false,"ankara",
                                        new ChildEntity("mehmet",22,true,2)));
        allPerson.add(new PersonEntity("gulsen","cakir",19,false,"izmir",
                                        new ChildEntity("kadir",31,false,17),
                                        new ChildEntity("gulsen",35,true,6),
                                        new ChildEntity("pinar",27,true,18)));
        allPerson.add(new PersonEntity("zehra","yilmaz",19,false,"istanbul",
                                        new ChildEntity("melike",33,false,26)));
        allPerson.add(new PersonEntity("veli","orhun",29,false,"istanbul",
                                        new ChildEntity("mutlu",17,true,6),
                                        new ChildEntity("nuthan",33,false,7)));
        allPerson.add(new PersonEntity("hulya","taskiran",49,true,"ankara",
                                        new ChildEntity("ali",25,true,1),
                                        new ChildEntity("meltem",22,false,8)));
        allPerson.add(new PersonEntity("yagmur","yesil",19,true,"izmir",
                                        new ChildEntity("sezai",27,true,4),
                                        new ChildEntity("defne",34,true,6)));
        allPerson.add(new PersonEntity("resit","ozyurt",45,true,"istanbul",
                                        new ChildEntity("iskender",22,false,6),
                                        new ChildEntity("yakup",10,false,2),
                                        new ChildEntity("musa",12,true,8)));
        allPerson.add(new PersonEntity("enes","sarac",35,false,"ankara",
                                        new ChildEntity("aytug",22,true,2)));
        allPerson.add(new PersonEntity("fatma","peker",19,false,"izmir",
                                        new ChildEntity("erdem",31,false,17),
                                        new ChildEntity("ersel",35,true,6),
                                        new ChildEntity("pinar",27,true,18)));
        allPerson.add(new PersonEntity("zehra","yilmaz",19,false,"istanbul",
                                        new ChildEntity("umit",33,false,26)));
    }


}
