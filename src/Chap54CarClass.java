public class Chap54CarClass {
    // attributes
    String model;
    int year;
    Chap54EngineClass engine;

    // construction
    Chap54CarClass(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Chap54EngineClass(engineType);
        // when we construct the car object, we also construct the engine object (this called composition)
    }

    void start(){
        this.engine.start(); // we accessed our engine method and find start() method
        System.out.println("The " + this.model + " is running");
    }
}
