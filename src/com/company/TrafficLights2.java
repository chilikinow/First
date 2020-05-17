package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);

        String color = null;
        double countGreen = 0;
        double countYellow = 0;
        double colorCountRed = 0;
        int colorFlag = 1;

        for (double i = 0; i <= a; i += 0.1) {
             if ((countGreen < 3) & (colorFlag == 1)) {
                 color = "зеленый";
                 countGreen += 0.1;
             }
             else {
                 countGreen = 0;
                 colorFlag = 2;
                 if ((countYellow < 1) & (colorFlag == 2)) {
                     color = "желтый";
                     countYellow += 0.1;
                 } else {
                     countYellow = 0;
                     colorFlag = 3;
                     if ((colorCountRed < 1) & (colorFlag == 3)) {
                         color = "красный";
                         colorCountRed+=0.1;
                     } else {
                         colorCountRed = 0;
                         colorFlag = 1;
                     }
                 }
             }
        }
        System.out.println(color);
    }
}
