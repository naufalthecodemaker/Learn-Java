public class Chap52CarClass {
    // attributes
    // make them private
    private final String model; // the model isn't writeable
    private String color; // the color isn't readable
    private int price;

    // constructor
    Chap52CarClass(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getPrice(){
        return "$" + this.price;
    }

    void setColor(String color ){
        this.color = color;
    }
    void setPrice (int price){
        if(price < 0){
            System.out.println("Price can't be less than zero!");
        } else{
            this.price = price;
        }
    }
}
