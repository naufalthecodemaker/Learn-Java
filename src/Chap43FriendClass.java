public class Chap43FriendClass {
    // attributes
    static int numOfFriends;
    String name;

    Chap43FriendClass(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("you have " + numOfFriends + " total friends");
    }
}
