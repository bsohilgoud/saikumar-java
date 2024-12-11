package abstraction;

public class SuperBike implements VehicleInterface {

    @Override
    public int getWheels() {
        return 10;
    }

    @Override
    public String engine() {
        return "Ultra Turbo 10000000000cc";
    }

    @Override
    public void run() {
        System.out.println("I am Flying my SuperBike");
    }

    public void activateBoot(){
        System.out.println("Activating boot");
    }
}
