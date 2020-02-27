package Set5;

import java.util.Scanner;

public interface Directory {
    public void load(String fileName);
    public String lookup(String searchName);
    public void add(String name, String number);
    public void save(String fileName);
}
