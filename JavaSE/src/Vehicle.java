/**
 * Created by G.Q.
 * 2016/4/9.
 */
public class Vehicle {

    String color;
    int wheel;
    String energySource;
    String type;

    public Vehicle() {
    }

    public Vehicle(String color, int wheel, String energySource, String type) {
        this.color = color;
        this.wheel = wheel;
        this.energySource = energySource;
        this.type = type;
    }

    void run(){
        System.out.println("A " + color + " " + type + " runs on " + wheel + " wheels," + "powered by " + energySource );
    }

    void breakStop(){

    }

}
