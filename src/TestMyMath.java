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


        double mOfN = MyMath.calNNum(3);
        System.out.println(String.format("%.0f",mOfN));//expect 18

        mOfN = MyMath.calNNum(2);
        System.out.println(String.format("%.0f",mOfN));//expect 4

        mOfN = MyMath.calNNum(4);
        System.out.println(String.format("%.0f",mOfN));//expect 24


        //JOptionPane.showMessageDialog(null,pwr,"Test",JOptionPane.INFORMATION_MESSAGE);

        //System.out.println(String.format("%.0f",pwr));
    }
}
