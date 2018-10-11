package ru.innopolis.stc12.patterns.behavioral.command;

public class RightFlash extends Command {

    public RightFlash(Bike bike) {
        super(bike);
    }

    @Override
    public Boolean execute() {
        allOff();
        bike.setRightFlash(true);
        return false;
    }
}
