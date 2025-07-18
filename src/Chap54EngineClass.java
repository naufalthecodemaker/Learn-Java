public class Chap54EngineClass{
    String type;

    Chap54EngineClass(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}
