package ex_OOPs;

public class MethodOverriding {
    public static void main(String[] args) {
        Dear d1= new Dear();
        d1.eats();
    }
}
class Animals{
    void eats(){
        System.out.println("It eats anything");
    }
}
class Dear extends Animals{
    void eats(){
        System.out.println("It eats grass");
    }
}
