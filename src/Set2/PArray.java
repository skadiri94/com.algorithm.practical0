package Set2;

public class PArray {

    public static int insertInArray(int [] values, int currentSize, int pos, int newElement){

        if(currentSize <values.length){

            for(int i = currentSize-1; i >pos-1;i--){
                values[i+1]=values[i];

            }
            values[pos]=newElement;
            currentSize = currentSize+1;
        }

        return currentSize;

    }

    public static int remove(int [] values, int currentSize, int pos){

        if(pos< currentSize){
            for(int i = pos-1; i<currentSize-1;i++){

                values[i]=values[i+1];
            }
            currentSize = currentSize-1;
        }

      return currentSize;
    }

    public static void shuffle(int [] values){

        int temp;

        for(int i = 0; i <values.length;i++){

            for(int j=i+1;j<values.length-1;j++){
                temp = values[i];
                values[i]=values[j];
                //System.out.println("Curr Value " + (values[i]=values[j]));
                values[j]=temp;


            }


        }
    }
}
