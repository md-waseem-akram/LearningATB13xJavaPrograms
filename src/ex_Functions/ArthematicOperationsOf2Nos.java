package ex_Functions;

import java.util.Scanner;

public class ArthematicOperationsOf2Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while (true) {
            System.out.print("Enter the first digit: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                break;  // valid integer, exit loop
            } else {
                System.out.println("Enter the integer!");
                sc.next(); // consume the invalid input to avoid infinite loop
            }
        }
        while (true) {
            System.out.print("Enter the second digit: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                break;
            } else {
                System.out.println("Enter the integer!");
                sc.next();
            }
        }

        int Add = Add(a,b);
        System.out.println(Add);
        int Substract = Substract(a,b);
        System.out.println(Substract);
        int Multiplier = Multiply(a,b);
        System.out.println(Multiplier);
        float Division = Division(a,b);
        if(Float.isNaN(Division)){
            System.out.println("Denominator can not be zero");
        }else System.out.println(Division);


    }
    static int Add(int a, int b){
        return a+b;
    }
    static int Substract(int a, int b){
        return a-b;
    }
    static int Multiply(int a, int b){
        return a*b;
    }
    static float Division(int a, int b){
        if (b==0) {
            return Float.NaN;
        }
        return (float)a/b;
    }
}
