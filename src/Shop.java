import java.util.Scanner;
public class Shop{
    public static void main(String[] args){
        Storage st = new Storage("1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your items:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i <= n; i ++){
            System.out.println("Enter the name: ");
            String obj = sc.nextLine();
            st.objects.add(obj);
            System.out.println(obj + " is added");
        }
        System.out.println(st.objects.size() + " item added");
        show(st);
        delete(st);
        System.out.println("After removing: ");
        show(st);
    }
    public static void show(Storage st){
        System.out.println("Items: ");
        for(String o : st.objects){
            System.out.println(o);
        }
    }
    public static void delete(Storage st){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which item do you want to remove: ");
        String item = sc.nextLine();    
        boolean found = false;
        for(String s : st.objects){
            if(s.equals(item)){
                found = true;
                st.objects.remove(item);
                System.out.println(item + " removed");
                break;
            }
        }
        if(!found){
            System.out.println("Item not found");
    }
        System.out.println();
    }
}