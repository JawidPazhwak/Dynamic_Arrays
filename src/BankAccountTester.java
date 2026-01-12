public class BankAccountTester {
    public static void main(String[] args){
        BankAccount a = new BankAccount("A", "abc");
        BankAccount b = new BankAccount("A", "abc");
        BankAccount c = new BankAccount("A", "abc");
        BankAccount d = new BankAccount("A", "abc");
        UserManagment u = new UserManagment();
        u.add(a);
        u.add(b);
        u.add(c);
        u.add(d);
        b.showinfo();
        u.showusers();
    }
}
