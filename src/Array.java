import java.util.Scanner;
public class Array{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of your array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        add(arr);
        System.out.println();
        show(arr);
        delete(arr);
        System.out.println("After deletion: ");
        show(arr);

        
    
    }
    public static void add(int[]arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i ++){          
            if(arr[i]== 0){
                System.out.print("Enter your number: ");
                int a = sc.nextInt();
                arr[i] = a;
                System.out.println(a + " added");
            }
        }
    }
    public static void show(int[] arr){
        System.out.println("Output: ");
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 0){
                continue;
            }
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+ ", ");
        }
    }
        System.out.println();
        
    }
    public static void delete(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to delete: ");
        int a = sc.nextInt();
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == a){
                arr[i] = 0;
            }
        }
        System.out.println(a + " is deleted");

    }
}