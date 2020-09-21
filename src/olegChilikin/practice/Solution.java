package olegChilikin.practice;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solution {

    public static void main(String[] args) throws IOException {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });

        arrays.forEach(x -> System.out.println(Arrays.toString(x)));

        arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int counterArray1 = 0, counterArray2 = 0;
                for (String s: o1){
                    counterArray1 += s.length();
                }
                for (String s: o2){
                    counterArray2 += s.length();
                }
                return counterArray1- counterArray2;
            }
        });


        arrays.forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
