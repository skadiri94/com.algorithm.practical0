public class MyMath {

    //this Method takes in 3 intergers value and return the smallest among the integers

    public static double smallestNum(int a, int b, int c) {
        double smallestNum = a;

        if (smallestNum > b)
            smallestNum = b;
        if (smallestNum > c)
            smallestNum = c;

        return smallestNum;
    }

    public static double powOfNum(int a, int b) {


        double result = a;
    for(int i = 0;i<b-1;i++) {
        result *= a;
    }
        return result;

    }


    public static double sumOfNum(int a){

        double result=a;
        double nextN=1;
        for(int i = 0;i<a-1;i++) {

            result += nextN;
            nextN++;
        }
        return result;

    }

    public static double calNNum(int a){

        double result=a;
        double nextN=2;
        for(int i = 0;i<a-1;i++) {

            result *= nextN;
            nextN++;
        }
        return result;

    }

    public static boolean isPrime(){

        boolean result = false;


        return result;
    }
}
