package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingExample {
    public static void writeFile(){
        // jpg, pdf, txt, png, exe, jar
        try {
            String name = "IronMan";
            byte[] data = new byte[]{'H', 'u', 'l' ,'k'};
//            byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
            FileOutputStream fileOutputStream = new FileOutputStream("./Avenger.txt", true);
            fileOutputStream.write(data);
        } catch (FileNotFoundException f){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void readTextFile(){
        try (FileReader fileReader = new FileReader("./Avenger.txt")){
            char[] storage = new char[4];
            fileReader.read(storage);
            for(int i=0; i<storage.length; i++){
                System.out.println("(char) storage[i] = " +  storage[i]);
            }
        } catch (Exception e){
            
        }
    }

    public static void readAndWriteImage(){
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./image.jpg"), 100000);

            byte[] bytes = bufferedInputStream.readAllBytes();

            FileOutputStream fileOutputStream = new FileOutputStream("./half_copied.jpg");
            fileOutputStream.write(bytes);

        } catch (Exception e){

        }
    }


}
