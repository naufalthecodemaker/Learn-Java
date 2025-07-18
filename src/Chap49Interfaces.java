public class Chap49Interfaces {
    public static void main(String[] args){
        // interface = a blueprint for a class that specifies a set of abstracts methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior (can have multiple parents)

        Chap49RabbitClass rabbit = new Chap49RabbitClass();
        Chap49HawkClass hawk = new Chap49HawkClass();
        Chap49FishClass fish = new Chap49FishClass();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
