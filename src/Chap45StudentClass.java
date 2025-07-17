public class Chap45StudentClass extends Chap45PersonClass{
    // attributes
    double gpa;;

    // constructor
    Chap45StudentClass(String firstName, String lastName, double gpa){
        super(firstName, lastName); // get the constructor from the parent
        this.gpa = gpa;
    }

    // methods
    void showGPA(){
        System.out.println(this.firstName + "'s gpa is " + this.gpa);
    }
}
