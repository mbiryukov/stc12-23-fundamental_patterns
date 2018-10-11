package ru.innopolis.stc12.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {
    List<Racer> racers = new ArrayList<>();

    @Override
    public void addRacer(Racer racer) {
        if (!racers.contains(racer)) {
            racers.add(racer);
        }
    }

    @Override
    public void deleteRacer(Racer racer) {
        racers.remove(racer);
    }

    @Override
    public void notifyRacers(Race race) {
        for (Racer racer : racers) {
            racer.update(race);
        }
    }
}
