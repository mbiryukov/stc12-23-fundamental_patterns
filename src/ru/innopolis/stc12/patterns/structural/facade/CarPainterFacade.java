package ru.innopolis.stc12.patterns.structural.facade;

public class CarPainterFacade {
    public void paint(String manufacturer) {
        CarMechanic carMechanic = new CarMechanic();
        if (carMechanic.PullOffBumper(manufacturer)) {
            CarPainter carPainter = new CarPainter();
            if (carPainter.paintBumper(manufacturer)) {
                QualityController qualityController = new QualityController();
                if (qualityController.check()) {
                    System.out.println("Бампер покрашен");
                    return;
                }
            }
        }
        System.out.println("Неудачная покраска");
    }
}
