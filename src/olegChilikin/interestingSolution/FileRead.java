package olegChilikin.interestingSolution;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class FileRead {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader readerFileSpace = new BufferedReader(new InputStreamReader(System.in));
        String fileSpace = readerFileSpace.readLine();///Users/OlegChilikin/IdeaProjects/First/src/olegChilikin/practice/test
        //BufferedReader fileReader = new BufferedReader(new FileReader(fileSpace));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileSpace)));

        String bufferLine;
        while ((bufferLine = fileReader.readLine()) != null) {
            list.add(Integer.parseInt(bufferLine));
        }
        fileReader.close();
        Collections.sort(list);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileSpace));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                System.out.println(list.get(i));
        }
    }
}











/*
import java.io.*;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList <String> stringList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileSpace = reader.readLine();
        String exit = "exit";
        String buffer = reader.readLine();
        while (true) {
            if (!buffer.equals(exit)) {
                stringList.add(buffer);
                buffer = reader.readLine();
            } else {
                stringList.add(buffer);
                break;
            }
        }
        reader.close();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileSpace))){
            for (int i = 0; i < stringList.size(); i++) {
                writer.write(stringList.get(i) + "\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
*/