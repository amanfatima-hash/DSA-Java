import java.util.ArrayList;
public class ArrayList14_SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(30);
        numbers.add(70);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        System.out.println("List: " + numbers);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}