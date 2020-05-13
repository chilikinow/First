package com.company;


import java.util.Scanner;

public class Jarvis {

    public static void main(String[] args) {
        Scanner newLine = new Scanner(System.in);
        System.out.print("Vvedite paru slov: ");
        String s1 = newLine.nextLine();
        System.out.println("");
        System.out.print("Vvedite escho paru troiku slov: ");
        String s2 = newLine.nextLine();
        System.out.println();
        System.out.println(s1 + s2);

    }



}
