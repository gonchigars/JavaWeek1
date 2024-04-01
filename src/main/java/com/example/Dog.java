package com.example;

public class Dog {
    String name;
    int age;
    int legs;
    public Dog() {
        // Default constructor
    }
    public Dog(String name, int age, int legs) {
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
    void bark() {
        System.out.println("Woof! Woof!!  "+name);
    }
}
