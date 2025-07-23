import java.util.HashMap;

public class Chap67Hashmaps {
    public static void main(String[] args){
        /*
            Hashmaps = a data structure that stores key-value pairs.
                       Keys are unique, but values can be duplicated.
                       Doesn't maintain any order, but its memory is efficient
                       HashMap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>(); // the key is String product, the value is Double price

        map.put("apple", 0.554);
        map.put("orange", 0.889);
        map.put("banana", 0.256);
        map.put("coconut", 0.678);

        // map.remove("apple");

        System.out.println(map);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsValue(1.32));
        System.out.println(map.size());

        // looping through a hashmap
        for(String key : map.keySet()){
            System.out.printf("\n%s : $%.2f", key, map.get(key));
        }
        System.out.println("\n");

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        } else{
            System.out.println("Key not found!");
        }
    }
}
