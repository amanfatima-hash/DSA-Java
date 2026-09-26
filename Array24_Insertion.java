public class Array24_Insertion {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int index = 2;
        int value = 25;
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = numbers[i];
        }
        newArray[index] = value;
        for (int i = index; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
