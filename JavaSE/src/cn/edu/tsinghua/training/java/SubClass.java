package cn.edu.tsinghua.training.java;

/**
 * Created by G.Q.
 * 2016/4/9.
 */
public class SubClass extends SuperClass {


    void method(){
        System.out.println("this is subclass method");
    }


    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.method();

    }

}
