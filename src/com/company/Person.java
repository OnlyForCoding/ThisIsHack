package com.company;

public class Person {
     int hands;
     int eyes;
     String name;

    Person(int hands, int eyes, String name){
        this.hands = hands;
        this.eyes = eyes;
        this.name = name;
    }

     void walk(){
        System.out.println("He is walking like dumb");
    }
    void talk(){
        System.out.println("Talking like idiot");
    }
}
