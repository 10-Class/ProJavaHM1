package org.example.lesson1.homework.first;

//1. Создать класс Person, который содержит:
//        поля fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение - "Такой-то  Person говорит".
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)
public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }
}
