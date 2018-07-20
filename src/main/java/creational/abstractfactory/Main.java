package creational.abstractfactory;

/**
 * Универсального механизм создания ресурсов. Во время выполнения приложение создает и использует конкретные экземпляры
 * механизмов (ConcreteFactory) и порожденные ими конкретные продукты (ConcreteProducts). Получаемые классы полностью
 * соответствуют требованиям (contract), определенным абстрактными механизмами вида AbstractFactory и AbstractProducts,
 * что обеспечивает возможность прямого использования этих конкретных классов без повторного кодирования или
 * перекомпиляции.
 *
 * Реализация: создание людей и настрока локального языка общения.
 */

public class Main {
    public static void main(String[] args) {
        HumanFactory deviceFactory = getDeviceFactoryByModel("Russian");
        Human human = deviceFactory.getHuman();
        human.sayHello();
    }
    private static HumanFactory getDeviceFactoryByModel(String model) {
        if (model.equals("Russian"))
            return new HumanFactoryRus();
        else if (model.equals("British"))
            return new HumanFactoryEng();
        else
            return null;
    }
}





























