package classes;

import interfaces.Movable;

public class Car implements Movable {
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
