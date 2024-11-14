package collections;

public class ArraysExamples {
    public static void howArrayWorksInternally(){
        int a = 10; // 2000
        int b = 20; // 2345
        int c = 30; // 3235

        char[] charArray = new char[]{'x', 'y', 'z'};
        // -> 4000 + 4001 + 4002
        // calculation => location + size * (given index)
        // charArray[0] = 4000 + (1 x 0) = 4000
        // charArray[2] = 4000 + (1 x 2) = 4002
        System.out.println(charArray[0]);
        System.out.println(charArray[2]);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        arr[6] = 1;

        // newArr[0] = given element
        // newArr[1] => arr[0]
        // newArr[2] => arr[1]
        int[] bigArr = new int[10];
        // copy
        for(int i =0; i<arr.length; i++){
            bigArr[i] = arr[i];
        }

        bigArr[6] = 1;
        return bigArr;


         // 3000, 3004, 3008, 3012, 3016

        // calculation => location + size * (given index)
        // charArray[0] = 3000 + (4 x 0) = 3000
        // charArray[4] = 3000 + (4 x 4) = 3016
        System.out.println(arr[0]);
        System.out.println(arr[4]);

    }
}
