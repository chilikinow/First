package com.company;

public class Artifact {

    int id, made;
    String culture;

    public Artifact(){
    }

    public Artifact(int id){
        this.id = id;
    }

    public Artifact(int id, String culture) {
        this.id = id;
        this.culture = culture;
    }

    public Artifact(int id, String culture, int made){
        this.id = id;
        this.culture = culture;
        this.made = made;
    }

    public static void print(int i, String text1, int m){
        System.out.println(i + text1 + m);
    }

    public static void main (String [] args){
        Artifact vaza = new Artifact();
        Artifact amfora = new Artifact(1);
        Artifact copiyo = new Artifact(2,"otsteki");
        Artifact maska = new Artifact(3, "maya", 7);

        print(vaza.id, vaza.culture, vaza.made);
        System.out.println(amfora.id + amfora.culture + amfora.made);
        System.out.println(copiyo.id + copiyo.culture + copiyo.made);
        System.out.println(maska.id + maska.culture + maska.made);
    }

}
