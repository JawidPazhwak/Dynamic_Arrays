import java.util.ArrayList;
public class DynamicArray{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

        price.add(10);
        price.add(20);
        price.add(30);

        System.out.println(fruits);
        fruits.set(0, "lemon");
        System.out.println("lemon is added: " + fruits);
        System.out.println("Prints only banana: " + fruits.get(1));
        fruits.remove("banana");
        System.out.println("banana is removed: " + fruits);
        System.out.println("Size of the array: " + fruits.size());

        for(String f : fruits){
            System.out.println(f);
        }

        System.out.println("Prices: " + price);
        price.remove(0);
        System.out.println("after removing 10: " + price);
        price.set(0, 50);
        System.out.println("after assigning index 0 the value 50: " + price);
        System.out.println("getting the price of index 1: " + price.get(1));

        for(int p : price){
            System.out.println(p);
        }


    }
}