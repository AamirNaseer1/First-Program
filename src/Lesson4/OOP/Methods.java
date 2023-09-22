package Lesson4.OOP;

public class Methods {

    int x=10;
    int y=20;

    //Case1: Not taking any parameter and not returning any value
//    void sum(){
//        System.out.println("Sum: " + (x+y));
//    }

    //Case2: Not taking any parameter but returning the value
//    int sum(){
//        return (x+y);
//    }

    //Case3: Taking parameter but not returning any value
//    void sum(int a, int b){
//        System.out.println("Sum: " + (a+b));
//    }

    //Case4: Taking parameter and also returning the value
    int sum(int a, int b){
        return (a+b);
    }

    public static void main(String[] args) {

        Methods calculation= new Methods();

        //Case1: Not taking any parameter and not returning any value
        //calculation.sum();

        //Case2: Not taking any parameter but returning the value
//        System.out.println("Sum: " + calculation.sum());

        //Case3: Taking parameter but not returning any value
//        calculation.sum(calculation.x, calculation.y);

        //Case4: Taking parameter and also returning the value
        System.out.println("Sum: " + calculation.sum(calculation.x, calculation.y));

    }

}
