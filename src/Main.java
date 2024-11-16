

import collections.ArrayListExample;
import collections.MyLL;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MyLL ll = new MyLL();
        ll.add("Harshith");
        ll.add("b1");
        ll.add("bargav2");
        ll.add("vamshui");
        ll.add("sai");

        System.out.println(ll);

        ll.size = 5;

        ll.addAtPosition("suresh", 4);
        System.out.println(ll);

    }

    public static void arrayExample(){
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.arr[0] = 1;
        arrayListExample.arr[1] = 2;
        // we missed the 3
        arrayListExample.arr[2] = 4;
        arrayListExample.arr[3] = 5;
        arrayListExample.arr[4] = 6;

        // we have to insert 3 at index 2 => arr[2] = 3 -> but this will remove the '4'
        // but we have to maintain the 4 by shifting it to right

        arrayListExample.print();

        // arr[2] = 3
        arrayListExample.insertWithShifting(2, 3, 5);

        System.out.println("After: \n");
        arrayListExample.print();
    }
}

