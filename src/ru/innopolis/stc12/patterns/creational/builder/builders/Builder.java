package ru.innopolis.stc12.patterns.creational.builder.builders;

import ru.innopolis.stc12.patterns.creational.builder.bikes.Types;
import ru.innopolis.stc12.patterns.creational.builder.components.Engine;
import ru.innopolis.stc12.patterns.creational.builder.components.Transmission;
import ru.innopolis.stc12.patterns.creational.builder.components.TripComputer;

public interface Builder {
    public void setType(Types type);

    public void setSeats(int seats);

    public void setEngine(Engine engine);

    public void setTransmittion(Transmission transmittion);

    public void setTrimComputer(TripComputer tripComputer);

}
