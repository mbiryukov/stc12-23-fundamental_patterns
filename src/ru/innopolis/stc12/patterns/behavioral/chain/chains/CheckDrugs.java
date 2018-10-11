package ru.innopolis.stc12.patterns.behavioral.chain.chains;

import ru.innopolis.stc12.patterns.behavioral.chain.Chain;
import ru.innopolis.stc12.patterns.behavioral.chain.Passenger;

public class CheckDrugs extends Chain {

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.isHasDrugs()) {
            return false;
        } else {
            return checkNext(passenger);
        }
    }
}
