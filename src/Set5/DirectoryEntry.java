package Set5;

public class DirectoryEntry implements Comparable<DirectoryEntry> {
    private String name;
    private String number;

    public DirectoryEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int compareTo(DirectoryEntry entry) {
        // to be completed
        return 0;
    }
}
