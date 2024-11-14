package diamondproblem.solution;

public class Child implements FatherInterface, MotherInterface{

    public int myMoney(){
        int myMoney = fatherMoney + motherMoney;
        return myMoney;
    }

    @Override
    public void foo() {
        System.out.println("My Total Money:" + myMoney());
        System.out.println("I am GrandChild Foo");
    }
}
