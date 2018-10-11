package ru.innopolis.stc12.patterns.behavioral.command;

public class LeftFlash extends Command {

    public LeftFlash(Bike bike) {
        super(bike);
    }

    @Override
    public Boolean execute() {
        allOff();
        bike.setLeftFlash(true);
        return false;
    }
}
