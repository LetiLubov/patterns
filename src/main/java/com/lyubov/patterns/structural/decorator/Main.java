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
 * @see LyubavaSet - Decorator. Абстрактный класс или интерфейс, который определяет стандартное поведение, общее для
 * всех экземпляров
 * @see ConcreteLyubavaSet - ConcreteDecorator. Этот класс обеспечивает поддержку хранения информации: в нем содержится
 * ссылка на Component, который может быть представлен как классом ConcreteComponent, так и классом ConcreteDecorator.
 * Если иерархия классов Decorator создается в виде подклассов тех классов, которые они расширяют, эта ссылка может
 * использоваться для каких-то других целей.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteLyubavaSet<String> lyubavaSet = new ConcreteLyubavaSet<String>(new HashSet());

        lyubavaSet.add("new string value 1");
        lyubavaSet.add("new string value 2");
        System.out.println("I added " + lyubavaSet.getAddCount() + " string value(s) in my collection.");
    }
}
