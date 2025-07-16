public class Chap41UserClass {
    // attributes
    String username;
    String email;
    int age;

    Chap41UserClass(String username){
        this.username = username;
        // we make the email and age attributes optional
        this.email = "Not provided";
        this.age = 0;
    }

    // if another user have email and age, we can overload the constructor
    // same name of constructor, but different parameters

    Chap41UserClass(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Chap41UserClass(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

    Chap41UserClass(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
}
