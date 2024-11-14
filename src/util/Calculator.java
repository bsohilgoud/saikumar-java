package util;

public class Calculator {
    


    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int add(int n1, String n2) {
       return 0;
    }

    static int add(String n2, int n1) {
        return 1;
    }

    static int add(String n1, String n2) {
        return Integer.valueOf(n1) + Integer.valueOf(n2);
    }

    static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }
}
