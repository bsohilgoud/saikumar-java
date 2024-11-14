package abstraction;

public interface VehicleInterface {
    public abstract int getWheels();
    public abstract String engine();
    public abstract void run();

    public default void howToDrive(){ // Not available before Java 8
        int wheels = getWheels();
        String engine = engine();
        System.out.println("I have " + wheels + " Wheels, with " + engine + " Engine");
        run();
    }
}
