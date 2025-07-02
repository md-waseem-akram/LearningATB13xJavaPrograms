package ex_Switch;

import java.util.Scanner;

public class Lab_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = sc.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome": System.out.println("Starting the chrome");
                break;
            case "mozilla" : System.out.println("Starting the Mozilla");
                break;
            case "opera" : System.out.println("Opera is not supported");
                break;
            default:
                System.out.println("Enter proper name");
                break;
        }
    }
}
