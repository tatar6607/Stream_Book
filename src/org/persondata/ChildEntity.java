package org.persondata;

public class ChildEntity {

    String name;
    int age;
    boolean student;
    int friend;

    public ChildEntity(String name, int age, boolean student, int friend) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.friend = friend;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isStudent() {
        return student;
    }
    public void setStudent(boolean student) {
        this.student = student;
    }
    public int getFriend() {
        return friend;
    }
    public void setFriend(int friend){
        this.friend = friend;
    }
    @Override
    public String toString() {
        return "ChildEntity{" + "\n"+ "\t" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                ", friend=" + friend +
                '}';
    }
}
