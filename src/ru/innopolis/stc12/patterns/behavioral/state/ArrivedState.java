package ru.innopolis.stc12.patterns.behavioral.state;

public class ArrivedState extends State {
    public ArrivedState(Bike bike) {
        super(bike);
    }

    @Override
    public void onStart() {
        System.out.println("FAIL - engine is running");
    }

    @Override
    public void onRide() {
        bike.setRiding(true);
        bike.changeState(new RidingState(bike));
        System.out.println("SUCCESS - have a nice trip");
    }

    @Override
    public void onArrive() {
        System.out.println("FAIL - already arrived");
    }

    @Override
    public void onOff() {
        bike.setEngineRunning(false);
        bike.changeState(new OffState(bike));
        System.out.println("SUCCESS - engine is off");
    }
}
