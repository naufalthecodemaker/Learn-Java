public class Chap42CarClass {
    // attributes
    String model;
    String color;

    // constructor
    Chap42CarClass(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
