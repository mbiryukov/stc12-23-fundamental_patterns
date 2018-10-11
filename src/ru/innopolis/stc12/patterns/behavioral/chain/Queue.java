package ru.innopolis.stc12.patterns.behavioral.chain;

public class Queue {
    private int capacity;
    private int busy;

    public Queue(int capacity, int busy) {
        this.capacity = capacity;
        this.busy = busy;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBusy() {
        return busy;
    }
}
