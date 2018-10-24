package com.lyubov.patterns.structural.facade;

import java.io.File;

/**
 * Фасад скрывает действия для работы с фреймворком или библиотекой
 * Если необходимо совершить перечень нетривиальных действий, с созданием сущностей, вызовом методов, то
 * создается Фасад, в котором все реализовано
 * Фасад предоставляет упрощенный элемент взаимодействия для запуска механизма "под его капотом".
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.printf("");
    }
}
