package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static String color;
    public static double colorCountGreen = 0.1, colorCountYellow = 0.1, colorCountRed = 0.1;
    public static int colorFlag = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);


        for (double i = 0; i < a; i += 0.1) {
            System.out.println("i: " + i);
             if ((colorCountGreen < 3) & (colorFlag == 1)) {
                 Solution.color = "зеленый";
                 colorCountGreen+= 0.1;
                 System.out.println("CG: " + colorCountGreen);
             }
             else {
                 colorCountGreen = 0.1;
                 colorFlag = 2;

                 if ((colorCountYellow < 1) & (colorFlag == 2)) {
                     Solution.color = "желтый";
                     colorCountYellow += 0.1;
                     System.out.println("CY: " + colorCountYellow);
                 } else {
                     colorCountYellow = 0.1;
                     colorFlag = 3;

                     if ((colorCountRed < 1) & (colorFlag == 3)) {
                         Solution.color = "красный";
                         colorCountRed+=0.1;
                         System.out.println("CR: " + colorCountRed);
                     } else {
                         colorCountRed = 0.1;
                         colorFlag = 1;
                     }
                 }
             }
        }
        System.out.println(Solution.color);

    }


}
