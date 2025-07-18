public class Chap49HawkClass implements Chap49PredatorInterface{
    // if hawk implements Predator interface, then the method MUST BE defined
    @Override
    public void hunt(){
        System.out.println("*The hawk is hunting*");
    }
}
