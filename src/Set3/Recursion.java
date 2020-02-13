package Set3;

public class Recursion {

    public static double myPow(double x, int y){

        if(y == 0)
            return 1;
        else if(y == 1)
            return x;
        else {
           return x* myPow(x,y-1 );
        }
    }

    public static String reverse(String str){

            if(str.equals("") || str.length()==1)
                return str;
            else
                return reverse(str.substring(1)) + str.charAt(0);
    }

}
