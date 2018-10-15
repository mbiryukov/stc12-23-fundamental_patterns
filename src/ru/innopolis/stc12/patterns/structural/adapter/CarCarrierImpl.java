package ru.innopolis.stc12.patterns.structural.adapter;

public class CarCarrierImpl implements CarCarrier {
    private double carWeight;

    public CarCarrierImpl(double carWeight) {
        this.carWeight = carWeight;
    }

    public double getCarWeight() {
        return carWeight;
    }

    @Override
    public boolean transportCar(Car car) {
        if (this.carWeight < car.getWeight()) {
            return false;
        }
        car.driveTo("Заехать на автовоз");
        System.out.println("Автовоз перевозит машину");
        car.driveTo("Съехать с автовоза");
        return true;
    }
}
