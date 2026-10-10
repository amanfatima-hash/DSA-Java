import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList15_StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n------------Student Management System --------------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Display Size");
            System.out.println("7. Sort Students");
            System.out.println("8. Reverse Students");
            System.out.println("9. Clear All Students");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    students.add(name);
                    System.out.println("Student added .");
                    break;
                case 2:
                    System.out.println("Students: " + students);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = input.nextLine();
                    if (students.contains(searchName)) {
                        System.out.println("Student found");
                        System.out.println("Index: "
                                + students.indexOf(searchName));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = input.nextInt();
                    input.nextLine();
                    if (updateIndex >= 0 && updateIndex < students.size()) {
                        System.out.print("Enter new name: ");
                        String newName = input.nextLine();
                        students.set(updateIndex, newName);
                        System.out.println("Student updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = input.nextInt();
                    if (removeIndex >= 0 && removeIndex < students.size()) {
                        students.remove(removeIndex);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 7:
                    Collections.sort(students);
                    System.out.println("Students sorted successfully.");
                    break;

                case 8:
                    Collections.reverse(students);
                    System.out.println("Students reversed successfully.");
                    break;

                case 9:
                    students.clear();
                    System.out.println("All students removed.");
                    break;

                case 10:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        input.close();
    }
}
