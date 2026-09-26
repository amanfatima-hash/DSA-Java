public class Array15_CopyArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] copy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        System.out.println("Copied Array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
