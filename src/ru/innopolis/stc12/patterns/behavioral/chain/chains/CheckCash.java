package ru.innopolis.stc12.patterns.behavioral.chain.chains;

import ru.innopolis.stc12.patterns.behavioral.chain.Chain;
import ru.innopolis.stc12.patterns.behavioral.chain.Passenger;

public class CheckCash extends Chain {
    private static final double MAX_CASH = 5_000;


    @Override
    public boolean check(Passenger passenger) {
        if (passenger.getCash() > MAX_CASH) {
            return false;
        } else {
            return checkNext(passenger);
        }
    }
}
