public class Chap46MethodOverriding {
    public static void main(String[] args){
        // method overriding = when a subclass provides its own implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementation

        // make some objects
        Chap46DogClass dog = new Chap46DogClass();
        Chap46CatClass cat = new Chap46CatClass();
        Chap46FishClass fish = new Chap46FishClass();

        dog.move();
        cat.move();
        fish.move();

    }
}
