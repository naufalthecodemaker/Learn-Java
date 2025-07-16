public class Chap40StudentClass {
    // attributes
    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    // create a constructor
    Chap40StudentClass(String name, int age, double gpa){
        this.name = name; // to assign this attribute, use this. => refers to the object that we're currently working with
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}

