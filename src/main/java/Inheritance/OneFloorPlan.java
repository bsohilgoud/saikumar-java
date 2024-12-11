package Inheritance;

import java.util.ArrayList;
import java.util.Set;

public class OneFloorPlan {
    public String stepsDirection;
    protected int land;
    private int password;

    public OneFloorPlan(String stepsDirection) {
        this.stepsDirection = stepsDirection;
    }

    public void getBuildingColor() {
        System.out.println("RED");
    }

    public void constructSlab1() {
        System.out.println("Constructing slab 1");
    }

    public void construct() {
        // 100 lines
        System.out.println("Contructing steps at : " + stepsDirection);
        constructSlab1();
    }
}
