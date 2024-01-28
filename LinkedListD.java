package Tree;
import java.util.Scanner;

class Node5 {
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lst1 {
    Node5 head;

    public Lst1() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void append(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node5 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node5 prev = null;
        Node5 current = head;
        Node5 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to display the linked list
    public void display() {
        Node5 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lst1 lst = new Lst1();

        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            lst.append(value);
        }

        // Displaying the linked list
        System.out.println("Linked List Values: ");
        lst.display();

        // Reverse the linked list
        System.out.println("Reversed Linked List Values: ");
        lst.reverse();
        lst.display();
        sc.close();
    }
}