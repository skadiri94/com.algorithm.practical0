package Set0;

import static java.lang.Character.*;

public class MyMath {

    //this Method takes in 3 parameters which are integers value and return the smallest among the integers

    public static double smallestNum(int a, int b, int c) {
        double smallestNum = a;

        if (smallestNum > b)
            smallestNum = b;
        if (smallestNum > c)
            smallestNum = c;

        return smallestNum;
    }

    //This method find the power of an integer by taking in two int number a and b as parameters and returning a double

    public static double powOfNum(int a, int b) {


        double result = a;
    for(int i = 0;i<b-1;i++) {
        result *= a;
    }
        return result;

    }

//The method takes a single parameter of type int and  and finds the sum of 1 to n, n=a and returns a double.

    public static double sumOfNum(int a){

        double result=a;
        double nextN=1;
        for(int i = 0;i<a-1;i++) {

            result += nextN;
            nextN++;
        }
        return result;

    }

    //This takes in a int value and calculates for its factorial and returns a double.

    public static double numFactorial(int a){

            double result = a;
        for(int i = 2 ;i< a;i++) {

            result *= i;

        }
        return result;

    }

    //This method takes in a single parameter and loops through its factorial to check if its a prime number or not
    //
    // and returns a boolean result

    public static boolean isPrime(int a){

        boolean valid = false;

      int i = 2;

            while(i<Math.sqrt(a)){

                if(a % i == 0)
                    valid = true;

              i++;
            }


        return valid;
    }

    public static int countWords(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i ++){


            if(i != 0 && str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
                count++;
        }

        return count+1;
    }

    /**
     * Its a boolean method that takes in a password parameter and validates it to see if its meets requirements
     * It must be at least 8 characters long
     * must contain and Uppercase Letter
     * must contain at least one digit
     * @param password the parameter that is being validated
     * @return a boolean data type.
     */
    public static boolean isValid(String password){

        boolean valid = false;

            int upperCase = 0, lowerCase = 0, digits = 0;

                if(password.length()>=8){

                    for(int i = 0; i < password.length()-1; i ++){

                    if(isUpperCase(password.charAt(i)))
                         upperCase++;
                    if(isLowerCase(password.charAt(i)))
                        lowerCase++;
                    if(isDigit(password.charAt(i)))
                        digits++;

                    }

                    if(upperCase != 0 && lowerCase != 0 && digits != 0)
                        valid = true;

            }


       return valid;
    }
}
