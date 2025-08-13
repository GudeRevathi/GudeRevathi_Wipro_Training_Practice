package session_22;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        //Convert a Collection to an Array
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry","mango","orange"));
        String[] array = list.toArray(new String[0]);
        System.out.println("Array from Collection: "+Arrays.toString(array));
      

        // Find a sublist in the List
        List<String> subList = list.subList(1, 3);  
        System.out.println("Sublist of the list: "+ subList);
        

        //Iterate through elements of HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println("Iterating over HashMap:");
        // Using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
     // Shuffle the arrayList
        System.out.println("Before Shuffling the array:" + list);
        Collections.shuffle(list);
        System.out.println("After shuffling the arraylist: "+ list);
        
        List<Integer> list1 = Arrays.asList(10, 3, 45, 7, 22);

        int min = Collections.min(list1);
        int max = Collections.max(list1);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        
        
    }
}

