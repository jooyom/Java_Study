import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Rascal", 97);
        map.put("Envyy", 00);
        map.put("Morgan", 01);
        map.put("Berserker", 03);

        System.out.println("총 Entry 수: " + map.size());
        System.out.println("\tEnvyy: " + map.get("Envyy"));
        System.out.println("\tRascal: " + map.get("Rascal"));
        System.out.println("\tMorgan: " + map.get("Morgan"));
        System.out.println("\tBerserker: " + map.get("Berserker"));

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }



    }
}
