
public class Chap13StringMethods {
    public static void main(String[] args){
        String name = "Naufal Rahman";

        int length = name.length();
        char letter = name.charAt(0); // character at index 0
        int index = name.indexOf("a"); // find index of a character
        int lastIndex = name.lastIndexOf("a"); // last index of a character

        // name = name.toUpperCase(); // capslock all characters
        // name = name.toLowerCase(); // lowercase all characters
        // name = name.trim(); // cut if there is a space in the right and left of the string
        // name = name.replace("a", "o"); // replace a with the o in the string

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        /* System.out.println(name.isEmpty()); // check if the string empty or not

        if(name.isEmpty()){
            System.out.println("your name is empty");
        } else{
            System.out.printf("Hello, %s", name);
        }
        */

        /*
        if(name.contains(" ")){
            System.out.println("your name contains a space");
        } else{
            System.out.println("your name DOESN'T contain any spaces");
        }
        */

        /*
        if(name.equalsIgnoreCase("password")){
            System.out.println("your name can't be password!");
        } else{
            System.out.printf("Hello, %s", name);
        }
        */
    }
}
