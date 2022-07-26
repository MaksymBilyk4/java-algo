package HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, null);
        map.put(null, 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("14", 14);
        System.out.println(map);
        System.out.println(map.get("99"));
    }
}
