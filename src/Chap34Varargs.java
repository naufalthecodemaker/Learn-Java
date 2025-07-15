
public class Chap34Varargs {
    public static void main(String[] args){
        /* variable arguments allow a method to accept a varying number of arguments
            makes methods more flexible
            java will pack the arguments into an array
            ... (ellipsis)
         */

        System.out.printf("Average: %.2f", average(1, 2, 3, 4));
    }

    static double average(int... numbers){ // no need to use overloaded methods
        int sum = 0;
        double average;

        if(numbers.length == 0){
            return 0;
        }

        for(int number : numbers){
            sum += number;
        }

        average = (double) sum / numbers.length;

        return average;
    }
}
