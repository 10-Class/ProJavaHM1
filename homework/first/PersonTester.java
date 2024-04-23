package org.example.lesson1.homework.first;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Oleksandr Svyrda", 20);
        Person person2 = new Person();

        person1.talk();
        person2.talk();
    }
}
