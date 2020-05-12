package Set2;

public class InsertTest {

    public static void main(String[] args) {
        int[] ppl = new int[6];

        ppl[0] = 1;
        ppl[1] = 3;
        ppl[2] = 5;
        ppl[3] = 4;
        ppl[4] = 7;
        ppl[5] = 6;

        int pos = 3;
        int cS = 6;
        int newEl = 8;

        /*
        cS = PArray.insertInArray(ppl, cS, pos, newEl);
        for (int i = cS-1; i >= 0; i--) {

            System.out.println(ppl[i]);
        }

        System.out.println("Current Size is "+cS);

    */
        cS = PArray.remove(ppl, cS, pos);
        for (int i = 0; i < cS; i++) {

            System.out.println(ppl[i]);//1347
        }

        System.out.println("Current Size is "+cS);//5

        PArray.shuffle(ppl);
        System.out.println("Shuffled");//67431
        for (int i = 0; i < cS; i++) {

            System.out.println(ppl[i]);
        }
    }





}
