package Inheritance;

public class TwoFloorPlan extends OneFloorPlan {
    String liftDirection;

    public TwoFloorPlan(String stepsDirection, String liftDirection) {
        super(stepsDirection);
        this.liftDirection = liftDirection;
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
