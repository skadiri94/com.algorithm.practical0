package Set4;

import java.util.Arrays;
import java.util.Random;

import static Set4.MyArrays.mergeSort;
import static java.lang.System.currentTimeMillis;

public class TestMyArrays {
    public static void main(String[] args) {

        long before,after,duration;
        Random random = new Random();
        final int SIZE = 200000;
        int[] a = new int[SIZE];
        int[] b  = new int[SIZE];
        int[] c  = new int[SIZE] ;
        int [] d  = new int[SIZE];
        int [] e  = new int[SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            c[i] = a[i];
            d[i] = a[i];
            e[i] = a[i];
        }


        /*
        int [] values = new int[100];
        values[0] = 1;
        values[1] = 4;
        values[2] = 15;
        values[3] = 23;
        values[4] = 55;
        
        int currentSize = 5;
        
        currentSize = MyArrays.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55
       
        for (int i=0; i < currentSize; i++)
            System.out.println(values[i]);


        int [] nValues = new int[7];
        nValues[0] = 5;
        nValues[1] = 9;
        nValues[2] = 2;
        nValues[3] = 5;
        nValues[4] = 3;
        nValues[5] = 1;
        nValues[6] = 8;

        mergeSort(nValues);

        for (int i=0; i < nValues.length; i++)
            System.out.println(nValues[i]);//1235589
*/







        //Arrays.sort ()

        System.out.println("Time for Arrays.sort () before ");
        before = System.currentTimeMillis();
        Arrays.sort(e);
        after = System.currentTimeMillis();
        duration = after - before;
        System.out.println("Time for Arrays.sort () Afer " + duration);

        //mergSort()

        System.out.println("Time for Merg() before " );
        before = System.currentTimeMillis();
        MyArrays.mergeSort(d);
        after = System.currentTimeMillis();
        duration = after - before;
        System.out.println("Time for Merg() Afer " + duration);


        //insertionSort()

        System.out.println("Time for insertionSort() before " );
        before = System.currentTimeMillis();
        MyArrays.insertionSort(c);
        after = System.currentTimeMillis();
        duration = after - before;
        System.out.println("Time for insertionSort()Afer " + duration);

        //selectionSort()


        System.out.println("Time for  selectionSort() before " );
        before = System.currentTimeMillis();
        MyArrays.selectionSort(b);
        after = System.currentTimeMillis();
        duration = after - before;
        System.out.println("Time for  selectionSort() Afer  " + duration);



    }



}
