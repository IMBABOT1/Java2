package ru.geekbrains.java2.lesson3.Phonebook;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Person("Ivanov", 8000));
        phonebook.add(new Person("Ivanov", 880001));
        phonebook.add(new Person("Stav", 123));

        System.out.println(phonebook.get("Ivanov"));

    }
}
