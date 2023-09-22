package Lesson5;

public class ConstructorOverloading {

    //Constructor Overloading 1
    ConstructorOverloading(int a, int b){
        System.out.println("Sum of Constructor Overloading 1: " + (a+b));
    }

    //Constructor Overloading 2
    ConstructorOverloading(int a, double b){
        System.out.println("Sum of Constructor Overloading 2: " + (a+b));
    }

    //Constructor Overloading 3
    ConstructorOverloading(double a, int b){
        System.out.println("Sum of Constructor Overloading 3: " + (a+b));
    }

    //Constructor Overloading 4
    ConstructorOverloading(int a, int b, int c){
        System.out.println("Sum of Constructor Overloading 4: " + (a+b+c));
    }

    public static void main(String[] args) {

        ConstructorOverloading constructorOverloading;

        //Calling constructor overloading 1
        constructorOverloading= new ConstructorOverloading(10,20);

        //Calling constructor overloading 2
        constructorOverloading= new ConstructorOverloading(10,20.5);

        //Calling constructor overloading 3
        constructorOverloading= new ConstructorOverloading(10.5,20);

        //Calling constructor overloading 4
        constructorOverloading= new ConstructorOverloading(10,20,30);

    }

}
