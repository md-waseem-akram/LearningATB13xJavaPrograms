package ex_OOPs;

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1= new Car();
        Car c2= new Car(c1);
        c1.code[0]=10;
        System.out.println(c1.code[0] + c2.code[0]);
    }
}

class Car {
    public String model;
    private String owner;
    public int code[];

    Car(){
        this.model="suzuki";
        this.owner="waseem";
        this.code[0]=0;
        this.code[1]=1;
        this.code[2]=2;
    }
    Car(Car c1){
        this.model = c1.model;
        this.owner=c1.owner;

    }

}

