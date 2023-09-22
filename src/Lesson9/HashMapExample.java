package Lesson9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // Declaring hashmap

        //HashMap genericHashMap= new HashMap();
        HashMap<Integer,String> customHashMap= new HashMap<Integer,String>();

        // Adding pairs to hashmap

        customHashMap.put(1,"Aamir");
        customHashMap.put(2,"Hamza");
        customHashMap.put(3,"Suleman");
        customHashMap.put(4,"Usama");

        // Getting size of hashmap

        System.out.println("Before removing pair from HashMap size is: " + customHashMap.size());
        System.out.println("HashMap Pairs: " + customHashMap);

        // Removing pair from hashmap

        customHashMap.remove(3);
        System.out.println("After removing pair from HashMap size is: " + customHashMap.size());
        System.out.println("HashMap Pairs: " + customHashMap);

        // Reading pairs from hashmap

        System.out.println("HashMap Pairs");

        for (Map.Entry hashmapPair: customHashMap.entrySet()) {
            System.out.println("Key: " + hashmapPair.getKey() + "   " + "Value: " + hashmapPair.getValue());
        }

    }

}
