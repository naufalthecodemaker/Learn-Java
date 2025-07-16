public class Chap40Constructors {
    public static void main(String[] args){
        // constructor = a special method to initialize objects
        //              we can pass arguments to a constructor
        //              and set up initial values

        Chap40StudentClass student1 = new Chap40StudentClass("Spongebob", 30, 3.2);
        Chap40StudentClass student2 = new Chap40StudentClass("Patrick", 34, 1.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();

        student1.study();
        student2.study();
    }
}
