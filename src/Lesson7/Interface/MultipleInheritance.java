package Lesson7.Interface;

interface ABC{

    int x= 100;

    void method1();

}

interface XYZ{

    int y= 200;

    void method2();

}

public class MultipleInheritance implements ABC, XYZ{

    public void method1(){
        System.out.println("X: " + x);
    }

    public void method2(){
        System.out.println("Y: " + y);
    }

    public static void main(String[] args) {

        MultipleInheritance multipleInheritance= new MultipleInheritance();
        multipleInheritance.method1();
        multipleInheritance.method2();

    }

}
