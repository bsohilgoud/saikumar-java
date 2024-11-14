package exceptionhandling;

public class SaiException extends RuntimeException{
      SaiException(){
            super();
      }

      public SaiException(String message){
            super(message);
      }
}
