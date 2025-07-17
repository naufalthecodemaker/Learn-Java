public class Chap47ToStringMethod {
    public static void main(String[] args){
        /*
        .toString() = method inherited from the object class.
                      Used to return a string representation of an object
                      By default, it returns a hash code (hex code) as a unique identifier
                      It can be overridden to provide meaningful details
     */

        Chap47CarClass car = new Chap47CarClass("Ford", "Mustang", 2025, "Red");

        System.out.println(car); // toString method, so the output will be the string

    }
}
