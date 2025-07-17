public abstract class Chap48ShapeClass { // we can't create any Chap48ShapeClass object
    abstract double area(); // abstract

    void display(){ // concrete method => inherited
        System.out.println("This is a shape");
    }
}
