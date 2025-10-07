import classes.Car;
import interfaces.Movable;

public class Main {
    public static void main(String[] args) {
        Movable movable = new Car();

        movable.start();

        movable.move();

        Car car = new Car();

        car.stop();
    }
}