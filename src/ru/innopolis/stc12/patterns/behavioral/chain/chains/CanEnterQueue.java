package ru.innopolis.stc12.patterns.behavioral.chain.chains;

import ru.innopolis.stc12.patterns.behavioral.chain.Chain;
import ru.innopolis.stc12.patterns.behavioral.chain.Passenger;
import ru.innopolis.stc12.patterns.behavioral.chain.Queue;

public class CanEnterQueue extends Chain {
    private Queue queue;

    public CanEnterQueue(Queue queue) {
        this.queue = queue;
    }

    @Override
    public boolean check(Passenger passenger) {
        if (queue.getCapacity() > queue.getBusy()) {
            return checkNext(passenger);
        } else {
            return false;
        }
    }
}
