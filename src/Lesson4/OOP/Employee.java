package Lesson4.OOP;

public class Employee {

    int id;
    String name;
    double salary;
    int department;
    String designation;

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department No: " + department);
        System.out.println("Designation: " + designation);
    }

}
