public class Chap48Rectangle extends Chap48ShapeClass{
    double length, width;

    Chap48Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width ;
    }
}
