import exceptionhandling.ExceptionsExamples;
import exceptionhandling.SaiException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        try {
            ExceptionsExamples.RealExample();

            try{


            }catch (ArithmeticException e){

            }

        } catch (InputMismatchException e) {
            System.out.println("Sorry You have provided wrong input");
        } catch (SaiException s){
            System.out.println("SaiException: \n " + s);
        } catch (FileNotFoundException f) {
            System.out.println(f);
        } finally {

        }
    }
}

