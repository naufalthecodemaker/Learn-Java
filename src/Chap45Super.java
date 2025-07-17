public class Chap45Super {
    public static void main(String[] args){
        // super = refers to the parent class (subclass <- superclass)
        //         it used in constructors and method overriding
        //         calls the parent constructor to initialize attributes

        Chap45PersonClass person = new Chap45PersonClass("Tom", "Jerry");
        Chap45StudentClass student = new Chap45StudentClass("Harry", "Kane", 5.0);
        Chap45EmployeeClass employee = new Chap45EmployeeClass("Lionel", "Ronaldo", 50000);

        person.showName();

        student.showName();
        student.showGPA();

        employee.showSalary();
    }
}
