import java.util.Arrays;

public class SortChars {
    public static void main(String[] args) {
        String str = "banana";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted: " + new String(arr));
    }
}
