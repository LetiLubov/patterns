package com.lyubov.patterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Kolya{

    public static void main(String[] args) {
        List<Human> humanList = new LinkedList<Human>();

        Map<String, Human> map = new HashMap<String, Human>();
        map.put("Kolya", new Russian());
        Human kolya = map.get("Kolya");
        kolya.sayHello();

        humanList.add(new Russian());
        humanList.add(new British());

        for (Human human : humanList) {

            human.sayHello();
            human.writeCountry();
            System.out.println("----");
        }

    }
}
