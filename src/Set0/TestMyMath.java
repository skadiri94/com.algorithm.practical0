package Set0;

import javax.swing.*;


public class TestMyMath {

    public static void main(String[] args) {

        double num = MyMath.smallestNum(2,3,1);
        System.out.println(String.format("%.0f",num));//expect 1

         num = MyMath.smallestNum(4,3,6);
        System.out.println(String.format("%.0f",num));//expect 3

         num = MyMath.smallestNum(9,15,11);
        System.out.println(String.format("%.0f",num));//expect 9



        double pwr = MyMath.powOfNum(2,10);
        System.out.println(String.format("%.0f",pwr));//expect 1024

         pwr = MyMath.powOfNum(2,0);
        System.out.println(String.format("%.0f",pwr));//expect 2

        pwr = MyMath.powOfNum(2,1);
        System.out.println(String.format("%.0f",pwr));//expect 2

       double sumofN = MyMath.sumOfNum(3);
        System.out.println(String.format("%.0f",sumofN));//expect 6

        sumofN = MyMath.sumOfNum(2);
        System.out.println(String.format("%.0f",sumofN));//expect 3

        sumofN = MyMath.sumOfNum(1);
        System.out.println(String.format("%.0f",sumofN));//expect 1


        double mOfN = MyMath.numFactorial(3);
        System.out.println(String.format("%.0f",mOfN));//expect 6

        mOfN = MyMath.numFactorial(2);
        System.out.println(String.format("%.0f",mOfN));//expect 4

        mOfN = MyMath.numFactorial(4);
        System.out.println(String.format("%.0f",mOfN));//expect 24

        boolean isprime = MyMath.isPrime(5) ? true : false;

        System.out.println(isprime + " 5 is a Prime Number");//True

        isprime = MyMath.isPrime(11) ? true : false;

        System.out.println(isprime + " 11 is a Prime Number");//True

        isprime = MyMath.isPrime(49) ? true : false;

        System.out.println(isprime + " 49 is a Prime Number");//false

        isprime = MyMath.isPrime(9) ? true : false;

        System.out.println(isprime + " 9 is a Prime Number");//false


        // This takes in  a list of numbers between 1 and 100. A number less than 1 indicates end of input.
        // and Count how many of each number was entered.
        int numCount[] = new int[101];
        int  index;

        index = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
        while(index >= 1) {




                //increase the count of the number entered
                numCount[index] ++;

                index = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number"));


        }

        //This prints out the result
        for(int i = 1; i < numCount.length; i ++){

            //if(numCount[i] != 0)
            System.out.println(i  + "   Was Entered " + numCount[i]);

        }


        //Test for the countWords() which counts the amount of words in a sentence.

        String sentence  = "A start is  Born";

        int numOfWord = MyMath.countWords(sentence);//Number of words = 4

        System.out.println("The Amount of Words in the Sentence is " + numOfWord);

        String password;
        password = JOptionPane.showInputDialog("Enter Password");

        boolean validPassword = false;
        while(!validPassword){

            validPassword = MyMath.isValid(password);

            password = JOptionPane.showInputDialog("Password must be at least 8 characters long and Must contain " +
                    " at least one Upper and Lower Case and at least a Digit Enter again");

        }

        System.out.println("Password Valid");


        //JOptionPane.showMessageDialog(null,pwr,"Test",JOptionPane.INFORMATION_MESSAGE);

        //System.out.println(String.format("%.0f",pwr));
    }


}
