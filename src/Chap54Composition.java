public class Chap54Composition {
    public static void main(String[] args){
        // composition = represents a "part-of" relationship between objects.
        //               example = an engine is "part-of" a Car.
        //               it allows complex objects to be constructed from smaller objects.

        // the main difference between composition and aggregation is:
        // composition: if we delete our car object, the engine object CAN'T exist independently (part-of)
        // aggregation: if we delete our library object, the book object CAN exist independently (has-a)

        Chap54CarClass car = new Chap54CarClass("Mustang", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type); // we accessed our engine object and find type attribute

        car.start();
    }
}
