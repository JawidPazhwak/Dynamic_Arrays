public class UserManagment {
    public BankAccount[] users = new BankAccount[3];
    public BankAccount[] newuser;
    int userSize = 0;

    public void add(BankAccount b){
        for(int i = 0; i < users.length; i ++){
            if(userSize == users.length){
                grow();
            }
            if(users[i] == null){                
                users[i] = b;
                userSize ++;
                System.out.println(b.userName + " added");
                break;
            }
        }
    }
    public void grow(){
        newuser = new BankAccount[userSize * 2];
        for(int i = 0; i < users.length; i ++){
            users[i] = newuser[i];
        }
        users = newuser;
        System.out.println("Memory updated");
    }
    public void delete(BankAccount b){
        boolean flag = false;
        if(newuser[0] == null){
            for(int i = 0; i < users.length; i ++){
                if(users[i].equals(b)){
                    flag = true;
                    users[i] = null;
                    System.out.println(b.userName + " deleted");
                    break;
                }
            }
            if(flag){
                System.out.println(b.userName + " not found");
            }
        }
        else{
            for(int j = 0; j < newuser.length; j ++){
                if(newuser[j].equals(b)){
                    flag = true;
                    newuser[j] = null;
                    System.out.println(b.userName + " deleted");
                    break;
                }
            }
            if(flag){
                System.out.println(b.userName + " not found");
            }
        }
    }
    public void showusers(){
        if(users[0] == null){
            for(int i = 0; i < users.length; i ++){
                System.out.println(users[i].userName);
            }
        }
        for(int j = 0; j < newuser.length; j ++ ){
            if(newuser[j] == null){
                System.out.println("Empty");
            }
            else{
                System.out.println(newuser[j].userName);
            }
        
        }
    }
}
