package ex_OOPs;

public class Access {
    public static void main(String[] args) {
        BankAccount1 A1 = new BankAccount1();
        A1.username="mwa";
        A1.setPassword("qwerty");
        System.out.println("Your Username is "+A1.username);
        System.out.println("Your Password is "+A1.getPassword());
    }
}

class BankAccount1{
    public String username;
    private String password;

    void setPassword(String newPassword){
        this.password=newPassword;
    }

    public String getPassword(){
        return this.password;
    }
}
