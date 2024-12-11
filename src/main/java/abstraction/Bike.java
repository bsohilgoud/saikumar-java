package abstraction;

public class Bike extends VehicleAbstractClass{
    @Override
    public int getWheels() {
        return 2;
    }

    @Override
    public String engine() {
        return "150cc";
    }

    @Override
    public void run() {
        System.out.println("Iam Riding Bike");
    }
}
