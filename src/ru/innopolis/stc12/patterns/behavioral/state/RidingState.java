package ru.innopolis.stc12.patterns.behavioral.state;

public class RidingState extends State {
    public RidingState(Bike bike) {
        super(bike);
    }

    @Override
    public void onStart() {
        System.out.println("FAIL-already running");

    }

    @Override
    public void onRide() {
        System.out.println("FAIL - Already running");

    }

    @Override
    public void onArrive() {
        bike.setRiding(false);
        bike.changeState(new ArrivedState(bike));
        System.out.println("SUCCESS - arrived");
    }

    @Override
    public void onOff() {
        System.out.println("FAIL - no engine stop while riding");
    }
}
