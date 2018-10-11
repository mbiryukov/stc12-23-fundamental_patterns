package ru.innopolis.stc12.patterns.behavioral.chain;

import ru.innopolis.stc12.patterns.behavioral.chain.chains.CanEnterQueue;
import ru.innopolis.stc12.patterns.behavioral.chain.chains.CheckCash;
import ru.innopolis.stc12.patterns.behavioral.chain.chains.CheckDocuments;
import ru.innopolis.stc12.patterns.behavioral.chain.chains.CheckDrugs;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(true, 4_000, false);
        Queue queue = new Queue(10, 2);

        Chain canPassengerFly = new CanEnterQueue(queue);
        canPassengerFly.linkWith(
                new CheckCash().linkWith(
                        new CheckDocuments().linkWith(
                                new CheckDrugs()
                        )
                )
        );
        System.out.println(canPassengerFly.check(passenger));
    }
}
