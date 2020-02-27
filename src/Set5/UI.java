package Set5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UI {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String fileName = "details.txt";

        Directory directory = new ArrayListDirectory();
        FileReader reader = new FileReader(fileName);
        directory.load(fileName);

        boolean more = true;
        while (more) {
            System.out.println("L)ookup Name, A)dd entry, Q)uit?");
            String cmd = in.nextLine();

            if (cmd.equalsIgnoreCase("Q"))
                more = false;
            else if (cmd.equalsIgnoreCase("L")) {
                System.out.println("Enter name:");
                String n = in.nextLine();
                System.out.println("Phone number: " + directory.lookup(n));
            } else if (cmd.equalsIgnoreCase("A")) {
                System.out.println("Enter name to be added:");
                String name = in.nextLine();
                System.out.println("Enter phone number:");
                String number = in.nextLine();

                directory.add(name, number);
            }
        }
    }
}

