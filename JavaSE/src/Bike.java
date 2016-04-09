import java.nio.channels.spi.AbstractSelectionKey;

/**
 * Created by G.Q.
 * 2016/4/9.
 */
public class Bike extends Vehicle {

    public Bike(String color, int wheel, String energySource, String type) {
        super(color, wheel, energySource, type);
    }

    void fixChain(){
        System.out.println("Bike need to fix Chain");
    }

    public static void main(String[] args) {

        Bike aBike = new Bike("Yellow",2,"Man","Bike");

        aBike.run();

        aBike.fixChain();

    }
}
