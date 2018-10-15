package ru.innopolis.stc12.patterns.structural.bridge;

public abstract class Transport {
    protected Handler handler;

    public Transport(Handler handler) {
        this.handler = handler;
    }

    public abstract void workWith();
}
