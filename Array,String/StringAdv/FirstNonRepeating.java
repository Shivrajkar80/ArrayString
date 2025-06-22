import java.util.LinkedHashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}
