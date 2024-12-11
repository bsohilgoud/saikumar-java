package Inheritance;

public class ThreeFloorPlan extends TwoFloorPlan{
    public ThreeFloorPlan(String stepsDirection, String liftDirection) {
        super(stepsDirection, liftDirection);
    }

    public void getExtras() {
        System.out.println("LIFT");
    }

    public void constructSlab2() {
        System.out.println("Constructing slab 2");
    }

    @Override
    public void getBuildingColor() {
        System.out.println("BLUE");
    }

    public void construct() {
        super.construct();
        System.out.println("Contructing lift at : " + liftDirection);
        constructSlab2();
    }
}
