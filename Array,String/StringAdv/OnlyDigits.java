public class OnlyDigits {
  public static void main(String[] args) {
        String str = "123456";
        boolean onlyDigits = str.matches("\\d+");
        System.out.println("Only digits: " + onlyDigits);
    }
}
