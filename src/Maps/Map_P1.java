package Maps;

import java.util.*;

public class Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap<>();
        m1.put("name","Waseem");
        m1.put("rollno",120);
        m1.put("phone",1234546789);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name", "Waseem");
        m2.put("rollno",121);
        m2.put("phone",123456789);
        System.out.println("------");
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("name", "Waseem");
        m3.put("rollno",123);
        m3.put("phone",123456789);
        m3.put("ghafsdlg",12378);
        System.out.println("------");
        System.out.println(m3);
    }
}
