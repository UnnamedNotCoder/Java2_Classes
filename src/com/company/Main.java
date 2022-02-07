package com.company;

public class Main {

    public static void main(String[] args) {
	Second person = new Second();
    person.name = "Имя";
    person.age = 20;
    person.speak();
    person.CalcYearsToRetirement();
    }
}

class Second {
    String name;
    int age;
    void speak(){
        System.out.println(name + " " + age);
    }
    void CalcYearsToRetirement(){
        int years = age - 65;
        System.out.println("осталось до пенсии"+years);
    }
}
