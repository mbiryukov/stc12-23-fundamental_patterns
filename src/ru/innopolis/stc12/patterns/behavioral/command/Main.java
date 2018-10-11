package ru.innopolis.stc12.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        executeCommand(new LeftFlash(bike));
        bike.printState();

        executeCommand(new RightFlash(bike));
        bike.printState();

        executeCommand(new AccidentFlash(bike));
        bike.printState();
    }

    private static void executeCommand(Command command) {
        command.execute();
    }
}
