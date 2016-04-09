import java.net.SocketPermission;

/**
 * Created by G.Q.
 * 2016/4/9.
 */
public class Human {

    String name;
    double height;
    double weight;
    int age;
    char sex;


    Human(){

    }
    Human(double weight){

        this.weight = weight;
    }

    String eat() {

        String eatVolume;
        if( weight > 100 ){
            eatVolume = "Remind to lose weight !";
        }
        else {
            eatVolume = "enjoy your food";
        }

        return eatVolume;
    }

    int walk() {

        int steps;
        if( weight > 100 ){
            steps = 10000;
        }
        else {
            steps = 5000;
        }

        return steps;
    }

    void study() {

        return;
    }

    void playgame() {

        return;
    }

    public static void main(String[] args) {

        Human fat = new Human(150);
        System.out.println("Your Eating suggestion : " + fat.eat());
        System.out.println("You need to go : " + fat.walk() + "steps.");

        Human fit = new Human(80);
        System.out.println("Your Eating suggestion : " + fit.eat());
        System.out.println("You need to go : " + fit.walk() + "steps.");





    }

}
