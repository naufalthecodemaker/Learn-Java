public class Chap10Printf {
    public static void main(String[] args){
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.59438223;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("Your age is %d years old\n", age);
        System.out.printf("Your height is %.2f cm\n", height);
        System.out.printf("Employed: %b\n\n", isEmployed);
        
        /*
            + -> output a plus
            , -> comma grouping separator
            ( -> negative numbers are enclosed in ()
            space -> display a minus if negative, space if positive
         */
        
        double price = 9000.995;
        double temperature = -43.676;

        System.out.printf("% ,.2f\n", price);
        System.out.printf("% .2f C\n", temperature);

        /*
            0 = zero padding
            positive number = right justified padding
            negative number = left justified padding
         */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
    }
}
