public class Chap46FishClass extends Chap46AnimalClass{
    // method overriding, because fish can't run
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}
