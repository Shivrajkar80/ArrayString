public class CharFrequency {
  public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                count++;

        System.out.println("Frequency of '" + ch + "': " + count);
    }
}
