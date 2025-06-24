package ex_06_TurnaryOperator;

public class Lab02_Maxbet3No {
    public static void main(String[] args) {
        int a=10, b=11, c=-15;
        int result = (a>b)? (a>c)?a:c : (b>c)?b:c;
        System.out.println(result);
    }
}
