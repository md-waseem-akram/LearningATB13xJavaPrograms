package ex_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        String CanIVote = age>=18 ? "Yes" : "No";
        System.out.println(CanIVote);
    }
}
