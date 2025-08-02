package ArraList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AskingUseruntilNO {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char ContinueLoop='Y';

        while (Character.toUpperCase(ContinueLoop)=='Y'){
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);
            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ages.add(age);

//            sc.nextLine();
            System.out.println("Do you want to add continue adding Users");
            ContinueLoop = sc.next().charAt(0);
        }
//        for(Object o1 : names){
//            System.out.println(o1);
//        }
//        for(Object o2 : ages){
//            System.out.println(o2);
//        }
        System.out.println("\n Total Users add in the groug "+ names.size());
        System.out.println("User details are below");
        for (int i=0; i< names.size(); i++){
            System.out.println("Name = "+names.get(i)+", Age = "+ ages.get(i));
        }
    }
}
