import util.Calculator;

public class Mobile {
    int RAM;
    int storage;
    int externalStorage;
    String model;

    Mobile(){

    }

    Mobile(int ram, int str){
        RAM = ram;
        int i =10;
        storage = str;
    }

    Mobile(int storage){
        this.storage = storage;
    }

    Mobile(String color){

    }

    public int getTotalStorage(){
        Calculator calculator = new Calculator();
        return calculator.add(externalStorage, storage);
    }

}
