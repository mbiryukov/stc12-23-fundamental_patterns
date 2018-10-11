package ru.innopolis.stc12.patterns.behavioral.observer;

public interface Publisher {
    void addRacer(Racer racer);

    void deleteRacer(Racer racer);

    void notifyRacers(Race race);
}
