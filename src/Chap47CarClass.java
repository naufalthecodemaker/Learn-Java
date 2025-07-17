public class Chap47CarClass {
    // attributes
    String make;
    String model;
    int year;
    String color;

    // constructor
    Chap47CarClass(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
