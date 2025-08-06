package Maps;

import java.sql.SQLOutput;
import java.util.*;

public class HashmapExample {
    public static void main(String[] args) {
        Map <String, Integer> Vehicles  = new HashMap<>();
        Vehicles.put("BMW",1);
        Vehicles.put("Honda", 2);
        Vehicles.put("TATA",5);
        Vehicles.put("TESLA",1);
        Vehicles.put("MG",4);
        System.out.println(Vehicles);
        System.out.println(Vehicles.size()); // displays the size

        for(String key : Vehicles.keySet()){
            System.out.println(key +"->"+Vehicles.get(key));
        }

        if(Vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else System.out.println("No");

        Vehicles.clear(); // clears all key value pairs
        for(String key : Vehicles.keySet()){
            System.out.println(key +"->"+Vehicles.get(key));
        }

    }
}
