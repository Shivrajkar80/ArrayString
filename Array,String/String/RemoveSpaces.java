public class RemoveSpaces {
   public static void main(String[] args) {
        String str = " Hello World ";
        String noSpace = str.replaceAll("\\s", "");
        System.out.println("Without spaces: " + noSpace);
    }
}
