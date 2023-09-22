package Lesson3;

public class Strings {

    public static void main(String[] args) {

        String string1= "welcome";
        String string2= " to java";

        //Length of string
        System.out.println("String Length: " + string1.length());

        //Concatenation of string
        System.out.println("Concatenation of string1 and string2: " + string1.concat(string2));

        //Trimming the string
        string1="     welcome     ";
        System.out.println("Without trim: " + string1);
        System.out.println("With trim: " + string1.trim());

        //Finding character from string
        string1= "welcome";
        System.out.println("Character at 3 index: " + string1.charAt(3));

        //Checking characters are available in string or not
        System.out.println("Given characters are available in string: " + string1.contains("wel"));
        System.out.println("Given characters are available in string: " + string1.contains("Wel"));
        System.out.println("Given characters are available in string: " + string1.contains("com"));

        //Comparing strings using equals
        string1= "welcome";
        string2= "welcome";
        System.out.println("Comparing strings using equals");
        System.out.println("Strings are equal: " + string1.equals(string2));
        System.out.println("Strings are equal: " + string1.equals("Welcome"));
        System.out.println("Strings are equal: " + string1.equals("WELCOME"));

        //Comparing strings using equalsIgnoreCase
        string1= "welcome";
        string2= "welcome";
        System.out.println("Comparing strings using equalsIgnoreCase");
        System.out.println("Strings are equal: " + string1.equalsIgnoreCase(string2));
        System.out.println("Strings are equal: " + string1.equalsIgnoreCase("Welcome"));
        System.out.println("Strings are equal: " + string1.equalsIgnoreCase("WELCOME"));

        //Replacing characters
        string1= "welcome";
        string2= "welcome to java";
        System.out.println("After Replaced: " + string1.replace('e','a'));
        System.out.println("After Replaced: " + string2.replace("java","selenium"));

        //Getting partial characters from string using substring methods
        System.out.println("Getting partial characters from string using substring methods");
        System.out.println("Substring: " + string1.substring(1,3));
        System.out.println("Substring: " + string1.substring(0,4));
        System.out.println("Substring: " + string1.substring(2,4));
        System.out.println("Substring: " + string1.substring(4,7));

        //Lower case letters
        string1= "WELCOME";
        System.out.println("Lower Case Letters: " + string1.toLowerCase());

        //Upper case letters
        string2= "welcome";
        System.out.println("Upper Case Letters: " + string2.toUpperCase());
    }

}
