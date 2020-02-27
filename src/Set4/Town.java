package Set4;

public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareTo1(Town other)
    {
        //compare this.population with other.population
        if (this.population < other.population) { return -1; }
        else if (this.population == other.population) { return 0; }
        else { return 1; }
    }

    public int compareTo(Town other)
    {
        //compare this.population with other.populatione
        return  this.name.compareTo(other.name);
    }

    public static int binarySearch( Town [] List, Town key )
    {
        int low = 0;                  // low subscript
        int high = List.length - 1;  // high subscript
        int middle;                   // middle subscript

        while ( low <= high ) {
            middle = ( low + high ) / 2;

            if ( key.compareTo(List[ middle ]) == 0 )  // match
                return middle;
            else if ( key.compareTo(List[ middle ]) == -1 )
                high = middle - 1;  // search low end of array
            else
                low = middle + 1;   // search high end of array
        }
        return -1;   // searchKey not found
    }


    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }
}


