package Inheritance;

public class Child extends Parent{
    public int childVar1 = 1;
    public int childVar2 = 2;

    public void childMethod1(){
        System.out.println("child Method 1");
    }

    public void childMethod2(){
        System.out.println("child Method 2");
    }


    public void whoamI(){
         System.out.println("Child");
    }

    public void whoamI(String param1){
        System.out.println("Method1: " + param1);
    }

    public void whoamI(String param1, String param2){
        System.out.println("Method2: " + param1);
    }

    @Override
    public void changePassword(String as1){
        // Data base -> change password
    }

}
