package Set2;

import java.lang.reflect.Array;

public class TestArray {

    public static void main(String[] args) {

        int age[] = new int[10];

        age[0] = 4;
        age[1] = 5;
        age[2] = 6;
        age[3] = 7;
        age[4] = 8;
        int currentSize = 5;

        currentSize = ArrayStructure.insert(age,currentSize,3,9);

        System.out.println("Current Size is " + currentSize);//6
        for(int i = 0; i< currentSize; i++){
            System.out.println(age[i]);//456978
        }
    }
}
