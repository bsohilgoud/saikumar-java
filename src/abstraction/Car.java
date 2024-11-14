package abstraction;

public class Car extends VehicleAbstractClass{
    @Override
    public int getWheels() {
        return 4;
    }

    @Override
    public String engine() {
        return "2400cc";
    }

    @Override
    public void run() {
        System.out.println("I am Driving Car");
    }
}
