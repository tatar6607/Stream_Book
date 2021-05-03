package org.persondata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonEntity {

    String name;
    String lastname;
    int age;
    boolean worker;
    String city;
    Set<ChildEntity>children = new HashSet<>();

    public PersonEntity(String name, String lastname, int age, boolean worker, String city, ChildEntity...child) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.worker = worker;
        this.city = city;
        this.children.addAll(Arrays.stream(child).collect(Collectors.toList()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return worker;
    }

    public void setWorker(boolean worker) {
        this.worker = worker;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<ChildEntity> getChildren() {
        return children;
    }

    public void addChildren(ChildEntity children) {
        this.children.add(children);
    }
    public void deleteChildren(ChildEntity children) {
        this.children.remove(children);
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "\n"+
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", worker=" + worker +
                ", city='" + city + '\'' +
                ", children=" + children +
                '}';
    }
}
