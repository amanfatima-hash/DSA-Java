import java.util.ArrayList;

public class ArrayList02_AccessElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add Elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // First Element
        System.out.println("First Element: " + numbers.get(0));

        // Display Last Element
        System.out.println("Last Element: " + numbers.get(numbers.size() - 1));

        // Display element at index 2
        System.out.println("Element at index 2: " + numbers.get(2));

        // Display element at index 3
        System.out.println("Element at index 3: " + numbers.get(3));
    }
}