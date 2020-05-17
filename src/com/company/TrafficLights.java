package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);

        String color = "зеленый";
        double colorCountGreen = 0;
        double colorCountYellow = 0;
        double colorCountRed = 0;
        int colorFlag = 1;

        for (double i = 0; i <= a; i += 0.1) {
            switch (colorFlag){
                case (1):
                    if (colorCountGreen < 3) {
                        color = "зеленый";
                        colorCountGreen += 0.1;
                        System.out.println("i: " + i);
                        System.out.println("CG: " + colorCountGreen);
                        System.out.println("Flag: " + colorFlag);
                    } else {
                        colorCountGreen = 0;
                        colorFlag = 2;
                        a += 0.1;
                    }
                break;
                case (2):
                    if (colorCountYellow < 1) {
                        color = "желтый";
                        colorCountYellow += 0.1;
                        System.out.println("i: " + i);
                        System.out.println("CY: " + colorCountYellow);
                        System.out.println("Flag: " + colorFlag);
                    } else {
                        colorCountYellow = 0;
                        colorFlag = 3;
                        a += 0.1;
                    }
                    break;
                case (3):
                    if (colorCountRed < 1) {
                        color = "красный";
                        colorCountRed += 0.1;
                        System.out.println("i: " + i);
                        System.out.println("CR: " + colorCountRed);
                        System.out.println("Flag: " + colorFlag);
                    } else {
                        colorCountRed = 0;
                        colorFlag = 1;
                        a += 0.1;
                    }
                    break;
            }
        }
    System.out.println(color);
    }
}
