package accessmodifiers;

public class AnotherClass {
    private Parent parent;

    void method(){
        parent.protectedMethod();
    }
}
