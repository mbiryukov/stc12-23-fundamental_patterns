package ru.innopolis.stc12.patterns.creational.builder.components;

public class Engine {
    private static boolean started;
    private final double volume;
    private double mileage;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public static void on() {
        started = true;
    }

    public static void off() {
        started = false;
    }

    public static boolean isStarted() {
        return started;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go!");
        }
    }
}
