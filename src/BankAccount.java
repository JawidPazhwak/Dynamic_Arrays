import java.util.Random;

public class BankAccount{
    public String userName;
    public int accountNumber;
    public String password;

    public BankAccount(String name, String password){
        userName = name;
        this.password = password;
        Random random = new Random();
        this.accountNumber = random.nextInt(10);
        System.out.println(userName + " account is created");  
    }
    public void showinfo(){
        System.out.println("Name: " + userName + "\nPassword: " + password + "\nAccount Number: " + accountNumber);
    }

}