package ru.innopolis.stc12.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = null;
        Car prototype = new OffroadCar("e123ее116", 19);
        CarCloner carCloner = new CarCloner(prototype);
        for (int i = 0; i < 20; i++) {
            car = carCloner.copyCar();
            System.out.println(car);
        }
    }
}
