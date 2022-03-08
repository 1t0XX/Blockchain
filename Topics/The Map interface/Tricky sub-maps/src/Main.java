import java.util.*;
class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        TreeMap<Integer, String> target = new TreeMap<>(Comparator.reverseOrder());
        if (map.firstKey() % 2 != 0) {
            Integer endKey = map.firstKey() + 4;
            for (Integer key : map.keySet()) {
                if (key <= endKey) {
                    target.put(key, map.get(key));
                } else {
                    break;
                }
            }
        } else {
            Integer startKey = map.lastKey() - 4;
            for (Integer key : map.keySet()) {
                if (key >= startKey) {
                    target.put(key, map.get(key));
                }
            }
        }
        return target;
    }
}
/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });
        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}