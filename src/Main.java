import classes.Car;
import enums.ZileleSaptamanii;
import interfaces.Movable;

public class Main {
    public static void main(String[] args) {
        for(ZileleSaptamanii zi : ZileleSaptamanii.values())
            System.out.println(zi);

    }
}