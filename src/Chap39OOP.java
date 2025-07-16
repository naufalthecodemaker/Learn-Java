public class Chap39OOP {
    public static void main(String[] args){
        // object = an entity that holds data (attributes) and can perform actions (methods)
        // object is a reference data type

        /*
        Scanner scanner = new Scanner(System.in); // Scanner object
        Random random = new Random(); // Random object
        */

        Chap39CarClass car1 = new Chap39CarClass(); // create an object called Car
        Chap39CarClass car2 = new Chap39CarClass();

        // car.isRunning = true; // change the attribute

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

        car1.drive();
        car1.brake();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.make);
    }
}
