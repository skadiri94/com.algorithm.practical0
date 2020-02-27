package Set5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDirectory implements Directory {
    private ArrayList<DirectoryEntry> directory;

    public ArrayListDirectory() {
        directory = new ArrayList<DirectoryEntry>();
    }

    public void load(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            Scanner in = new Scanner(reader);

            while (in.hasNextLine()) {
                String name = in.next();
                String number = in.next();
                DirectoryEntry newEntry = new DirectoryEntry(name, number);

                directory.add(newEntry);
            }

            // now sort the directory

        } catch (IOException exc) {
            System.out.println("File does not exist");
        }
    }

    public String lookup(String searchName) {
        return null;
    }

    public void add(String name, String number) {

    }

    public void save(String fileName) {

    }
}