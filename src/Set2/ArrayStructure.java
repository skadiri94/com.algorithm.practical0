package Set2;

public class ArrayStructure {


    public static int insert(int[] values, int currentSize, int pos, int newElement) {

        if(currentSize < values.length) {
            for (int i = currentSize -1; i > pos-1; i--) {
                values[i+1] = values[i];

            }
            values[pos] = newElement;
            currentSize = currentSize +1;
        }

        return currentSize;
    }

}
