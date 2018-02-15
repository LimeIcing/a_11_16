import java.util.HashMap;
import java.util.Map;

public class Main16 {

    /*
    Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true
    if no two keys map to the same value. For example,
    {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567} should return false , but
    {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567} should return true . The empty map is considered
    1-to-1 and returns true .
     */

    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        a.put("Marty","206-9024");
        a.put("Hawking","123-4567");
        a.put("Smith","949-0504");
        a.put("Newton","123-4567");
        System.out.println(is1to1(a));

        HashMap<String, String> b = new HashMap<>();
        b.put("Marty","206-9024");
        b.put("Hawking","555-1234");
        b.put("Smith","949-0504");
        b.put("Newton","123-4567");
        System.out.println(is1to1(b));
    }

    public static boolean is1to1(Map<String, String> map) {
        // Method was copy/pasted from Exercise 13. Why are these two exercises identical?
        if (map.isEmpty()) {
            return true;
        }

        for (String key0:map.keySet()) {
            for (String key1:map.keySet()) {
                if (!key0.equals(key1) && map.get(key0).equals(map.get(key1))) {
                    return false;
                }
            }
        }
        return true;
    }
}
