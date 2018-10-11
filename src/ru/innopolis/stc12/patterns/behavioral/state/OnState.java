package ru.innopolis.stc12.patterns.behavioral.state;

public class OnState extends State {
    public OnState(Bike bike) {
        super(bike);
    }

    @Override
    public void onStart() {
        System.out.println("FAIL - already on");
    }

    @Override
    public void onRide() {
        bike.setRiding(true);
        bike.changeState(new RidingState(bike));
        System.out.println("SUCSESS - have a nice trip");
    }

    @Override
    public void onArrive() {
        System.out.println("FAIL - didn't run");
    }

    @Override
    public void onOff() {
        bike.setEngineRunning(false);
        bike.changeState(new OffState(bike));
        System.out.println("Success - switched off");
    }
}
