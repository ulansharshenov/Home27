package com.company;

public class Main {

    public static void main(String[] args) {

    }
}

class Box<T> {
    private T value;

    public static <T> Box<T> getInstance(){
        return new Box<>();
    }
}