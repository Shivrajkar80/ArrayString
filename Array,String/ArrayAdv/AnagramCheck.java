import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
