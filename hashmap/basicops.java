import java.util.HashMap;
import java.util.Map;
public class basicops{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();  //creating hashmap

        map.put("apple",10); //adding key-value pairs to the map
        map.put("mango",20);
        map.put("banana",30);

        System.out.println("Hashmap "+map); //printing whole map

        int mangocount=map.get("mango"); //get the value of specific key
        System.out.println("mango count: "+mangocount);

        if (map.containsKey("banana")){  // Check if a key exists
            System.out.println("banana is in the map");
        }

        map.remove("apple"); //Remove a key-value pair
        System.out.println("After removing apple: " + map);
    }
}