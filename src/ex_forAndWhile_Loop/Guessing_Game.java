package ex_forAndWhile_Loop;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Random random= new Random();
        int numtoGuess = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        while(true){
            int attempt =1;
            if(num<numtoGuess){
                System.out.println("Enter a larger number");
                num = sc.nextInt();
            } else if (num>numtoGuess) {
                System.out.println("Enter a smaller number");
                num = sc.nextInt();
            }else{
                System.out.println("Congrats your num found at"+ attempt+ "attempt");
                return;
            }
            attempt++;
        }

    }
}
