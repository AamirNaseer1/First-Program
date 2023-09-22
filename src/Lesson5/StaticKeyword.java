package Lesson5;

import java.io.PrintStream;

public class StaticKeyword {

    static int a=10; //static variable
    int b=20; //non-static variable

    //static method
   static void staticMethod(){
       System.out.println("This is a static method");
    }

    //non-static method
    void nonStaticMethod(){
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {

        StaticKeyword staticKeyword= new StaticKeyword();

       // Using static variable
        System.out.println("Static Variable: " + a);

        // Using non-static variable
        System.out.println("Non-Static Variable: " + staticKeyword.b);

        // Calling static method
        staticMethod();

        // Calling non-static method
        staticKeyword.nonStaticMethod();
    }

}
