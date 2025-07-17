public class Chap48Abstraction {
    public static void main(String[] args){
        /*
            abstract = used to define abstract classes and methods.
                       Abstraction is the process of hiding implementation details
                       and showing only the essential features (important feature)

                       Abstract classes CAN'T be instantiated directly
                       Can contain 'abstract' methods (which must be implemented)
                       Can contain 'concrete' methods (which are inherited)
         */

        // Chap48ShapeClass shape = new Chap48ShapeClass(); // this class is abstract and can't be instantiated

        Chap48Circle circle = new Chap48Circle(3);
        Chap48Triangle triangle = new Chap48Triangle(4,5);
        Chap48Rectangle rectangle = new Chap48Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
