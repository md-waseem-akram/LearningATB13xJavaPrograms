package ex_OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Fish Shark=new Fish();
        Shark.eat();
    }
}

class Animal{
    int color;
    protected void eat(){
        System.out.println("eats...");
    }
    void breaths(){
        System.out.println("breaths....");
    }
}
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims....");
    }
}