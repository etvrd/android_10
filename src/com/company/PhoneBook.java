package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.get(lastName) != null)
            phoneNumber = "" + phoneBook.get(lastName) + ", " + phoneNumber;
        phoneBook.put(lastName, phoneNumber);
    }

    public String get(String lastName) {
        return phoneBook.get(lastName);
    }

    @Override
    public String toString() {
        String string = "";
        for (Map.Entry<String, String> o : phoneBook.entrySet()) {
            string += ""+ o.getKey() + ": " + o.getValue() + "\n";
        }
        return string;

    }
}
