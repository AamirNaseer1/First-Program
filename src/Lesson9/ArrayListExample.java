package Lesson9;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Declaring an array list

        ArrayList genericArrayList= new ArrayList();
        //ArrayList<String> stringArrayList= new ArrayList<String>();
        //ArrayList<Integer> integerArrayList= new ArrayList<Integer>();

        // Adding values to array list

        genericArrayList.add("Aamir");
        genericArrayList.add("Hamza");
        genericArrayList.add("Suleman");
        genericArrayList.add("Usama");

        // Getting size of an array list

        System.out.println("Before removing value from Array List size is: " + genericArrayList.size());
        System.out.println("Array List Values: " + genericArrayList);

        // Removing values from array list

        genericArrayList.remove(2);
        System.out.println("After removing value from Array List size is: " + genericArrayList.size());
        System.out.println("Array List Values: " + genericArrayList);

        // Adding values to array list at specific index

        genericArrayList.add(2,"Suleman");
        System.out.println("After inserting value to Array List size is: " + genericArrayList.size());
        System.out.println("Array List Values: " + genericArrayList);

        // Reading values from array list

        System.out.println("Array List Values");

        for (int i = 0; i < genericArrayList.size(); i++) {
            System.out.println(genericArrayList.get(i));
        }

    }

}
