package ex_Functions;

public class UserDefinedFunctions {
    public static void main(String[] args) {
        FunctionWithoutPWithoutRT();

        String Greeting = FunctionWithoutPWithRT();
        System.out.println(Greeting);

        FunctionWithPWithoutRT("Waseem", 25, 100);

        int sum = FunctionWithPWithRT(10,20) ;
        System.out.println(sum);
    }
    //First type: without parameters and without return type
    static void FunctionWithoutPWithoutRT(){
        System.out.println("This is FirstType");
    }

    //Second type: Without Parameters and with return type
    static String FunctionWithoutPWithRT(){
        return "Hello, I am 2nd Type";
    }

    //Third type: With Parameters and without return type
    static void FunctionWithPWithoutRT(String name, int age, double salary){
        System.out.println("Iam 3rd type\n Your name is -> "+name + "\n Your age is -> "+age+ "\n Your salary is-> "+salary);
    }

    //Fourth type: With Parameters and with return type
    static int FunctionWithPWithRT(int a, int b){
        System.out.println("I am 4th type");
        return a+b;
    }

}
