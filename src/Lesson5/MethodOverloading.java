package Lesson5;

public class MethodOverloading {

    //Method Overloading 1
    void add(int a, int b){
        System.out.println("Sum of Method Overloading 1: " + (a+b));
    }

    //Method Overloading 2
    void add(int a, double b){
        System.out.println("Sum of Method Overloading 2: " + (a+b));
    }

    //Method Overloading 3
    void add(double a, double b){
        System.out.println("Sum of Method Overloading 3: " + (a+b));
    }

    //Method Overloading 4
    void add(int a, int b, int c){
        System.out.println("Sum of Method Overloading 4: " + (a+b+c));
    }

    public static void main(String[] args) {

        MethodOverloading methodOverloading= new MethodOverloading();

        //Calling overloaded method 1
        methodOverloading.add(10,20);

        //Calling overloaded method 2
        methodOverloading.add(10,20.5);

        //Calling overloaded method 3
        methodOverloading.add(10.5,20.5);

        //Calling overloaded method 4
        methodOverloading.add(10,20,30);

    }

}
