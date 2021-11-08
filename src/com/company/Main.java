package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Edu> edus = new ArrayList<Edu>();
        Edu coll = new College("КТГГ ", "Київ ", "4 ", "30");
        edus.add(coll);

        edus.add(new Univer("КНТЕУ ", "Київ ", "4 ", "80"));
        printEdu(edus);
        /*
        Edu uni = new Univer("КНТЕУ ", "Київ ", "4 ", "80");
        edus.add(uni);
        */

    }

    public static void printEdu (ArrayList<Edu> edus){
        for (Edu edu : edus){
            System.out.printf(edu.getKind());
            System.out.printf("Назва " + edu.getName());
            System.out.printf("Місцерозташування " +  edu.getPlace());
            System.out.printf("Рівень акредетації " + edu.getLevel());
            System.out.printf("Кількість викладачів " + edu.getTeachers());
            System.out.println(" ");
        }
    }
}


/*
* Реалізувати інтерфейс Навчальний заклад.
*  На базі інтерфейсу
* створити підкласи і об'єкти:
*  Коледж і Університет
* */