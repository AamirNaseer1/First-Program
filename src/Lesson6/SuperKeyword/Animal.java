package Lesson6.SuperKeyword;

public class Animal {

    String color= "white";

    void eating(){
        System.out.println("Eating .....");
    }

    Animal(){
        System.out.println("Animal is created");
    }

}

class Dog extends Animal{

    String color= "black";

    void displayColor(){
        //Using child class instance variable
        System.out.println("Child Class Color: " + color);
        //Using child parent instance variable
        System.out.println("Parent Class Color: " + super.color);
    }

    void eating(){
        //invoking child class method
        System.out.println("Eating bread .....");
        //invoking parent class method
        super.eating();
    }

    Dog(){
        //invoking parent constructor
        super();

        //invoking child constructor
        System.out.println("Dog is created");
    }

}
