public class Chap49FishClass implements Chap49PreyInterface, Chap49PredatorInterface{
    // we can implement more than one interfaces
    @Override
    public void flee(){
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("*The fish is hunting*");
    }
}
