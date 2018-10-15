package ru.innopolis.stc12.patterns.structural.decorator;

import ru.innopolis.stc12.patterns.structural.decorator.bikes.EnduroBike;
import ru.innopolis.stc12.patterns.structural.decorator.bikes.SportBike;
import ru.innopolis.stc12.patterns.structural.decorator.decorators.Helmet;
import ru.innopolis.stc12.patterns.structural.decorator.decorators.RainCoat;

public class Main {
    public static void main(String[] args) {
        Bike bike = new SportBike();
        System.out.println(bike.getDescription());
        System.out.println(bike.cost());

        System.out.println("_________");
        bike = new EnduroBike();
        bike = new Helmet(new RainCoat(bike));
        System.out.println(bike.getDescription());
        System.out.println(bike.cost());
    }
}
