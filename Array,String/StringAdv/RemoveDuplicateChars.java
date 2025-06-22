import java.util.LinkedHashSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray())
            set.add(c);

        for (char c : set)
            result.append(c);

        System.out.println("Without duplicates: " + result);
    }
}
