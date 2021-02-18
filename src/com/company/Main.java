package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Первое задание: ");
        String[] arr = {"Слово", "Слово1", "Слово2", "Слово3", "Слово",
                        "Слово5", "Слово1", "Слово7", "Слово8", "Слово9",
                        "Слово10", "Слово", "Слово1", "Слово13", "Слово1"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        HashSet<String> repeatables = new HashSet<>();
        for (String word : list) {
            repeatables.add(iterator(word, list).toString());
        }
        System.out.println(repeatables);

        System.out.println("\nВторое задание: ");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Пупкин", "920 111 11 11");
        phoneBook.add("Петров", "920 222 22 22");
        phoneBook.add("Иванов", "920 333 33 33");
        phoneBook.add("Сидоров", "920 444 44 44");
        phoneBook.add("Карманов", "920 555 55 55");
        phoneBook.add("Пупкин", "920 666 66 66");
        phoneBook.add("Ширяев", "920 777 77 77");
        System.out.println(phoneBook.get("Пупкин"));
        System.out.println(phoneBook);
    }

    public static Repeatable iterator(String word, List<String> list){
        int i = 0;
        for (String repeat : list){
            if (word.equals(repeat))
                i++;
        }
        return new Repeatable(word, i);
    }
}
