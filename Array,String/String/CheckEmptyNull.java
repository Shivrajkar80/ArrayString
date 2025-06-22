public class CheckEmptyNull {
  public static void main(String[] args) {
        String str = "";
        if (str == null)
            System.out.println("Null");
        else if (str.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Not empty or null");
    }
}
