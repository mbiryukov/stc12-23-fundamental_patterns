package ru.innopolis.stc12.patterns.behavioral.command;

public class AccidentFlash extends Command {
    public AccidentFlash(Bike bike) {
        super(bike);
    }

    @Override
    public Boolean execute() {
        bike.setRightFlash(true);
        bike.setLeftFlash(true);
        return false;
    }
}
