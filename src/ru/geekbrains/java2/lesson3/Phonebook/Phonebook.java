package ru.geekbrains.java2.lesson3.Phonebook;
import java.util.*;

public class Phonebook {

    private HashMap<String, List<Person>> map = new HashMap<>();

    public void add(Person p){
        List<Person> current = map.get(p.getLastname());
        if (current == null) {
            current = new ArrayList<>();
            map.put(p.getLastname(), current);
        }
        current.add(p);
    }

    public List get(String lastname){
        List<Person> result = new ArrayList<>();

        for (Map.Entry<String, List<Person>> e : map.entrySet()){
            if (e.getKey().equals(lastname)){
               result = e.getValue();
            }
        }

        return result;
    }
}
