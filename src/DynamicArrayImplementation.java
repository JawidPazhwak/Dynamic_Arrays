public class DynamicArrayImplementation{
    public String names[];
    public int size;
    public DynamicArrayImplementation(){
        names = new String[3];
        size = 0;
    }
    public void add(String n){
        if(size == names.length){
            grow();
        }
        names[size] = n;
        System.out.println(n + " added");
        size ++;
    }
    public void show(){
        System.out.println("Elements: ");
        for(int i = 0; i < size; i ++){
            System.out.println(names[i]);
        }
    }
    public void grow(){
        String[] bigger = new String[names.length * 2];
        for(int i = 0; i < names.length; i ++){
            bigger[i] = names[i];
        }
        names = bigger;
    }
}