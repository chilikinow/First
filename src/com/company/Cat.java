package com.company;

public class Cat {

    int id, age;
    String name, owner;

    static int count = 1;

    public static void main (String [] args) {
        Cat basia = new Cat();
        basia.id = count++;
        basia.name = "Basia";
        basia.age = 3;
        basia.owner = "Masha";

        Cat murzic = new Cat();
        murzic.id = count++;
        murzic.name = "Murzic";
        murzic.age = 4;
        murzic.owner = "Masha";

        textCat(basia.id, basia.name, basia.age, basia.owner);
        textCat(murzic.id, murzic.name, murzic.age, murzic.owner);
    }

    private static void textCat(int id, String name, int age, String owner) {
        System.out.println("ID = " + id + " Name_Cat = " + name + " Age_Cat = " + age + " Owner_cat = " + owner);
    }
}
