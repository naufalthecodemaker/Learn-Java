public class Chap48Triangle extends Chap48ShapeClass{
    double base;
    double height;

    Chap48Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}
