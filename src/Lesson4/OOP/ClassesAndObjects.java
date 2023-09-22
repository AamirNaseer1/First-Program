package Lesson4.OOP;

public class ClassesAndObjects {

    public static void main(String[] args) {

//        //Creating Object
//        Employee employee1= new Employee();
//        Employee employee2= new Employee();
//
//        //Accessing class variables and methods using object
//        employee1.id= 101;
//        employee1.name= "Aamir";
//        employee1.salary= 50000;
//        employee1.department= 10;
//        employee1.designation= "Software Test Engineer";
//        employee1.display();
//
//        employee2.id= 102;
//        employee2.name= "Usama";
//        employee2.salary= 40000;
//        employee2.department= 10;
//        employee2.designation= "Web Developer";
//        employee2.display();

//        //Creating Object
//        Student student1= new Student();
//
//        //Assigning values using reference variables
//        System.out.println("Assigning values using reference variables");
//        student1.student_Id= 101;
//        student1.student_Name= "Aamir";
//        student1.student_Grade= 'A';
//        student1.display();
//
//        //Assigning values using method
//        System.out.println("Assigning values using methods");
//        student1.setStudentValues(102,"Usama",'B');
//        student1.display();

        //Creating object and values will be assigned automatically because of constructor
        Student student1= new Student(101, "Aamir",'A');
        System.out.println("Values are assigned automatically by constructor");
        student1.display();


    }

}
