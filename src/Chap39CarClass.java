public class Chap39CarClass {
    // attributes => things that the object have
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    // methods => actions that the object do
    void start(){
        isRunning = true;
        System.out.println("You start the engine!");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine!");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }
}
