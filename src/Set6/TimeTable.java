package Set6;

public class TimeTable {

    private final int HOURS = 9 ;  // 9 hours per day
    private final int DAYS = 5;


    private ClassDetails[][] grid;

    public TimeTable(){
        grid = new ClassDetails[HOURS][DAYS];
        // the grid will have null values
    }

    public void set(int hour, int day, ClassDetails details) {
        // store details at the specified position in the grid
        grid[hour][day] = details;

    }

    public void display() {


        // display the grid

        // Print headings
        System.out.printf("%15s", "");
        for (int i = 0; i < DAYS; i++){
            System.out.printf("%8s","Days "+ i );
        }
        System.out.println();


        // Print hours, counts, and row totals
        for (int i = 0; i < HOURS; i++) {
            // Process the ith row
            System.out.printf("%15s", "HOURS" + i);


            // Print each row element and update the row total
            for (int j = 0; j < DAYS; j++) {
                if(grid[i][j] != null)
                    System.out.printf("%8s", grid[i][j].getName());
                else
                System.out.printf("%8s", "-");

            }
            System.out.println();
        }

    }

    public ClassDetails get(int hour, int day) {
        // returns the object at the specified position in the grid
        return grid[hour][day];

    }

    public int getNumberOfClassesFor(String name){ //e.g. get number of Algorithms classes
        int totalClassNum = 0;
        for(int i=0;i<HOURS;i++){

            for(int j=0;j<DAYS;j++){

               //if(name.equals(grid[i][j]))
                if(grid[i][j] != null) {
                    if (name.equals(get(i, j).getName()))
                        totalClassNum++;
                }
            }

        }

        return totalClassNum;
}

    public int getNumberOfFreeSlots(){

        int totalFreeSlot = 0;
        for(int i=0;i<HOURS;i++){

            for(int j=0;j<DAYS;j++){

                if(grid[i][j].equals("-"))
                    totalFreeSlot ++;
            }

        }

        return totalFreeSlot;
    }

}
