package ru.innopolis.stc12.patterns.behavioral.state;

public class OffState extends State {
    public OffState(Bike bike) {
        super(bike);
    }

    @Override
    public void onStart() {
        bike.setEngineRunning(true);
        bike.changeState(new OnState(bike));
        System.out.println("SUCCESS - engine started");
    }

    @Override
    public void onRide() {
        System.out.println("FAIL - engine is off");

    }

    @Override
    public void onArrive() {
        System.out.println("FAIL - engine is off");

    }

    @Override
    public void onOff() {
        System.out.println("FAIL - engine already off");
    }
}
