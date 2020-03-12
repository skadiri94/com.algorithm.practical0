package Set6;

public class Main {

    public static void main(String[] args) {
        Medals medals = new Medals();
        medals.set(0,0, 1);
        medals.set(0, 2, 1);
        medals.set(1, 0, 1);

        //etc
        medals.display();

        int totalMedals = medals.total();

        System.out.println("\n\nTotal medals " + totalMedals);

        int[] medalsTotal = medals.calculateColumnTotals();



        int[] countryTotals = medals.calculateRowTotals();

        //Display the row totals
        System.out.println("Row Totals: ");
        for (int i = 0; i < countryTotals.length; i++) {
            System.out.println(countryTotals[i]);
        }

        System.out.println("Column Totals: ");
        for (int i = 0; i < medalsTotal.length; i++) {
            System.out.println("\n\nTotal medals " + medalsTotal[i]);
        }
    }


    public static int[][] neighbourAverage(int[][] values){

        float [] average = new float[values][values];

        for(int i = 0;i)


    }
}
