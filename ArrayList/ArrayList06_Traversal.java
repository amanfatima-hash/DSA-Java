import java.util.ArrayList;

public class ArrayList06_Traversal {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double average = (double) sum / numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
