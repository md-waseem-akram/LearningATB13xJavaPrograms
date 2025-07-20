package ex_OOPs;

public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("waseem");
        Student s3=new Student(123);
        System.out.println(s1+" "+s2.name+" "+s3.roll);
    }
}
class Student{
    public String name;
    public int roll;
    Student(){
//        System.out.println("Constructor is called....");
    }
    Student(String name ){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    Student (String name, int roll){
        this.name=name;
        this.roll=roll;
    }
}
