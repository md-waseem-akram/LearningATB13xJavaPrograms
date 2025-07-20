package ex_OOPs;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount Acc1=new BankAccount();
        Acc1.username="mwa";
//        Acc1.password="abcd";// Cannot do this bcz password has private access. We have to access through a proper mecahnism i.e using getters.
        Acc1.setPassword("abcdef");
        System.out.println(Acc1.username +"  "+ Acc1.getPassword());
    }
}


class BankAccount{
    public String username;
    private String password;
    void setPassword(String modifiedPass){
        password=modifiedPass;
    }
    public String getPassword(){
        return password;
    }
}
