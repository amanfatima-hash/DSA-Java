public class Array22_MissingNumber{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};
        int n = 6;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            actualSum = actualSum + numbers[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing number = " + missing);
    }
}
