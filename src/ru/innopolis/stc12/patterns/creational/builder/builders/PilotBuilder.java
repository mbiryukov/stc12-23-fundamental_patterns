package ru.innopolis.stc12.patterns.creational.builder.builders;

import ru.innopolis.stc12.patterns.creational.builder.bikes.Pilot;
import ru.innopolis.stc12.patterns.creational.builder.bikes.Types;
import ru.innopolis.stc12.patterns.creational.builder.components.Engine;
import ru.innopolis.stc12.patterns.creational.builder.components.Transmission;
import ru.innopolis.stc12.patterns.creational.builder.components.TripComputer;

public class PilotBuilder implements Builder {
    private Types type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;


    @Override
    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmittion(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTrimComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Pilot getResult() {
        return new Pilot(type, seats, engine, transmission, tripComputer);
    }
}
