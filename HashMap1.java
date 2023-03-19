import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();   //unordered map = print not sequencially
        
        //Insertion
        map.put("India",001);
        map.put("US", 002);
        map.put("Germany",003);
        map.put("China",002);
        System.out.println(map);

        // map.put("China",004);
        // System.out.println(map);

        //Searching
        // if(map.containsKey("pk")){
        //     System.out.println("This key is exists");
        // }
        // else{
        //     System.out.println("This key is not exist");
        // }

        // System.out.println(map.get("India"));
        // System.out.println(map.get("UK"));

        // int arr[] = {12, 13, 14, 15, 16};
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set <String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " " +map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
