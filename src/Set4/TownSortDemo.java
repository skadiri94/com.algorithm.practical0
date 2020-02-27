package Set4;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

import java.util.Collections;
import java.util.ArrayList;

public class TownSortDemo {
    public static void main(String[] args) {
        Town[] towns = new Town[5];
        towns[0] = new Town("Tralee", "Kerry", 23000);
        towns[1] = new Town("Macroom", "Cork", 3800);
        towns[2] = new Town("Listowel", "Kerry", 4820);
        towns[3] = new Town("Adare", "Limerick", 2650);
        towns[4] = new Town("Killarney", "Kerry", 14500);

        displayArray(towns);

        Arrays.sort(towns);
        System.out.println("\nSorted List");
        displayArray(towns);
        String searchName = JOptionPane.showInputDialog("Please Enter Town: ");
        Town  searchTown  = new Town(searchName,null,0);

        int result = Arrays.binarySearch(towns, searchTown);
        System.out.println(result);//4

        if(result<0)
            System.out.println(searchTown + "not found");
        else{
            String county = towns[result].getCounty();
            System.out.println("for " + searchName + "\nCounty :" + county);
        }


        ArrayList<Town> towns1 = new ArrayList<Town>();

        towns1.add(new Town("Tralee", "Kerry", 23000));
        towns1.add(new Town("Macroom", "Cork", 3800));
        towns1.add(new Town("Listowel", "Kerry", 4820));
        towns1.add(new Town("Adare", "Limerick", 2650));
        towns1.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nArrayList");
        displayArrayList(towns1);

        Collections.sort(towns1);
        System.out.println("\nSorted ArrayList");
        displayArrayList(towns1);
    }

    private static void displayArray(Town[] towns) {
        for (int i = 0; i < towns.length; i++) {
            System.out.println(towns[i]);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns1) {
        for (Town t : towns1) {
            System.out.println(t);
        }
    }
}