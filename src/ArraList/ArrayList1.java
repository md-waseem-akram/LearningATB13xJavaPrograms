package ArraList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add(3);
        l.add("abc");
        l.add(4);
        l.add(true);
        l.add("Some apples");
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(4));

        System.out.println(l);
        System.out.println("-----------------");
        System.out.println(l.remove(1));
        for (int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println(l.get(3));
        l.clear();
        System.out.println(l);
    }
}
