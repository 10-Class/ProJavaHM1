package org.example.lesson1.homework.second;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+49015252302375", "iPhone 13", 0.2);
        Phone phone2 = new Phone("+49052525252525", "Samsung Galaxy S20", 0.3);
        Phone phone3 = new Phone("+49012222332343", "Google Pixel 5", 0.25);

        phone1.printPhoneInfo();
        phone2.printPhoneInfo();
        phone3.printPhoneInfo();

        phone1.receiveCall("Oleksandr");
    }
}
