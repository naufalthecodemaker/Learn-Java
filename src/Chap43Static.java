public class Chap43Static {
    public static void main(String[] args){
        // static = makes a variable or method belong to the class (focused to the class, not to the one of the object)
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources

        Chap43FriendClass friend1 = new Chap43FriendClass("Spongebob");
        Chap43FriendClass friend2 = new Chap43FriendClass("Patrick");
        Chap43FriendClass friend3 = new Chap43FriendClass("Squidward");

        System.out.println(Chap43FriendClass.numOfFriends); // the output is 3, because using static, the increment will be focused on class,
                                                            // not to the specific object (friend1, friend2, friend3)

        Chap43FriendClass.showFriends();

        // math class also static
        double result = Math.round(3.99);
        System.out.println(result);
    }
}
