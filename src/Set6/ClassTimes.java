package Set6;

public class ClassTimes {
    public static void main(String[] args) {

        ClassDetails cd = new ClassDetails("Algor", "R302");

        TimeTable nTB = new TimeTable();
        nTB.set(0,0,cd);

        nTB.display();

        int classTotal = nTB.getNumberOfClassesFor("Algor");
        System.out.println("Total Num of Class " + classTotal);


       // for(int i = 0; i < nTB.length)

    }
}
