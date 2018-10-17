package hashmapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put(null,null);
        map.put("sekhar","Reddy");
        map.put("sekhar","Reddy");

        map.keySet().stream().forEach(System.out::print);
    }
}
