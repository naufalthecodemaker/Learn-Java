public class Chap41OverloadedConstructors {
    public static void main(String[] args){
        // overloaded constructors = allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways

        Chap41UserClass user1 = new Chap41UserClass("Spongebob");
        Chap41UserClass user2 = new Chap41UserClass("Patrick", "pStar@yahoo.com");
        Chap41UserClass user3 = new Chap41UserClass("Sandy", "sCheeks123@gmail.com", 29);
        Chap41UserClass user4 = new Chap41UserClass();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
