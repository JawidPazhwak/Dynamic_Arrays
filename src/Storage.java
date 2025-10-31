import java.util.ArrayList;
public class Storage{
    // corrected field name from 'obejct' to 'objects'
    public ArrayList<String> objects = new ArrayList<>();
    public ArrayList<Integer> price = new ArrayList<>();
    public String name;

    public Storage(String n){
        name = n;
        System.out.println("Storage " + name + " is created");
    }

}
