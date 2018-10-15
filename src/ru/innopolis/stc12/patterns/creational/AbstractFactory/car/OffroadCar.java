package ru.innopolis.stc12.patterns.creational.AbstractFactory.car;

public class OffroadCar implements Car {
    @Override
    public void wash() {
        System.out.println("Мыть внедорожную машину");
    }

    @Override
    public void setup() {
        System.out.println("Настраивать внедорожную машину");
    }
}
