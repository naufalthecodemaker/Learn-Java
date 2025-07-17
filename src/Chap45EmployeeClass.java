public class Chap45EmployeeClass extends Chap45PersonClass{
    // attributes
    int salary;

    // constructor
    Chap45EmployeeClass(String firstName, String lastName, int salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    // methods
    void showSalary(){
        System.out.println(this.firstName + "'s salary is $" + this.salary);
    }
}
