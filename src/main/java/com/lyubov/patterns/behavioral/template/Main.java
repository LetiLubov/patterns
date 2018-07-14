package com.lyubov.patterns.behavioral.template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<CookingSoups> soups = new ArrayList<>();

        soups.add(new Borsh());
        soups.add(new Shchi());

        for (CookingSoups soup : soups) {
            soup.recipe();
            System.out.println("---");
        }

    }
}





























