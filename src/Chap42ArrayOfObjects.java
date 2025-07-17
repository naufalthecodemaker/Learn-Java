public class Chap42ArrayOfObjects {
    public static void main(String[] args){
        /*
        Chap42CarClass car1 = new Chap42CarClass("Mustang", "Red");
        Chap42CarClass car2 = new Chap42CarClass("Ford", "Blue");
        Chap42CarClass car3 = new Chap42CarClass("Tesla", "Yellow");
        */

        // create an array of objects
        // Chap42CarClass[] cars = new Chap42CarClass[3];
        //                       or
        Chap42CarClass[] cars = {new Chap42CarClass("Mustang", "Red"),
                                 new Chap42CarClass("Ford", "Blue"),
                                 new Chap42CarClass("Tesla", "Yellow")};

        for (Chap42CarClass car : cars) { // for every car object in array cars, do this code
            car.color = "black";
            car.drive();
        }
    }
}
