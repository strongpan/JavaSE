import javax.sound.midi.Soundbank;
import javax.sound.sampled.FloatControl;

/**
 * Created by Administrator on 2016/3/27.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,Java!");

        System.out.println("---Byte scope---");
        System.out.println((int)Byte.MIN_VALUE);
        System.out.println((int)Byte.MAX_VALUE);
        System.out.println("---Byte scope---");
        System.out.println('\n');

        System.out.println("---Character scope---");
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println("---Character scope---");
        System.out.println('\n');


        System.out.println("---Short scope---");
        System.out.println((int)Short.MIN_VALUE);
        System.out.println((int)Short.MAX_VALUE);
        System.out.println("---Short scope---");
        System.out.println('\n');

        System.out.println("---Integer scope---");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("---Integer scope---");
        System.out.println('\n');

        System.out.println("---Long scope---");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("---Long scope---");
        System.out.println('\n');

        System.out.println("---Float scope---");
        System.out.println( Float.MIN_VALUE);
        System.out.println( Float.MAX_VALUE);
        System.out.println("---Float scope---");
        System.out.println('\n');

        System.out.println("---Double scope---");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("---Double scope---");
        System.out.println('\n');


        char c1 = 40891;
        //char c2 = ' ';
        char c3 = '\377';//\000 ~ \377
        char c4 = '\u9fbb';

        System.out.println(c1);

        System.out.println(c3);
        System.out.println(c4);
    }
}
