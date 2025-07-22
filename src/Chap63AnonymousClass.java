public class Chap63AnonymousClass {
    public static void main(String[] args){
        /*
            Anonymous class = a class that doesn't have a name. Can't be reused.
                              Add custom behavior without having to create a new class.
                              Often used for one time uses (TimerTask, Runnable, callbacks)
         */

        Chap63DogClass dog1 = new Chap63DogClass();

        // rather than creating a new class just for this one object, we'll use the anonymous class instead
        Chap63DogClass dog2 = new Chap63DogClass(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
