package Set6;

public class Main {

    public static void main(String[] args) {
        Medals medals = new Medals();
        medals.set(0, 0, 1);
        medals.set(0, 2, 1);
        medals.set(1, 0, 1);

        int[][] values = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};

        int[][] avgOfNeighbours = neighbourAverage(values);

        for (int row = 0; row < avgOfNeighbours.length; row++){
            for (int col = 0; col < avgOfNeighbours[0].length; col++)
                System.out.print(avgOfNeighbours[row][col]);
            System.out.println();}



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

        //werite a method that computes the average of the eight neigbours of all the elemnts of an array
        //if an elemnt is located at the boundary of the array, only inlcude the neghbours that

        int[] [] averages = new int[values.length][values[0].length];

        for(int row = 0;row < averages.length; row++){

            for(int col = 0;col < averages.length; col++){

                int total = 0;
                int count = 0;
                for(int i = row-1; i <= row+1; i ++)
                    //Check to see if i is valid
                    //ignor invalid
                    if(i >=0 && i < averages.length)
                    for(int j = col-1; j <= col+1 ; j ++)
                        if(j >= 0 && j < averages[0].length)
                            //exclude the cell it self
                            if(!(i==row && j == col)) {
                                total += values[i][j];
                                count++;
                            }
                    averages[row][col] = total/count;

            }

        }

        return averages;
    }

}
