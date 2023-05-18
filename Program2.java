package shehjadsirAssignment.WednesdayAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Program2 {
    public static List<String> getValues(Map<String, String> map) {
       Map<String, String> sortedMap = new TreeMap<>(map);
        List<String> values = new ArrayList<>();

        for (String key : sortedMap.keySet()) {
            values.add(sortedMap.get(key));
        }
        return values;
    }
    	public static void main(String[] args) {
        Map<String, String> map1 = Map.of("a", "1", "b", "2", "c", "3");
        List<String> values1 = getValues(map1);
        System.out.println(values1);

        Map<String, String> map2 = Map.of("a", "Apple", "b", "Microsoft", "c", "Google");
        List<String> values2 = getValues(map2);
        System.out.println(values2);
    }

}
