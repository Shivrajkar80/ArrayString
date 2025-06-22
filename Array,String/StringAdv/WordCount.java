import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is simple and Java is powerful";
        String[] words = sentence.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
