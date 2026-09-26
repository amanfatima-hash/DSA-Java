public class Array25_Deletion {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int index = 2;
        int[] newArray = new int[numbers.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = numbers[i];
        }
        for (int i = index; i < numbers.length - 1; i++) {
            newArray[i] = numbers[i + 1];
        }
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}