package Lesson7.Interface;

interface A{

    int a=10; //by default variables in interface are static and final

    void method1(); //abstract method and by methods in interface are public
}

public class Test implements A{

    public void method1(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        //Class Object
        Test test= new Test();
        System.out.println("Using class object");
        test.method1();

        //Interface Object
        A a1= new Test();
        System.out.println("Using interface object");
        a1.method1();

    }

}
