import java.util.Scanner;
public class Q3_QueueOperations {
    static int[] queue;
    static int front = 0;
    static int rear = -1;
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    // Enqueue
    static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
        System.out.println("Value enqueued.");
    }

    // Dequeue
    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int value = queue[front];
        // Shift all elements left
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
        System.out.println("Dequeued value: " + value);
    }

    // Display
    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue (Front to Rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    // Size
    static int getSize() {
        return size;
    }
    // isEmpty
    static boolean isEmpty() {
        return size == 0;
    }
    // isFull
    static boolean isFull() {
        return size == queue.length;
    }
    public static void main(String[] args) {
        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();
        queue = new int[capacity];
        int choice;
        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Queue size: " + getSize());
                    break;
                case 5:
                    System.out.println("Is queue empty? " + isEmpty());
                    break;
                case 6:
                    System.out.println("Is queue full? " + isFull());
                    break;
                case 7:
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
        sc.close();
    }
}
