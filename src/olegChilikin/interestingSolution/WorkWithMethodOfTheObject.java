package olegChilikin.interestingSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkWithMethodOfTheObject {
    public static void main(String[] args) throws IOException {
        Person sasha = new Person();
        sasha.initialization();
        sasha.firstPresentation();
        sasha.married("Kim");
        sasha.thaiTraval(true);
    }
}

class Person {
    String firstName;
    String secondName;
    byte age;
    char sex;

    void initialization() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите Имя: ");
        this.firstName = reader.readLine();
        System.out.print("Введите Фамилию: ");
        this.secondName = reader.readLine();
        System.out.print("Введите Возраст: ");
        String ageS = reader.readLine();
        this.age = (byte) Integer.parseInt(ageS);
        System.out.print("Введите Пол: ");
        String sexS = reader.readLine();
        this.sex = sexS.charAt(0);
        System.out.println();
    }

    /* Конструктор класса Person
    Person(String firstName, String secondName, byte age, char sex){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.secondName = sex;
    }
     */

    void firstPresentation() {
        System.out.print("Hello, my name is " + this.firstName +
                " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
        if ((this.sex == 'M') || (this.sex == 'М'))
            System.out.println("Man");
        else
            System.out.println("Woman");
        System.out.println();
    }

    void married(String newSecondName) {
        this.secondName = newSecondName;
        System.out.print("New information about me:\n" + "My name is: " + this.firstName +
                " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
        if (this.sex == 'M')
            System.out.println("Man");
        else
            System.out.println("Woman");

        System.out.println();
    }

    void thaiTraval(boolean decision) {
        if (decision) {
            if (this.sex == 'M') {
                this.sex = 'W';
                this.firstName = "Masha";
                this.secondName += "a";
            } else {
                this.sex = 'M';
                this.firstName = "Misha";
                char[] massString = new char[this.secondName.length()];
                for (int i = 0; i < this.secondName.length(); i++) {
                    massString[i] = this.secondName.charAt(i);
                }
                this.secondName = "";
                for (int i = 0; i < (massString.length - 1); i++) {
                    this.secondName += massString[i];
                }
            }
        }

        System.out.print("After travel to Thai =) :\n" + "My name is: " + this.firstName +
                " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
        if (this.sex == 'M')
            System.out.println("Woman");
        else
            System.out.println("Man");
        System.out.println();


    }
}