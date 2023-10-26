package J_Collection;

import java.util.HashMap;
import java.util.Map;

public class J_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "89");
        map.put(6, "6");
        map.put(7, "7");
        map.replace(7, "70");
//        map.remove(6);
        System.out.println(map.get(6));


    }
}
