public class Chap52GettersAndSetters {
    public static void main(String[] args){
        // they help protect object data and add rules for accessing or modifying them.
        // GETTERS = methods that make a field READABLE
        // SETTERS = methods that make a field WRITABLE

        Chap52CarClass car = new Chap52CarClass("Mustang", "Yellow", 10000);

        // car.model = "Corvette";

        // since color, model, and price are private, we can't normally access them outside the Chap52CarClass,
        // but we can use getters or setters

        // we can't change the model, since the model isn't set
        car.setColor("Blue");
        car.setPrice(5000);

        // we can't read the color, since the color isn't get
        System.out.println(car.getModel() + " " + car.getPrice());
    }
}
