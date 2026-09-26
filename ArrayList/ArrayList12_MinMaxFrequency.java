import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12_MinMaxFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);

        System.out.println("List: " + numbers);
        // Maximum and Minimum
        int maximum = Collections.max(numbers);
        int minimum = Collections.min(numbers);

        // Frequency
        int frequency10 = Collections.frequency(numbers, 10);
        int frequency20 = Collections.frequency(numbers, 20);
        int frequency50 = Collections.frequency(numbers, 50);

        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum Number: " + minimum);
        System.out.println("Frequency of 10: " + frequency10);
        System.out.println("Frequency of 20: " + frequency20);
        System.out.println("Frequency of 50: " + frequency50);
    }
}
