package ex_OOPs;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1= new Calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum(1, 2, 3));
        System.out.println(c1.sum(1.2f, 1.5f));
    }
}
class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public float sum(float a, float b){
        return a+b;
    }
}
