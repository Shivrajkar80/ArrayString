public class CompareStrings {
   public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");

        System.out.println("Using == : " + (a == b));           // false (different objects)
        System.out.println("Using .equals(): " + a.equals(b));  // true (same value)
    }
}
