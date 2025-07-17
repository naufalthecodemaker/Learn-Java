public class Chap45PersonClass {
    // attributes
    String firstName;
    String lastName;

    // constructor
    Chap45PersonClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
