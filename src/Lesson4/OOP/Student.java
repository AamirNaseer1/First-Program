package Lesson4.OOP;

public class Student {

    int student_Id;
    String student_Name;
    char student_Grade;

    //Creating constructor
    public Student(int student_Id, String student_Name, char student_Grade) {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.student_Grade = student_Grade;
    }

    void display(){

        System.out.println("ID: " + student_Id);
        System.out.println("Name: " + student_Name);
        System.out.println("Grade: " + student_Grade);

    }

    void setStudentValues(int id, String name, char grade){

        student_Id= id;
        student_Name= name;
        student_Grade= grade;

    }

}
