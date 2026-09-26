import java.util.ArrayList;

public class ArrayList07_StudentMark {
    public static void main(String args[]) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(20);
        marks.add(80);
        marks.add(60);
        marks.add(50);
        marks.add(45);
        marks.add(100);
        marks.add(10);
        marks.add(70);
        marks.add(95);

        // Display
        System.out.println("Marks of student:");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Student " + (1 + i) + " : " + marks.get(i));
        }

        // Calculate Total
        int total = 0;
        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }
        System.out.println("Total : " + total);

        // Average
        double average;
        average = (double) total / marks.size();
        System.out.println("Average Mark : " + average);

        // Highest Mark
        int highest = marks.get(0);
        for (int i = 0; i < marks.size(); i++) {
            if (highest < marks.get(i)) {
                highest = marks.get(i);
            }
        }
        System.out.println("Highest Marks: " + highest);

        // Lowest Marks
        int lowest = marks.get(0);
        for (int i = 0; i < marks.size(); i++) {
            if (lowest > marks.get(i)) {
                lowest = marks.get(i);
            }
        }
        System.out.println("Lowest Marks: " + lowest);

        // number of passed and failed student
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) > 50) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("Passed Student : " + passed);
        System.out.println("Failed Student : " + failed);
    }

}