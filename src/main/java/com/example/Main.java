package com.example;
import com.example.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 5, 4);
        Dog dog2 = new Dog("Max", 3, 4);
        dog1.bark();
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.bark();
        
    }
}