package ru.innopolis.stc12.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Publisher raceInformator = new PublisherImpl();

        Racer racer = new Racer("Nico Hulkenberg");
        raceInformator.addRacer(racer);
        racer = new Racer("Max Verstappen");
        raceInformator.addRacer(racer);
        racer = new Racer("Sergey Sirotkin");
        raceInformator.addRacer(racer);
        racer = new Racer("Esteban Ocon");
        raceInformator.addRacer(racer);

        raceInformator.notifyRacers(new Race("Monza, 10th of September"));

        System.out.println("");
        raceInformator.deleteRacer(racer);
        raceInformator.notifyRacers(new Race("Suzuka, 10th of October"));
    }
}
