package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public int[] arr = new int[7];

    public void insertWithShifting(int position, int value, int currentSize) {
        for(int i = currentSize - 1; i >= position; i--){
                arr[i+1] = arr[i];
        }

        arr[position] = value;
    }

    public void print(){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " -> ");
        }
    }
}
