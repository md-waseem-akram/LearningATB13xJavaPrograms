package Maps;

import java.util.*;

public class HashmapAllFunctions {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("id",1);
        m1.put("id",1);
        m1.put("id2",1);
        m1.put("id3",1);
        m1.put("id6",1);
        m1.put("id4",1);
        m1.put("id5",1);
        m1.put(null,102);
        m1.put(null,103);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("id2"));
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsValue(99));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get("id3"));
        System.out.println(m1.remove("id3"));
    }
}
