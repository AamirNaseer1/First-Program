package Lesson5;

public class ThisKeyword {

    int a,b;

    void setValues(int a, int b){
        this.a=a;
        this.b=b;
    }

    void printValues(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {

        ThisKeyword thisKeyword= new ThisKeyword();

        thisKeyword.setValues(10,20);
        thisKeyword.printValues();

    }

}
