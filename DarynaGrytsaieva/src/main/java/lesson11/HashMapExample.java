package lesson11;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Vasya", "+3158787878787");
        map.put("Tom", "+3158787878787");
        map.put("Sam", "+3158787878787");

        System.out.println(map);


        for (String key: map.keySet()){
            System.out.println(map.get(key));
        }

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }

        System.out.println("Values: "+ map.values());




    }
}
