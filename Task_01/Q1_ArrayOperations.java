import java.util.Scanner;
public class Q1_ArrayOperations {
    static int[] arr;
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    // 1. Add value at the end
    static void add(int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return;
        }
        arr[size] = value;
        size++;
        System.out.println("Value added successfully.");
    }

    // 2. Insert value at specific index
    static void insert(int index, int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return ;
        }

        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
        System.out.println("Value inserted successfully.");
    }

    // 3. Fill array
    static void fillArray() {
        while (size < arr.length) {
            System.out.print("Enter value (or -1 to stop): ");
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            arr[size] = value;
            size++;
        }
        System.out.println("Array filling completed.");
    }

    // 4. Delete last element
    static void deleteLast() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        size--;
        System.out.println("Last element deleted.");
    }

    // 5. Delete by index
    static void deleteByIndex(int index) {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element deleted successfully.");
    }

    // 6. Display array
    static void display() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 7. Search value
    static void search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println("Value does not exist.");
    }

    // 8. Get value at index
    static void getValue(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.println("Value at index " + index + " = " + arr[index]);
    }

    // 9. Replace / Update value
    static void update(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        arr[index] = value;
        System.out.println("Value updated successfully.");
    }
    // 10. Show size
    static void showSize() {
        System.out.println("Current size: " + size);
    }
    public static void main(String[] args) {
        System.out.print("Enter array capacity: ");
        int capacity = sc.nextInt();
        arr = new int[capacity];
        int choice;
        do {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    add(value);
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insert(index, value);
                    break;
                case 3:
                    fillArray();
                    break;
                case 4:
                    deleteLast();
                    break;
                case 5:
                    System.out.print("Enter index to delete: ");
                    index = sc.nextInt();
                    deleteByIndex(index);
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    search(value);
                    break;
                case 8:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    getValue(index);
                    break;
                case 9:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();
                    update(index, value);
                    break;
                case 10:
                    showSize();
                    break;
                case 11:
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 11);
        sc.close();
    }
}