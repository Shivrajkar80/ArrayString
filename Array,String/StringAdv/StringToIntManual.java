public class StringToIntManual {
   public static void main(String[] args) {
        String str = "1234";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }

        System.out.println("Converted number: " + num);
    }
}
