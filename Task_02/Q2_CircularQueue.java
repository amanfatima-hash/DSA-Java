package Task_02;
import java.util.Scanner;
public class Q2_CircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    Q2_CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check whether queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check whether queue is full
    boolean isFull() {
        return size == capacity;
    }

    // Insert element
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Circular Queue is full!");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        System.out.println(value + " inserted successfully.");
    }

    // Remove element
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return;
        }

        int removed = queue[front];
        System.out.println("Removed element: " + removed);

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }

    // Show front element
    void peek() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    // Show size
    void showSize() {
        System.out.println("Current queue size: " + size);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the capacity of Circular Queue: ");
        int capacity = input.nextInt();

        while (capacity <= 0) {
            System.out.print("Capacity must be positive. Enter again: ");
            capacity = input.nextInt();
        }

        Q2_CircularQueue cq = new Q2_CircularQueue(capacity);

        int choice;

        do {
            System.out.println("\n===== CIRCULAR QUEUE MENU =====");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Show Queue Size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = input.nextInt();
                    cq.enqueue(value);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.peek();
                    break;

                case 4:
                    cq.display();
                    break;

                case 5:
                    if (cq.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    if (cq.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;

                case 7:
                    cq.showSize();
                    break;

                case 8:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        input.close();
    }
}

