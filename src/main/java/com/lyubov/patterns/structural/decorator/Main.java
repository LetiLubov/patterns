package com.lyubov.patterns.structural.decorator;

import java.util.HashSet;

/**
 * Реализация: Расширили Set подсчетом числа вызовов добавления элементов и выводом на консоль бесполезной информации
 * @see java.util.Set - Component. Представляет компонент, реализующий общую модель поведения. Может быть как
 * абстрактным классом, так и интерфейсом.
 * @see HashSet - ConcreteComponent. Каждый подкласс класса Decorator должен поддерживать возможность образования
 * связных списков (ссылка на компонент плюс средства для добавления и удаления этой ссылки). Помимо базовых требований,
 * каждый класс ConcreteDecorator может определять дополнительные методы и (или) переменные для расширения компонента.
 * (Один или более классов ConcreteDecorator)
 * @see MySet - Decorator. Абстрактный класс или интерфейс, который определяет стандартное поведение, общее для
 * всех экземпляров
 * @see ConcreteMySet - ConcreteDecorator. Этот класс обеспечивает поддержку хранения информации: в нем содержится
 * ссылка на Component, который может быть представлен как классом ConcreteComponent, так и классом ConcreteDecorator.
 * Если иерархия классов Decorator создается в виде подклассов тех классов, которые они расширяют, эта ссылка может
 * использоваться для каких-то других целей.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMySet<String> mySet = new ConcreteMySet<String>(new HashSet());
        String s = "new string value 1";
        mySet.add(s);
        s = "new string value 2";
        mySet.add(s);
        mySet.remove(s);
        System.out.println("I added " + mySet.getAddCount() + " string value(s) in my collection.");
    }
}
