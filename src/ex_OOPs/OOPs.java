package ex_OOPs;

public class OOPs {
    public static void main(String[] args){
        Pen p1=new Pen();
//        p1.setColor("Blue");
        p1.color="blue";//we can simply change it since there is no access modifiers
        p1.setTip(5);
        System.out.println(p1.color+"  "+p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
