package com.company;

public class Repeatable {

    private String word;
    private int n;

    public Repeatable(String word, int n) {
        this.word = word;
        this.n = n;
    }

    @Override
    public String toString() {
        return  "\n" + word +
                ", кол-во повторений - " + n;
    }
}
