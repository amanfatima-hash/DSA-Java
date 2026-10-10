package Task_02;
import java.util.Scanner;
public class Q1_TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = null;
        int choice;
        do {
            System.out.println("\n===== 2D ARRAY MENU =====");
            System.out.println("1. Create and Input 2D Array");
            System.out.println("2. Display 2D Array");
            System.out.println("3. Sum of All Elements");
            System.out.println("4. Find Largest Element");
            System.out.println("5. Find Smallest Element");
            System.out.println("6. Search an Element");
            System.out.println("7. Sum of Each Row");
            System.out.println("8. Sum of Each Column");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of rows: ");
                    int rows = input.nextInt();

                    System.out.print("Enter number of columns: ");
                    int cols = input.nextInt();

                    if (rows <= 0 || cols <= 0) {
                        System.out.println(
                            "Rows and columns must be positive!"
                        );
                        break;
                    }

                    arr = new int[rows][cols];

                    System.out.println("Enter array elements:");

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(
                                "Enter element [" + i + "][" + j + "]: "
                            );
                            arr[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("2D Array created successfully!");
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    System.out.println("Your 2D Array:");

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    int sum = 0;

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum += arr[i][j];
                        }
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    int largest = arr[0][0];

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (arr[i][j] > largest) {
                                largest = arr[i][j];
                            }
                        }
                    }

                    System.out.println("Largest element = " + largest);
                    break;

                case 5:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    int smallest = arr[0][0];

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (arr[i][j] < smallest) {
                                smallest = arr[i][j];
                            }
                        }
                    }

                    System.out.println("Smallest element = " + smallest);
                    break;

                case 6:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    System.out.print("Enter element to search: ");
                    int key = input.nextInt();
                    boolean found = false;

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (arr[i][j] == key) {
                                System.out.println(
                                    "Found at row " + i +
                                    ", column " + j
                                );
                                found = true;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 7:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    for (int i = 0; i < arr.length; i++) {
                        int rowSum = 0;

                        for (int j = 0; j < arr[i].length; j++) {
                            rowSum += arr[i][j];
                        }

                        System.out.println(
                            "Sum of row " + i + " = " + rowSum
                        );
                    }
                    break;

                case 8:
                    if (arr == null) {
                        System.out.println("Create the array first!");
                        break;
                    }

                    for (int j = 0; j < arr[0].length; j++) {
                        int colSum = 0;

                        for (int i = 0; i < arr.length; i++) {
                            colSum += arr[i][j];
                        }

                        System.out.println(
                            "Sum of column " + j + " = " + colSum
                        );
                    }
                    break;

                case 9:
                    System.out.println("Program exited successfully!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please enter 1 to 9."
                    );
            }

        } while (choice != 9);

        input.close();
    }
}

