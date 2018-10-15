package ru.innopolis.stc12.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        CarCarrier carrier = new CarCarrierImpl(1.5);
        Car car = new CarImpl(1.8);
        if (carrier.transportCar(car)) {
            System.out.println("Успешно перевезли");
        } else {
            System.out.println("Перевозка не удалась");
        }

        Bike bike = new Bike("0.5");
        bike.raceto("Some", 100);
        if (carrier.transportCar(new BikeAdapter(bike))) {
            System.out.println("Успешно перевезли");
        } else {
            System.out.println("Перевозка не удалась");
        }
    }
}
