public class Chap55WrapperClasses {
    public static void main(String[] args){
        /*
            Wrapper classes = allow primitive values (int, char, double, boolean)
                              to be used as objects. "Wrap them in an object"
                              Generally, don't wrap primitives unless we need an object.
                              Allows use of Collections Framework and static Utility Methods
         */

        int a = 123;
        // we can treat this integer as objects by using wrapper class

        // autoboxing
        Integer objectA = 123;
        Double objectB = 3.14;
        Character objectC = '$';
        Boolean objectD = true;
        String objectE = "hello";

        // unboxing
        int x = objectA;
        double y = objectB;

        // convert primitive value into a String
        String p = Integer.toString(123);
        String q = Double.toString(3.14);
        String r = Character.toString('@');
        String s = Boolean.toString(true);

        String z = p + q + r + s;
        System.out.println(z);

        // convert string into a primitive value
        int f = Integer.parseInt("456");
        double g = Double.parseDouble("3.14");
        char h = "hello".charAt(0);
        boolean i = Boolean.parseBoolean("true");

        System.out.println(f);

        char letter = 's';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
