public class Chap66Generics {
    public static void main(String[] args){
        /*
            Generics = a concept where we can write a class, interface, or method
                       that's compatible with different data types.
                       There's two thing we need:
                       <T> type parameter (placeholder that gets replaced with a real type), can have more than 1 type parameter
                       <String or Integer or Double or Boolean or Character> type argument (specifies the type)
         */

        Chap66BoxClass<String> box1 = new Chap66BoxClass<>(); // store the String data type (type argument)
        Chap66BoxClass<Integer> box2 = new Chap66BoxClass<>(); // store the Integer data type (type argument)
        Chap66BoxClass<Double> box3 = new Chap66BoxClass<>(); // store the Double data type (type argument)
        Chap66BoxClass<Character> box4 = new Chap66BoxClass<>(); // store the Character data type (type argument)
        Chap66BoxClass<Boolean> box5 = new Chap66BoxClass<>(); // store the Boolean data type (type argument)

        box1.setItem("banana");
        System.out.println(box1.getItem());

        box2.setItem(13);
        System.out.println(box2.getItem());

        box3.setItem(3.14);
        System.out.println(box3.getItem());

        box4.setItem('N');
        System.out.println(box4.getItem());

        box5.setItem(true);
        System.out.println(box5.getItem());

        Chap66Product<String, Double> product1 = new Chap66Product<>("apple", 1350.34);
        Chap66Product<String, Integer> product2 = new Chap66Product<>("chicken", 14500);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
