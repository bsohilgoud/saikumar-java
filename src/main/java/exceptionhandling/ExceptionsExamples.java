package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExamples {

    public static void IndexOutOfBoundExample() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Enter the index value: ");
        int index = scanner.nextInt();
        System.out.println("The value at that index is : " + arr[index]);
    }


    public static void CompileTimeOrUnCheckedExceptions() {
        try {
            FileInputStream inputStream = new FileInputStream("./Avenger.txt");
        } catch (FileNotFoundException e) {

        }
    }


    public static void RealExample() throws FileNotFoundException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Hey iam a dividing calculator");
            System.out.println(":::::Please provide two values::::");
            int value1 = 0;
            int value2 = 0;
            String databaseConnection = "Open";
            FileInputStream fileInputStream = new FileInputStream("./t");
            try {
                System.out.println("Enter first value : ");
                value1 = scanner.nextInt();
                System.out.println("Enter second value: ");
                value2 = scanner.nextInt();
                if(value1 == 7 || value2 == 7) {
                    System.out.println("Throwing Sai Exception");
                    throw new SaiException("7 is my lucky number");
                }

                if(value1 == 10 || value2 == 10) {
                    System.out.println("Throwing Sai Exception");
                    throw new SaiException("I dont like 10");
                }
                int result = value1 / value2;
                System.out.println("Here is your result = " + result);
            } finally {
                System.out.println("Closing DB connection");
                // Final
                databaseConnection = "Close";
            }
        }
    }
}