
/**
 * Created by G.Q.
 * 2016/4/9.
 */
public class Car extends Vehicle {


    public Car(){

    }

    public Car(String color, int wheel, String energySource, String type) {
        super(color, wheel, energySource, type);
    }

    void fillOil(){
        System.out.println("Car need to fill oil");

    }

    public static void main(String[] args) {
        Car aCar = new Car();
        Car bCar = new Car("Black",4,"OilPower","Car");
        //Car aCar = (Car) new Vehicle("Black",4,"OilPower");

        bCar.run();

        bCar.fillOil();

    }

}
