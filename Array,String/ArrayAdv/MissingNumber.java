public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 67; // suppose 67 is missing

        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missing)
                arr[index++] = i;
        }

        int sum = 100 * (100 + 1) / 2;
        int actualSum = 0;
        for (int num : arr)
            actualSum += num;

        System.out.println("Missing number: " + (sum - actualSum));
    }
}
