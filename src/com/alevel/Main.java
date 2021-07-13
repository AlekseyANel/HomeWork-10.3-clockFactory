package com.alevel;

public class Main {

    public static void main(String[] args) {

        ClocksFactory clocksFactory = createClocksOfBrand("Sars");//инициируем объект clocksFactory через метод ниже
        // createClocksOfBrand в зависимости от пожеланий марки часов от клиента
        Clocks clock = clocksFactory.createClocks();//создаём объект clock
        clock.writeClocks();//вызываем метод печати соответствующей объету/часам информации
    }

    public static ClocksFactory createClocksOfBrand(String brand) {//создаем метод createClocksOfBrand()
        // класса ClocksFactory для вызова соответствующего бренда объекта/часы
        switch (brand) {
            case "Hermle":
                return new HermleCreator();
            case "HowardMiller":
                return new HowardMillerCreator();
            case "Sars":
                return new SarsCreator();
            default:
                return null;
        }
    }



}
