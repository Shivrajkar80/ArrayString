public class CapitalizeWords {
  public static void main(String[] args) {
        String sentence = "java is awesome";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1)).append(" ");
            }
        }

        System.out.println("Capitalized: " + result.toString().trim());
    }
}
