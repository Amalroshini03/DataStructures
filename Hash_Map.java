package Tree;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

    public static void main(String[] args) {

        // Create HashMap using keys and values (Generics)

        // Creating object for map

        Map<Integer, String> hashMap = new HashMap<>();

        // Insertion:

        // Key-Values user-defined values:

        hashMap.put(1, "AI");
        hashMap.put(2, "ML");
        hashMap.put(3, "CSD");

        // Assigning the key for Hashing:

        System.out.println("Key Value 1: " + hashMap.get(2));

        // Print all the values of Key:

        System.out.println("HashMap: " + hashMap);

        // Deletion:

        hashMap.remove(3);

        // Print the value after remove():

        System.out.println("After Removal of hash: " + hashMap);
    }
}
