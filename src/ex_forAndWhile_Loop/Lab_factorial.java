package ex_forAndWhile_Loop;

import java.util.Scanner;

public class Lab_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        if(!sc.hasNextInt()){
            System.out.println("Enter the integer!");
            return;
        }
        int num=sc.nextInt();
        int factorial =1;
        if(num<0){
            System.out.println("Enter a positive Integer");
            return;
        }
        if (num==0){
            System.out.println(factorial);
        }else{
            for (int i=1; i<=num; i++){
                factorial=factorial*i;
            }
            System.out.println(factorial);
        }


    }
}
