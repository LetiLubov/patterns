package com.lyubov.patterns.behavioral.template;

import java.util.ArrayList;
import java.util.List;

/**
 * Предоставляет метод, который позволяет подклассам перекрывать части метода, не прибегая к их переписыванию.
 *
 * Реализация: Рецепты, где есть повторяющиеся действия - взять емкость, добавлять N-ое число ингредиентов, пр.
 *
 * CookingSoup - абстрактный класс / шаблон
 * Borsh, Shchi - конкретные реализации
 */

public class Main {
    public static void main (String[] args){
        List<CookingSoups> soups = new ArrayList();

        soups.add(new Borsh());
        soups.add(new Shchi());

        for (CookingSoups soup : soups) {
            soup.recipe();
            System.out.println("---");
        }
    }
}





























