package ru.geekbrains.java2.lesson3;

import java.util.*;

public class MainApp {

    private static String[] words = {"a", "b", "a", "c", "d", "e", "e", "a", "c", "d", "e", "a"};

    private static Set uniqueWords(){
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < words.length ; i++) {
            set.add(words[i]);
        }
        return set;
    }

    public static Map wordCount(){
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length ; i++) {
            if (map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }else {
                map.put(words[i],  1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        System.out.println(uniqueWords());
        System.out.println(wordCount());


    }
}
