package Lesson7.Interface;

class A1{
    void m1(){
        System.out.println("This m1 method is from A1 Class");
    }
}

interface B1{
    void m2();
}

interface B2{
    void m3();
}

public class HybridInheritance extends A1 implements B1, B2{

    public void m2(){
        System.out.println("This m2 is method from B1 Interface");
    }

    public void m3(){
        System.out.println("This m3 is method from B2 Interface");
    }

    public static void main(String[] args) {

        HybridInheritance hybridInheritance= new HybridInheritance();
        hybridInheritance.m1();
        hybridInheritance.m2();
        hybridInheritance.m3();

    }

}
