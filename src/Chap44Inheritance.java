public class Chap44Inheritance {
    public static void main(String[] args){
        // Inheritance = one class / child class inherits the attributes and methods from another class / parent class
        //               child <- parent <- grandparent

        Chap44DogClass dog = new Chap44DogClass();
        Chap44CatClass cat = new Chap44CatClass();
        Chap44PlantClass plant = new Chap44PlantClass();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
