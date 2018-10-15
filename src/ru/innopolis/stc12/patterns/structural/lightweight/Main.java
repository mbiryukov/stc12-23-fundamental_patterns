package ru.innopolis.stc12.patterns.structural.lightweight;

import java.awt.*;
import java.util.Scanner;

public class Main {
    static int BIKES_TO_MAKE = 1_000_000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println("Поехали!");

        Garage garage = new Garage();
        for (int i = 0; i < Math.floor(BIKES_TO_MAKE / 9); i++) {
            garage.makeBike(random(100_000, 1_000_000), "Honda CB400", Color.BLUE);
            garage.makeBike(random(100_000, 1_000_000), "Honda CB400", Color.BLACK);
            garage.makeBike(random(100_000, 1_000_000), "Honda CB400", Color.CYAN);
            garage.makeBike(random(100_000, 1_000_000), "Yamaha FZR650", Color.DARK_GRAY);
            garage.makeBike(random(100_000, 1_000_000), "Yamaha FZR650", Color.LIGHT_GRAY);
            garage.makeBike(random(100_000, 1_000_000), "Yamaha FZR650", Color.ORANGE);
            garage.makeBike(random(100_000, 1_000_000), "Suzuki RX1000", Color.PINK);
            garage.makeBike(random(100_000, 1_000_000), "Suzuki RX1000", Color.WHITE);
            garage.makeBike(random(100_000, 1_000_000), "Suzuki RX1000", Color.MAGENTA);
        }
        System.out.println("Закончили генерацию");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
