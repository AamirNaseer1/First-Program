package Lesson4.OOP;

public class Constructors {

    int x;
    int y;

    //Default constructor
    Constructors(){
        x=10;
        y=20;
    }

    //Parameterized constructor
    public Constructors(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("Sum: " + (x+y));
    }

    public static void main(String[] args) {

        //Default constructor
        Constructors defaultConstructor= new Constructors();
        defaultConstructor.display();

        //Parameterized constructor
        Constructors parameterizedConstructor= new Constructors(10,20);
        parameterizedConstructor.display();

    }

}
