public class Chap48Circle extends Chap48ShapeClass{
    // attributes
    double radius;

    // constructor
    Chap48Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
