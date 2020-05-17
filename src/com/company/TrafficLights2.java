package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights2 {

    public static String color;
    public static double countGreen = 0, countYellow = 0, colorCountRed = 0;
    public static int colorFlag = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);


        for (double i = 0; i <= a; i += 0.1) {
            System.out.println("i: " + i);
             if ((countGreen < 3) & (colorFlag == 1)) {
                 TrafficLights2.color = "зеленый";
                 System.out.println("CG: " + countGreen);
                 countGreen += 0.1;
             }
             else {
                 countGreen = 0;
                 colorFlag = 2;

                 if ((countYellow < 1) & (colorFlag == 2)) {
                     TrafficLights2.color = "желтый";
                     countYellow += 0.1;
                     System.out.println("CY: " + countYellow);
                 } else {
                     countYellow = 0;
                     colorFlag = 3;

                     if ((colorCountRed < 1) & (colorFlag == 3)) {
                         TrafficLights2.color = "красный";
                         colorCountRed+=0.1;
                         System.out.println("CR: " + colorCountRed);
                     } else {
                         colorCountRed = 0;
                         colorFlag = 1;
                     }
                 }
             }
        }
        System.out.println(TrafficLights2.color);

    }


}
