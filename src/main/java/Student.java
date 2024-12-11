import util.Calculator;

public class Student{
    int id;
    private String name;
    int age;
    Address address;
    String course;
    String gender;
    int mathsMarks;
    int scienceMarks;



    Student(String name){
        this.name = name;
    }

    void setAddress(Address address){
        this.address = address;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String print() {
        return "StudentPrint{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getTotal(){
        return Calculator.add(mathsMarks, scienceMarks);
    }

}


/*
*    ------------
*    Id Name Add
*    -----------
*    1  Sai  KP
*    2  Kumar Amer
*
* */