public class Chap50Polymorphism {
    public static void main(String[] args){
        // polymorphism => "POLY" = "MANY"
        //                 "MORPH" = "SHAPE"
        //                 Objects can identify as other objects.
        //                 Objects can be treated as objects of a common superclass
        //                 Polymorphism can also be achieved by using interfaces

        // example = dog can be identified as a dog, but also can be identified as an animal and can be identified as an organism.
        //           dog object can be identified as more than one thing

        Chap50CarClass car = new Chap50CarClass();
        Chap50BikeClass bike = new Chap50BikeClass();
        Chap50BoatClass boat = new Chap50BoatClass();

        // car, bike, and boat are identified as themselves and also as vehicles
        // car, bike, and boat are treated as Vehicle objects through polymorphism
        Chap50VehicleInterface[] vehicles = {car, bike, boat};

        for(Chap50VehicleInterface vehicle : vehicles){ // for every vehicle in vehicles array, do this code
            vehicle.go();
        }
    }
}
