package Set4;

public class MyArrays {
    public static int insert(int[] values, int currentSize, int newElement, int pos) {
        if (currentSize < values.length) {
            for (int i = currentSize - 1; i >= pos; i--) {
                values[i + 1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        return currentSize;
    }

    public static int linearSearch(int[] a, int searchKey) {
        for (int i = 0; i < a.length; i++) {
            if (searchKey == a[i]) {
                return i;
            }
        }
        return -1;
    }

    // Binary search
    public static int binarySearch( int array[], int key )
    {
        int low = 0;                  // low subscript
        int high = array.length - 1;  // high subscript
        int middle;                   // middle subscript

        while ( low <= high ) {
            middle = ( low + high ) / 2;

            if ( key == array[ middle ] )  // match
                return middle;
            else if ( key < array[ middle ] )
                high = middle - 1;  // search low end of array
            else
                low = middle + 1;   // search high end of array
        }
        return -1;   // searchKey not found
    }

    public static void selectionSort(int[] a) {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]...[a.length-1]
            int index = i;
            int smallest = a[i];

            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;

            }
        }
    }

    public static void mergeSort(int[] a){

        if (a.length <= 1) { return; }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];


        for (int i = 0; i < first.length; i++)
        {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++)
        {
            second[i] = a[first.length + i];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    public static void merge(int[] a, int[] b, int[] full){
        int iF = 0; int iS = 0; int j = 0;

        while(iF <a.length && iS < b.length){
            if(a[iF] < b[iS]) {
                full[j] = a[iF];
                iF++;
            }
            else{
                full[j] = b[iS];
                iS++;
            }
            j++;
        }
        while(iF< a.length){
            full[j] = a[iF];
            iF++;
            j++;
        }
        while (iS < b.length){

            full[j]=b[iS];
            iS++;
            j++;
        }


    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
